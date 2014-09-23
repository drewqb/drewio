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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.zest.core.viewers.GraphViewer;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.layouts.LayoutAlgorithm;
import org.eclipse.zest.layouts.LayoutStyles;

import com.frantz.txtuml.txtUML.ActorDecl;
import com.frantz.txtuml.txtUML.Model;
import com.frantzdrewio.i18n.Messages;



public class SequenceView extends ViewPart implements ITabbedPropertySheetPageContributor 
{

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "com.frantzdrewio.ui.views.SequenceView";

	private Action myOpenbModelAction;
	private Action myBuildModelAction;
	private Action myLayoutHorizontalAction;
	

	//private Graph myGraph;
	private LayoutAlgorithm myLayout=new SeqLayout(LayoutStyles.NO_LAYOUT_NODE_RESIZING);
	
	private SashForm mySash;
	private Composite myCanvas;
	private Text myOutput;
	private Model myModel;
	private GraphViewer viewer;
	public SequenceView() {
	}

	

	@Override
	public Object getAdapter(Class type) {
		if(type.equals(IPropertySheetPage.class))
		{
			return new TabbedPropertySheetPage(this);
		}
		return super.getAdapter(type);
	}


	public void createPartControl(Composite myShell) {

		
		myShell.setLayout(new FillLayout());
		myShell.setSize(500, 500);
		
		
		mySash = new SashForm(myShell, SWT.VERTICAL);
		myCanvas = new Composite(mySash, SWT.NONE);
		myOutput = new  Text(mySash, SWT.BORDER | SWT.READ_ONLY | SWT.V_SCROLL | SWT.H_SCROLL);
		myCanvas.setLayout(new FillLayout());
			
		viewer = new GraphViewer(myCanvas, SWT.BORDER);
		//viewer.setContentProvider(new ZestNodeContentProvider());
	    //viewer.setLabelProvider(new ZestLabelProvider());
	    //NodeModelContentProvider model = new NodeModelContentProvider();
	    //viewer.setInput(model.getNodes());
	    //LayoutAlgorithm layout = setLayout();
	    //viewer.setLayoutAlgorithm(layout, true);
	    //viewer.applyLayout();
	    
		mySash.setWeights(new int[]{7, 3});
		
		
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
		
		getSite().setSelectionProvider(viewer);
		
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
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(myOpenbModelAction);
		manager.add(myBuildModelAction);
		manager.add(myLayoutHorizontalAction);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(myOpenbModelAction);
		manager.add(myBuildModelAction);
		manager.add(myLayoutHorizontalAction);
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
				    	  buildModel("drew_test.txtuml");
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
				if(viewer.getGraphControl()!=null)
				{
					
					viewer.getGraphControl().setLayoutAlgorithm(myLayout, true);
				}
			}
		};
		myLayoutHorizontalAction.setText(Messages.LAYOUT_HORIZONTAL_MNU);
		myLayoutHorizontalAction.setToolTipText(myLayoutHorizontalAction.getText());
		myLayoutHorizontalAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
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
	
	void disposeGraphContents(Graph g)
	{
			Object[] connections = g.getConnections().toArray() ; 
			for ( int x = 0 ; x<connections.length;x++)
			{
				((GraphConnection) connections[x]).dispose() ; 
			} 
			Object[] nodes = g.getNodes().toArray() ; 
			for ( int x = 0 ; x<nodes.length;x++)
			{
				((GraphNode) nodes[x]).dispose() ; 
			}

	}
	void buildGraph(Composite parent, Model root)
	{
		/*if(myGraph!=null)
		{
			myGraph.dispose();
			myGraph=null;
		}
		myGraph= new Graph(parent, SWT.NONE);*/
		Graph myGraph = viewer.getGraphControl();
		disposeGraphContents(myGraph);
		Map<ActorDecl, GraphNode> theMap = new HashMap<ActorDecl, GraphNode>();
		TxtUMLUtils.buildGraphNodes(myGraph, theMap, root);
		TxtUMLUtils.buildGraphEdges(myGraph, theMap, root);
		
		myGraph.setLayoutAlgorithm(myLayout, true);
		myCanvas.layout();
		
	}
	
	void buildModel(String theFile)
	{
		myModel = TxtUMLUtils.buildModel(theFile);
		
		
	}
	public void openModel(String theFile)
	{
		myModel = TxtUMLUtils.createModel(theFile);
		if(myModel==null) return;
		
		buildGraph(myCanvas, myModel);
		
	}
	void openModel()
	{
		FileDialog dialog =  new FileDialog(myCanvas.getShell(), SWT.OPEN);
		String filters[]={"*.txtuml"};
		dialog.setFilterExtensions(filters);

		openModel( dialog.open() );

	}
	
	@Override
	public String getContributorId() {
		// TODO Auto-generated method stub
		return "com.frantz-drewio.ui.propertyContributor1";
	}
	
}