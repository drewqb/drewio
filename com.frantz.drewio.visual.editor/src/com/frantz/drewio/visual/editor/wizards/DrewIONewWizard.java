package com.frantz.drewio.visual.editor.wizards;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.graphiti.features.context.impl.CustomContext;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.PictogramsFactory;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.frantz.drewio.drewIO.Column;
import com.frantz.drewio.drewIO.DrewIOFactory;
import com.frantz.drewio.drewIO.InputStatement;
import com.frantz.drewio.drewIO.Model;
import com.frantz.drewio.visual.editor.diagram.EditorDiagramTypeProvider;
import com.frantz.drewio.visual.editor.features.PopulateDiagramFeature;


public class DrewIONewWizard extends Wizard implements INewWizard {
	private DrewIONewWizardPage page;
	private ISelection selection;

	/**
	 * Constructor for DrewIONewWizard.
	 */
	public DrewIONewWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		page = new DrewIONewWizardPage(selection);
		addPage(page);
	}

	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	public boolean performFinish() {
		final String containerName = page.getContainerName();
		final String fileName = page.getFileName();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(containerName, fileName, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		return true;
	}
	
	/**
	 * The worker method. It will find the container, create the
	 * file if missing or just replace its contents, and open
	 * the editor on the newly created file.
	 */

	private void doFinish(
		String containerName,
		String fileName,
		IProgressMonitor monitor)
		throws CoreException {
		// create a sample file
		monitor.beginTask("Creating " + fileName, 2);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IResource resource = root.findMember(new Path(containerName));
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throwCoreException("Container \"" + containerName + "\" does not exist.");
		}
		IContainer container = (IContainer) resource;
		final IFile semanticModel = container.getFile(new Path(fileName));
		final IFile vizModel = container.getFile(new Path(fileName+".vdrewio"));
		
		try 
		{
						
			createModels(semanticModel, vizModel, monitor);
			
		} catch (Exception e) {
		}
		
		monitor.worked(1);
		monitor.setTaskName("Opening file for editing...");
		
		
		
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchPage page =
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				try 
				{
					
					IDE.openEditor(page, semanticModel, true);
				} catch (PartInitException e) {
				}
			}
		});
		monitor.worked(1);
	}
	
	Model createModels(IFile semanticFile, IFile vizFile, IProgressMonitor progressMonitor)
	{
		if (semanticFile == null || semanticFile.getFullPath().toPortableString().length()<1)
		{
			return null;
		}
		if (vizFile == null || vizFile.getFullPath().toPortableString().length()<1)
		{
			return null;
		}
		ResourceSet resourceSet = new XtextResourceSet();
        // create resources for the diagram and domain model files
        URI uriModel = URI.createPlatformResourceURI(semanticFile.getFullPath().toString(), true);	
        URI uriGraph = URI.createPlatformResourceURI(vizFile.getFullPath().toString(), true);	

        final Resource diagramResource = resourceSet.createResource(uriGraph);
        final Resource modelResource = resourceSet.createResource(uriModel);
        final Model theModel = DrewIOFactory.eINSTANCE.createModel();
		modelResource.getContents().add(theModel);
		
		for(int x=0;x<5;x++)
		{
			InputStatement in = DrewIOFactory.eINSTANCE.createInputStatement();
			in.setName("Input" + x);
			
			Column c = DrewIOFactory.eINSTANCE.createColumn();
			c.setName("Col");
			c.setType("integer");
			in.getColumns().add(c);
			
			theModel.getStatements().add(in);
			
		}
        
        if (diagramResource != null && modelResource != null) 
        {
            Diagram diagram = Graphiti.getPeCreateService().createDiagram("drewio", "Main", true);
            
            PictogramLink link = PictogramsFactory.eINSTANCE.createPictogramLink();
	        link.setPictogramElement(diagram);
	        link.getBusinessObjects().add(theModel);
	        diagramResource.getContents().add(diagram);
        
	        	        
            progressMonitor.worked(1);

            try {
                modelResource.save(createSaveOptions());
                diagramResource.save(createSaveOptions());
            } catch (IOException exception) {
                IStatus status = new Status(IStatus.ERROR, "Error: com.frantz.drewio.visual.editor", "Error diagram resources", exception);
                StatusManager.getManager().handle(status);
            }
            
        }
        progressMonitor.done();
      
	    return theModel;
	}
	
	 public static Map<?, ?> createSaveOptions() 
	 {
	        HashMap<String, Object> saveOptions = new HashMap<String, Object>();
	        saveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8"); //$NON-NLS-1$
	        saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED,
	                Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
	        return saveOptions;
	    }


	private void throwCoreException(String message) throws CoreException {
		IStatus status =
			new Status(IStatus.ERROR, "com.frantz.drewio.visual.editor", IStatus.OK, message, null);
		throw new CoreException(status);
	}

	/**
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
}