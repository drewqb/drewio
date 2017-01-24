package drewio_swt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
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

public class DepViewer {

	private Display myDisplay  ;
	private Shell myShell;
	private Graph myGraph;
	private LayoutAlgorithm myLayout;
	private SashForm mySash;
	private Composite myCanvas;
	private Text myOutput;
	private OutputConsole m_Console = new OutputConsole();
	Map<String, GraphNode> m_ViewMap = new HashMap<String, GraphNode>();
	Map<String,List<String>> m_ModelMap = new HashMap<String,List<String>>();
	public DepViewer()
	{
		
	}
	public void run()
	{
		buildUI();
		runUI();
	}
	void buildUI()
	{
		myDisplay = new Display();
		myShell = new Shell(myDisplay);
		myShell.setText("DrewIO.DependencyViewer");
		myShell.setLayout(new FillLayout());
		myShell.setSize(500, 500);
		Menu bar = new Menu (myShell, SWT.BAR);
		myShell.setMenuBar (bar);

		mySash = new SashForm(myShell, SWT.VERTICAL);
		myCanvas = new Composite(mySash, SWT.NONE);
		myOutput = new  Text(mySash, SWT.BORDER | SWT.READ_ONLY | SWT.V_SCROLL | SWT.H_SCROLL);
		myCanvas.setLayout(new FillLayout());

		MenuItem fileItem = new MenuItem (bar, SWT.CASCADE);
		fileItem.setText ("&File");
		Menu submenu = new Menu (myShell, SWT.DROP_DOWN);
		fileItem.setMenu (submenu);
		myShell.addListener (SWT.Resize,  new Listener () 
		{
			public void handleEvent (Event e) 
			{
				if(myGraph!=null)myGraph.setLayoutAlgorithm(myLayout,true);
			}
		});
		
		MenuItem openDep = new MenuItem (submenu, SWT.PUSH);
		openDep.addListener (SWT.Selection, new Listener () 
		{
			public void handleEvent (Event e) 
			{
				openDepModel();
			}
		});
		openDep.setText ("Open Dependency File");
		MenuItem depFromDir = new MenuItem (submenu, SWT.PUSH);
		depFromDir.addListener (SWT.Selection, new Listener () 
		{
			public void handleEvent (Event e) 
			{
				openDepModelFromDir();
			}
		});
		depFromDir.setText ("Create Dependency from Dir");
		MenuItem item = new MenuItem (submenu, SWT.PUSH);
		item.addListener (SWT.Selection, new Listener () 
		{
			public void handleEvent (Event e) 
			{
				if(myGraph!=null)
				{
					myLayout=new HorizontalTreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING);
					myGraph.setLayoutAlgorithm(myLayout, true);
				}
			}
		});
		item.setText ("Horizontal Layout");

		MenuItem item2 = new MenuItem (submenu, SWT.PUSH);
		item2.addListener (SWT.Selection, new Listener () 
		{
			public void handleEvent (Event e) 
			{
				if(myGraph!=null)
				{
					myLayout=new TreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING);
					myGraph.setLayoutAlgorithm(myLayout, true);
				}
			}
		});
		item2.setText ("Vertical Layout");
		MenuItem r = new MenuItem (submenu, SWT.PUSH);
		r.addListener (SWT.Selection, new Listener () 
		{
			public void handleEvent (Event e) 
			{
				if(myGraph!=null)
				{
					myLayout=new RadialLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING);
					myGraph.setLayoutAlgorithm(myLayout, true);
				}
			}
		});
		r.setText ("Radial Layout");
		
		MenuItem remUnused = new MenuItem (submenu, SWT.PUSH);
		remUnused.addListener (SWT.Selection, new Listener () 
		{
			public void handleEvent (Event e) 
			{
				if(myGraph!=null)
				{
					removeUnconnectedNodes(m_ViewMap);
				}
			}
		});
		remUnused.setText ("Remove Unconnected Nodes");
		mySash.setWeights(new int[]{7, 3});

	}
	void runUI()
	{
		myShell.open();
		while (!myShell.isDisposed()) 
		{
			while (!myDisplay.readAndDispatch()) {
				myDisplay.sleep();
			}
		}
	}
	
	void openDepModel()
	{
		FileDialog dialog =  new FileDialog(myCanvas.getShell(), SWT.OPEN);
		String filters[]={"*.txt"};
		dialog.setFilterExtensions(filters);

		
		String theFile = dialog.open();
		String theContents=readFile(theFile);
		buildDepGraph(myCanvas,theContents);
	}
	void openDepModelFromDir()
	{
		DirectoryDialog dialog =  new DirectoryDialog(myCanvas.getShell(), SWT.OPEN);
		String theDir = dialog.open();
		String theCommand = "C:\\Users\\drew\\Desktop\\dl\\typeit.bat C:\\Users\\drew\\Desktop\\dl\\dep.txt";
		String theContents= runCommand(theCommand);
		
		
		buildDepGraph(myCanvas,theContents);
	}
	void buildDepGraph(Composite parent, String theContents)
	{
		if(myGraph!=null)
		{
			myGraph.dispose();
			myGraph=null;
		}
		myGraph= new Graph(parent, SWT.NONE);
		m_ModelMap.clear();
		m_ViewMap.clear();
		
		buildDepFromString(m_ModelMap, theContents);
		
		
		buildGraphNodes(myGraph, m_ViewMap, m_ModelMap);
		buildGraphEdges(myGraph, m_ViewMap, m_ModelMap);
		
		myGraph.setScrollBarVisibility(FigureCanvas.ALWAYS);
		myGraph.addSelectionListener(new SelectionListener() 
		{
			@Override
			public void widgetSelected(SelectionEvent e) {
				Object theNode = e.item;
				if(theNode instanceof GraphNode)
				{
					GraphNode gn = (GraphNode)theNode;
					for(Object o : gn.getGraphModel().getConnections())
					{
						GraphConnection gc = (GraphConnection)o;
						gc.setLineColor(ColorConstants.lightGray);
					}
					for(Object o : gn.getSourceConnections())
					{
						if(o instanceof GraphConnection)
						{
							GraphConnection gc = (GraphConnection)o;
							gc.setLineColor(ColorConstants.red);
						}
					}
					for(Object o : gn.getTargetConnections())
					{
						if(o instanceof GraphConnection)
						{
							GraphConnection gc = (GraphConnection)o;
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
		myGraph.setLayoutAlgorithm(new TreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
		myCanvas.layout();
	

	}
	void removeUnconnectedNodes(Map<String, GraphNode> theMap)
	{
		for(GraphNode  gn : theMap.values())
		{
			if(gn.getSourceConnections().size()==0 && gn.getTargetConnections().size()==0)
			{
				if(!gn.isDisposed()) gn.dispose();
			}
		}
	}
	public void buildGraphNodes(Graph theGraph, Map<String, GraphNode> theMap, Map<String,List<String>> bucket)
	{
		for(String t : bucket.keySet())
		{
			GraphNode refNode = new GraphNode(theGraph, ZestStyles.NODES_CACHE_LABEL, t);
			refNode.setBackgroundColor(ColorConstants.lightBlue);
			refNode.setData(t);
			refNode.setSize(100., 30.);
			theMap.put(t, refNode);
			
			
		}
	}
	public void buildGraphEdges(Graph theGraph,  Map<String, GraphNode> theMap, Map<String,List<String>> bucket)
	{
		for(String t : bucket.keySet())
		{
			GraphNode gFrom = theMap.get(t);
			for(String edge : bucket.get(t))
			{
				GraphNode gTo = theMap.get(edge);
				if(gFrom!=null && gTo !=null)
				{
					new GraphConnection(theGraph, ZestStyles.CONNECTIONS_DIRECTED, gFrom, gTo);
				}
			}
		}
		
	}
	public void buildDepFromString(Map<String,List<String>> m_Bucket, String theInput)
	{
		String tok1 = "Dump of file ";
		Scanner scanner = new Scanner(theInput);
		List<String> theList = null;
		while (scanner.hasNextLine()) 
		{
		  String theLine = scanner.nextLine();
		  theLine=theLine.trim();
			if (theLine.startsWith(tok1))
			{
				String theKey = theLine.substring(tok1.length());
				theList =  new ArrayList<String>();
				
				m_Bucket.put(theKey,theList);
				
			}
			else if(theLine.endsWith(".dll"))
			{
				theList.add(theLine);
			}
		}
		scanner.close();
	}
	public String readFile(String theFile)
	{
		StringBuilder bld = new StringBuilder();
		BufferedReader theInFile = null;
		try
		{
			theInFile = new BufferedReader(new FileReader(theFile));
			String theLine;
			while ((theLine = theInFile.readLine()) != null)
			{
				bld.append(theLine);
				bld.append('\n');
			}
		}
		catch (Exception e)
		{
		}
		finally
		{
			if (theInFile != null)
			{
				try
				{
					theInFile.close();
				}
				catch (IOException e)
				{
					System.out.println(e.getMessage());
					
				}
			}
		}
		return bld.toString();
	}
	String runCommand(String command) 
	{
		StringBuffer theOut = new StringBuffer();

		Process theProc;
		try 
		{
			theProc = Runtime.getRuntime().exec(command);
			BufferedReader theReader = new BufferedReader(new InputStreamReader(theProc.getInputStream()));

            String theLine;			
			while ((theLine = theReader.readLine())!= null) 
			{
				theOut.append(theLine + "\n");
			}

		}
		catch (Exception e) 
		{
			m_Console.print(e.getMessage());
		}

		return theOut.toString();

	}
	
	/*
	 * A simple object we pass to the script environment so that we can print things to the UI console control
	 * using output.print("Hello");
	 */

	public class OutputConsole
	{
		public void print(String msg)
		{
			if(msg==null) return;
			myOutput.setText(myOutput.getText() + msg + "\r\n");
		}
		public void clear()
		{
			myOutput.setText("");
		}
	}

	public static void main(String[] args) 
	{
		DepViewer e2 = new DepViewer();
		e2.run();


	}

}
