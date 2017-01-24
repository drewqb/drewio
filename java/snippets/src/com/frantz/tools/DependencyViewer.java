package com.frantz.tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.ZestStyles;
import org.eclipse.zest.layouts.LayoutAlgorithm;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.HorizontalTreeLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.RadialLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;

/**
 * 
 * based on code found in github/drewio requires zest/swt/draw2d see .classpath
 *
 */
public class DependencyViewer {

	private Display myDisplay;
	private Shell myShell;
	private Graph myGraph;
	private LayoutAlgorithm myLayout;
	private SashForm mySash;
	private Composite myCanvas;
	private Text myOutput;
	private OutputConsole m_Console = new OutputConsole();
	Map<String, GraphNode> m_ViewMap = new HashMap<String, GraphNode>();
	Map<String, List<String>> m_ModelMap = new HashMap<String, List<String>>();
	Properties m_prop = new Properties();

	public DependencyViewer() {
		loadProps();
	}

	String getPropFile() {
		String theDir = System.getenv("APPDATA");
		theDir += "/depview.properties";
		return theDir;
	}

	String getProp(String skey) {
		return m_prop.getProperty(skey);
	}

	void setProp(String skey, String val) {
		m_prop.setProperty(skey, val);
		saveProps();
	}

	void saveProps() {
		OutputStream output = null;

		try {

			output = new FileOutputStream(getPropFile());

			// save properties to project root folder
			m_prop.store(output, null);

		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

	void loadProps() {
		InputStream input = null;

		try 
		{
			String theFile = getPropFile();
			File f = new File(theFile);
			if(!f.exists())
			{
				f.createNewFile();
			}
			input = new FileInputStream(theFile);

			// load a properties file
			m_prop.load(input);

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void run() {
		buildUI();
		runUI();
	}

	void buildUI() {
		myDisplay = new Display();
		myShell = new Shell(myDisplay);
		myShell.setText("DependencyViewer");
		myShell.setLayout(new FillLayout());
		myShell.setSize(500, 500);
		Menu bar = new Menu(myShell, SWT.BAR);
		myShell.setMenuBar(bar);

		mySash = new SashForm(myShell, SWT.VERTICAL);
		// ToolBar tb = new ToolBar(mySash,SWT.FLAT);
		myCanvas = new Composite(mySash, SWT.NONE);
		myOutput = new Text(mySash, SWT.BORDER | SWT.READ_ONLY | SWT.V_SCROLL
				| SWT.H_SCROLL);
		myCanvas.setLayout(new FillLayout());
		// ToolItem ti = new ToolItem(tb, SWT.BORDER);
		// ti.setText("test");
		MenuItem fileItem = new MenuItem(bar, SWT.CASCADE);
		fileItem.setText("&File");
		Menu submenu = new Menu(myShell, SWT.DROP_DOWN);
		fileItem.setMenu(submenu);
		myShell.addListener(SWT.Resize, new Listener() {
			public void handleEvent(Event e) {
				if (myGraph != null)
					myGraph.setLayoutAlgorithm(myLayout, true);
			}
		});

		MenuItem openDep = new MenuItem(submenu, SWT.PUSH);
		openDep.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				openDepModel();
			}
		});
		openDep.setText("Open C++ Dependency File");
		MenuItem depFromDir = new MenuItem(submenu, SWT.PUSH);
		depFromDir.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				openDepModelFromDir();
			}
		});
		depFromDir.setText("Create C++ Dependency from Dir");
		
		MenuItem openJavaDep = new MenuItem(submenu, SWT.PUSH);
		openJavaDep.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				openJavaDepModel();
			}
		});
		openJavaDep.setText("Open Java Dependency File");
		
		MenuItem depJava = new MenuItem(submenu, SWT.PUSH);
		depJava.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				openJavaDepModelFromDir();
			}
		});
		depJava.setText("Java Dependency from Dir");
		
		final int style = LayoutStyles.NO_LAYOUT_NODE_RESIZING;
		MenuItem item = new MenuItem(submenu, SWT.PUSH);
		item.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				if (myGraph != null) {
					myLayout = new HorizontalTreeLayoutAlgorithm(
							style);
					myGraph.setLayoutAlgorithm(myLayout, true);
				}
			}
		});
		item.setText("Horizontal Layout");

		MenuItem item2 = new MenuItem(submenu, SWT.PUSH);
		item2.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				if (myGraph != null) {
					myLayout = new TreeLayoutAlgorithm(
							style);
					myGraph.setLayoutAlgorithm(myLayout, true);
				}
			}
		});
		item2.setText("Vertical Layout");
		MenuItem r = new MenuItem(submenu, SWT.PUSH);
		r.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				if (myGraph != null) {
					myLayout = new RadialLayoutAlgorithm(
							style);
					myGraph.setLayoutAlgorithm(myLayout, true);
				}
			}
		});
		r.setText("Radial Layout");

		MenuItem remUnused = new MenuItem(submenu, SWT.PUSH);
		remUnused.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				if (myGraph != null) {
					removeUnconnectedNodes(m_ViewMap);
				}
			}
		});
		remUnused.setText("Remove Unconnected Nodes");
		
		MenuItem saveImage = new MenuItem(submenu, SWT.PUSH);
		saveImage.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				if (myGraph != null) 
				{
					saveImage();
				}
			}
		});
		saveImage.setText("Save Image");
		
		
		
		mySash.setWeights(new int[] { 7, 3 });

	}

	void runUI() {
		myShell.open();
		while (!myShell.isDisposed()) {
			while (!myDisplay.readAndDispatch()) {
				myDisplay.sleep();
			}
		}
	}

	void openDepModel() {
		FileDialog dialog = new FileDialog(myCanvas.getShell(), SWT.OPEN);
		String filters[] = { "*.txt" };
		dialog.setFilterExtensions(filters);

		String theFile = dialog.open();
		String theContents = readFile(theFile);
		m_ModelMap.clear();
		m_ViewMap.clear();
		buildDepFromString(m_ModelMap, theContents);
		buildDepGraph(myCanvas);

	}
	void openJavaDepModel() {
		FileDialog dialog = new FileDialog(myCanvas.getShell(), SWT.OPEN);
		String filters[] = { "*.txt" };
		dialog.setFilterExtensions(filters);

		String theFile = dialog.open();
		String theContents = readFile(theFile);
		m_ModelMap.clear();
		m_ViewMap.clear();
		buildJavaDepFromString(m_ModelMap, theContents);
		buildDepGraph(myCanvas);
	}
	void openDepModelFromDir() {
		DirectoryDialog dialog = new DirectoryDialog(myCanvas.getShell(),
				SWT.OPEN);
		String last = getProp("lastDir");
		if(last!=null && !last.isEmpty())
		{
			dialog.setFilterPath(last);
		}
		
		String theDir = dialog.open();
		if(theDir!=null && !theDir.isEmpty())
		{
			this.setProp("lastDir", theDir);
			
			// String theCommand =
			// "C:\\Users\\drew\\Desktop\\dl\\typeit.bat C:\\Users\\drew\\Desktop\\dl\\dep.txt";
			String theCommand = "\"C:\\Program Files (x86)\\Microsoft Visual Studio 12.0\\VC\\bin\\dumpbin.exe\" /dependents /nologo "
					+ " *.dll";
	
			String theContents = runCommand(theCommand, theDir);
			m_ModelMap.clear();
			m_ViewMap.clear();
			buildDepFromString(m_ModelMap, theContents);
			buildDepGraph(myCanvas);
			
		}
	}

	void buildDepGraph(Composite parent) {
		if (myGraph != null) {
			myGraph.dispose();
			myGraph = null;
		}
		myGraph = new Graph(parent, SWT.NONE);
		

		

		buildGraphNodes(myGraph, m_ViewMap, m_ModelMap);
		buildGraphEdges(myGraph, m_ViewMap, m_ModelMap);

		myGraph.setScrollBarVisibility(FigureCanvas.ALWAYS);
		myGraph.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Object theNode = e.item;
				if (theNode instanceof GraphNode) {
					GraphNode gn = (GraphNode) theNode;
					for (Object o : gn.getGraphModel().getConnections()) {
						GraphConnection gc = (GraphConnection) o;
						gc.setLineColor(ColorConstants.lightGray);
					}
					for (Object o : gn.getSourceConnections()) {
						if (o instanceof GraphConnection) {
							GraphConnection gc = (GraphConnection) o;
							gc.setLineColor(ColorConstants.red);
						}
					}
					for (Object o : gn.getTargetConnections()) {
						if (o instanceof GraphConnection) {
							GraphConnection gc = (GraphConnection) o;
							gc.setLineColor(ColorConstants.darkGreen);
						}
					}

				}

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub

			}

		});
		myGraph.setLayoutAlgorithm(new TreeLayoutAlgorithm(
				LayoutStyles.NO_LAYOUT_NODE_RESIZING),true);
		myCanvas.layout();

	}

	void removeUnconnectedNodes(Map<String, GraphNode> theMap) {
		for (GraphNode gn : theMap.values()) {
			if (gn.getSourceConnections().size() == 0
					&& gn.getTargetConnections().size() == 0) {
				if (!gn.isDisposed())
					gn.dispose();
			}
		}
	}

	public void buildGraphNodes(Graph theGraph, Map<String, GraphNode> theMap,
			Map<String, List<String>> bucket) {
		for (String t : bucket.keySet()) {
			GraphNode refNode = new GraphNode(theGraph,
					ZestStyles.NODES_CACHE_LABEL, t);
			refNode.setBackgroundColor(ColorConstants.lightBlue);
			refNode.setData(t);
			refNode.setSize(120., 30.);
			theMap.put(t, refNode);

		}
	}

	public void buildGraphEdges(Graph theGraph, Map<String, GraphNode> theMap,
			Map<String, List<String>> bucket) {
		for (String t : bucket.keySet()) {
			GraphNode gFrom = theMap.get(t);
			for (String edge : bucket.get(t)) {
				GraphNode gTo = theMap.get(edge);
				if (gFrom != null && gTo != null) {
					new GraphConnection(theGraph,
							ZestStyles.CONNECTIONS_DIRECTED, gFrom, gTo);
				}
			}
		}

	}
	String collectAllJava(String theDir )
	{
		List<File> theFoundFiles = new ArrayList<File>();
		
		Utils.collectAllFilesByName(new File(theDir), "build.gradle", theFoundFiles);
		StringBuffer b = new StringBuffer();
		for(File theFile : theFoundFiles)
		{
			String thePath=theFile.getAbsolutePath();
			if(thePath.toLowerCase().indexOf("3pp")<0)
			{
				String theCommand = "findstr /C:\"" + "compile project" + "\"" + " " + thePath;
				
				String theTemp = Utils.runCommand(theCommand, theDir);
				String theName = thePath.substring(0, thePath.length()- "/build.gradle".length());
				//theName = theName.substring(0, theName.length() - "/build.gradle".length());
				int idx = theName.lastIndexOf('\\');
				theName = theName.substring(idx+1);
				theName = theName.toLowerCase()+":";
				b.append(theName);
				b.append('\n');
				
				b.append(theTemp);
			}
		}
		return b.toString();

	}
	void openJavaDepModelFromDir() {
		DirectoryDialog dialog = new DirectoryDialog(myCanvas.getShell(),
				SWT.OPEN);
		String last = getProp("lastDir");
		if(last!=null && !last.isEmpty())
		{
			dialog.setFilterPath(last);
		}
		
		String theDir = dialog.open();
		if(theDir!=null && !theDir.isEmpty())
		{
			this.setProp("lastDir", theDir);
			StringBuffer b = new StringBuffer();
			// super slow since look in too many dirs
			 b.append(collectAllJava(theDir));
			String theContents = b.toString();
			m_ModelMap.clear();
			m_ViewMap.clear();
			buildJavaDepFromString(m_ModelMap, theContents);
			buildDepGraph(myCanvas);
			
		}
	}
	public void buildJavaDepFromString(Map<String, List<String>> m_Bucket,	String theInput) {
		String tok1 = ":";
		String tok2 = "compile project(':";
		Scanner scanner = new Scanner(theInput);
		List<String> theList = null;
		while (scanner.hasNextLine()) {
			String theLine = scanner.nextLine();
			theLine = theLine.trim();
			theLine = theLine.toLowerCase();
			
			if (theLine.endsWith(tok1)) {
				String theKey = theLine.substring(0, theLine.length()-1);
				int idx = theKey.indexOf('\\');
				if(idx>0)
				{
					theKey = theKey.substring(idx+1);
				}
				theList = new ArrayList<String>();

				m_Bucket.put(theKey, theList);

			} else if (theLine.startsWith(tok2) && theList != null) {

				theLine = theLine.substring(tok2.length());
				theLine = theLine.substring(0, theLine.length()-2);
				theLine = theLine.toLowerCase();
				theList.add(theLine);
			}
		}
		scanner.close();
	}
	public void buildDepFromString(Map<String, List<String>> m_Bucket,
			String theInput) {
		String tok1 = "Dump of file ";
		Scanner scanner = new Scanner(theInput);
		List<String> theList = null;
		while (scanner.hasNextLine()) {
			String theLine = scanner.nextLine();
			theLine = theLine.trim();
			if (theLine.startsWith(tok1)) {
				String theKey = theLine.substring(tok1.length());
				theKey = theKey.substring(0, theKey.length() - 4);
				theList = new ArrayList<String>();

				m_Bucket.put(theKey, theList);

			} else if (theLine.endsWith(".dll") && theList != null) {

				theLine = theLine.substring(0, theLine.length() - 4);
				theList.add(theLine);
			}
		}
		scanner.close();
	}

	public String readFile(String theFile) {
		StringBuilder bld = new StringBuilder();
		BufferedReader theInFile = null;
		try {
			theInFile = new BufferedReader(new FileReader(theFile));
			String theLine;
			while ((theLine = theInFile.readLine()) != null) {
				bld.append(theLine);
				bld.append('\n');
			}
		} catch (Exception e) {
		} finally {
			if (theInFile != null) {
				try {
					theInFile.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());

				}
			}
		}
		return bld.toString();
	}
	void saveImage()
	{
	
	GC gc = new GC(myGraph);
	Rectangle bounds = myGraph.getBounds();
	Image image = new Image(myDisplay, bounds);
	try {
	    gc.copyArea(image, 0, 0);
	    ImageLoader imageLoader = new ImageLoader();
	    imageLoader.data = new ImageData[] { image.getImageData() };
	    String theDir = System.getenv("APPDATA");
		theDir += "/depviewout.png";
	    imageLoader.save(theDir, SWT.IMAGE_PNG);
	} finally {
	    image.dispose();
	    gc.dispose();
	}
	}
	String runCommand(String command, String theDir) {
		StringBuffer theOut = new StringBuffer();

		Process theProc;
		try {
			theProc = Runtime.getRuntime()
					.exec(command, null, new File(theDir));
			BufferedReader theReader = new BufferedReader(
					new InputStreamReader(theProc.getInputStream()));

			String theLine;
			while ((theLine = theReader.readLine()) != null) {
				theOut.append(theLine + "\n");
			}

		} catch (Exception e) {
			m_Console.print(e.getMessage());
		}

		return theOut.toString();

	}

	/*
	 * A simple object we pass to the script environment so that we can print
	 * things to the UI console control using output.print("Hello");
	 */

	public class OutputConsole {
		public void print(String msg) {
			if (msg == null)
				return;
			myOutput.setText(myOutput.getText() + msg + "\r\n");
		}

		public void clear() {
			myOutput.setText("");
		}
	}

	public static void main(String[] args) {
		DependencyViewer e2 = new DependencyViewer();
		e2.run();

	}

}
