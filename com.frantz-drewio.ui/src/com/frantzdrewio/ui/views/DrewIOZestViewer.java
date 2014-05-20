
package com.frantzdrewio.ui.views;


import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.layouts.LayoutAlgorithm;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.HorizontalTreeLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;

import com.frantz.drewio.DrewIOStandaloneSetup;
import com.frantz.drewio.drewIO.Model;
import com.frantz.drewio.drewIO.Statement;

public class DrewIOZestViewer 
{
	private Display myDisplay  ;
	private Shell myShell;
	private Graph myGraph;
	private LayoutAlgorithm myLayout;
	private SashForm mySash;
	private Composite myCanvas;
	private Text myOutput;
	private Model myModel;
	public DrewIOZestViewer()
	{
		// Must make this call one time in order to use the API
		DrewIOStandaloneSetup.doSetup();
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
		myShell.setText("Drew IO Viewer");
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
		MenuItem openItem = new MenuItem (submenu, SWT.PUSH);
		openItem.addListener (SWT.Selection, new Listener () 
		{
			public void handleEvent (Event e) 
			{
				openModel();
			}
		});
		openItem.setText ("Open File");

		MenuItem buildModel = new MenuItem (submenu, SWT.PUSH);
		buildModel.addListener (SWT.Selection, new Listener () 
		{
			public void handleEvent (Event e) 
			{
				buildModel("test_io.drewio");
			}
		});
		buildModel.setText ("Build Model");


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
					myLayout=new TreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING|LayoutStyles.ENFORCE_BOUNDS);
					myGraph.setLayoutAlgorithm(myLayout, true);
				}
			}
		});
		item2.setText ("Vertical Layout");

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
	void buildGraph(Composite parent, Model root)
	{
		if(myGraph!=null)
		{
			myGraph.dispose();
			myGraph=null;
		}
		myGraph= new Graph(parent, SWT.NONE);

		Map<Statement, GraphNode> theMap = new HashMap<Statement, GraphNode>();
		DrewIOUtils.buildGraphNodes(myGraph, theMap, root);
		DrewIOUtils.buildGraphEdges(myGraph, theMap, root);

		myGraph.setLayoutAlgorithm(new TreeLayoutAlgorithm(LayoutStyles.ENFORCE_BOUNDS), true);
		myCanvas.layout();

	}
	private void updateUI() 
	{
		Display.getDefault().asyncExec(new Runnable() {
			public void run() 
			{
				if(myModel==null) return;

				buildGraph(myCanvas, myModel);
			}
		});

	}
	void buildModel(final String theFile)
	{
		Runnable run = new Runnable() 
		{
		    @Override
		    public void run() { 
		    	myModel = DrewIOUtils.buildModel(theFile);
				updateUI();
		    }
		};
		Thread t = new Thread(run);
		t.start();
	
	}
	void openModel(String theFile)
	{
		myModel = DrewIOUtils.createModel(theFile);
		if(myModel==null) return;

		buildGraph(myCanvas, myModel);

	}
	void openModel()
	{
		FileDialog dialog =  new FileDialog(myCanvas.getShell(), SWT.OPEN);
		String filters[]={"*.drewio"};
		dialog.setFilterExtensions(filters);

		openModel( dialog.open() );

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
		DrewIOZestViewer e2 = new DrewIOZestViewer();
		e2.run();


	}

}
