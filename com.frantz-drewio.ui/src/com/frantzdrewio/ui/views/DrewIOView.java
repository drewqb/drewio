package com.frantzdrewio.ui.views;


import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.layouts.LayoutAlgorithm;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.HorizontalTreeLayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.TreeLayoutAlgorithm;

import com.frantz.drewio.drewIO.Model;
import com.frantz.drewio.drewIO.Statement;
import com.frantzdrewio.i18n.Messages;



public class DrewIOView extends ViewPart // implements ITabbedPropertySheetPageContributor 
{

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "com.frantzdrewio.ui.views.DrewIO View";

	private Action myOpenbModelAction;
	private Action myBuildModelAction;
	private Action myLayoutverticalAction;
	private Action myLayoutHorizontalAction;
	private Action myRunScript;
	

	private Graph myGraph;
	private LayoutAlgorithm myLayout;
	private SashForm mySash;
	private Composite myCanvas;
	private Text myOutput;
	private Model myModel;
	
	public DrewIOView() {
	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite myShell) {

		
		myShell.setLayout(new FillLayout());
		myShell.setSize(500, 500);
		
		
		mySash = new SashForm(myShell, SWT.VERTICAL);
		myCanvas = new Composite(mySash, SWT.NONE);
		myOutput = new  Text(mySash, SWT.BORDER | SWT.READ_ONLY | SWT.V_SCROLL | SWT.H_SCROLL);
		myCanvas.setLayout(new FillLayout());
		
		
		mySash.setWeights(new int[]{7, 3});
		
		
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
		
		//getSite().setSelectionProvider(myGraph);
	}

	private void hookContextMenu() {
		/*MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				DrewIOView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(myCanvas);
		myCanvas.setMenu(menu);
		getSite().registerContextMenu(ID, menuMgr, myCanvas);*/
	}

	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalPullDown(bars.getMenuManager());
		fillLocalToolBar(bars.getToolBarManager());
	}

	private void fillLocalPullDown(IMenuManager manager) {
		manager.add(myOpenbModelAction);
		manager.add(new Separator());
		manager.add(myBuildModelAction);
		manager.add(myLayoutHorizontalAction);
		manager.add(myLayoutverticalAction);
		manager.add(myRunScript);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(myOpenbModelAction);
		manager.add(myBuildModelAction);
		manager.add(myLayoutHorizontalAction);
		manager.add(myLayoutverticalAction);
		manager.add(myRunScript);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(myOpenbModelAction);
		manager.add(myBuildModelAction);
		manager.add(myLayoutHorizontalAction);
		manager.add(myLayoutverticalAction);
		manager.add(myRunScript);
	}

	private void makeActions() {
		myOpenbModelAction = new Action() {
			public void run() 
			{
				openModel();
			}
		};
		myOpenbModelAction.setText(Messages.OPEN_MODEL_MNU);
		myOpenbModelAction.setToolTipText(myOpenbModelAction.getText());
		myOpenbModelAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_OBJ_FILE));
		
		myBuildModelAction = new Action() {
			public void run() {
				Job job = new Job("Build Model") {
				      @Override
				      protected IStatus run(IProgressMonitor monitor) {
				    	  buildModel("drew_test.drewio");
				    	  updateUI();
				        return Status.OK_STATUS;
				      }

				    };
				    job.setUser(true);
				    job.schedule();
				
			}
		};
		myBuildModelAction.setText(Messages.BUILD_MODEL_MNU);
		myBuildModelAction.setToolTipText(myBuildModelAction.getText());
		myBuildModelAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		
		myLayoutHorizontalAction = new Action() {
			public void run() {
				if(myGraph!=null)
				{
					myLayout=new HorizontalTreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING);
					myGraph.setLayoutAlgorithm(myLayout, true);
				}
			}
		};
		myLayoutHorizontalAction.setText(Messages.LAYOUT_HORIZONTAL_MNU);
		myLayoutHorizontalAction.setToolTipText(myLayoutHorizontalAction.getText());
		myLayoutHorizontalAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		
		myLayoutverticalAction = new Action() {
			public void run() {
				if(myGraph!=null)
				{
					myLayout=new TreeLayoutAlgorithm(LayoutStyles.NO_LAYOUT_NODE_RESIZING|LayoutStyles.ENFORCE_BOUNDS);
					myGraph.setLayoutAlgorithm(myLayout, true);
				}
			}
		};
		myLayoutverticalAction.setText(Messages.LAYOUT_VERTICAL_MNU);
		myLayoutverticalAction.setToolTipText(myLayoutverticalAction.getText());
		myLayoutverticalAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));

		myRunScript = new Action() {
			public void run() {
				runScript();
			}
		};
		myRunScript.setText(Messages.RUN_SCRIPT_MNU);
		myRunScript.setToolTipText(myRunScript.getText());
		myRunScript.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));

		
	}
	 private void updateUI() {
		    Display.getDefault().asyncExec(new Runnable() {
		      public void run() 
		      {
		    	  if(myModel==null) return;
		  		
		  		buildGraph(myCanvas, myModel);
		      }
		    });

		  }
	private void hookDoubleClickAction() 
	{
		/*viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				doubleClickAction.run();
			}
		});
		*/
	}
	private void showMessage(String message) {
		MessageDialog.openInformation(
			myCanvas.getShell(),
			"DrewIO View",
			message);
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		myCanvas.setFocus();
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
	
	void buildModel(String theFile)
	{
		myModel = DrewIOUtils.buildModel(theFile);
		
		
	}
	public void openModel(String theFile)
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
	void runScript()
	{
		FileDialog dialog =  new FileDialog(myCanvas.getShell(), SWT.OPEN);
		String filters[]={"*.js"};
		dialog.setFilterExtensions(filters);

		String theFile = dialog.open();
		if (theFile == null || theFile.length()<1)
		{
			return ;
		}
		try 
		{
			ScriptManager sm = new ScriptManager(myOutput, myCanvas, myModel);
			sm.runScript(theFile);
			
		} 
		catch (Exception e) {
			MessageBox d = new MessageBox(myCanvas.getShell(),SWT.ERROR);
			d.setMessage(e.getMessage());
			d.open();
		}
	}
	
}