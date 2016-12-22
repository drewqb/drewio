package com.frantz.drewio.visual.editor.diagram;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IDirectEditingFeature;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;

import com.frantz.drewio.drewIO.Column;
import com.frantz.drewio.drewIO.InputStatement;
import com.frantz.drewio.drewIO.Model;
import com.frantz.drewio.drewIO.OutputStatement;
import com.frantz.drewio.drewIO.Statement;
import com.frantz.drewio.visual.editor.features.AddColumnFeature;
import com.frantz.drewio.visual.editor.features.AddConnectionFeature;
import com.frantz.drewio.visual.editor.features.AddInputFeature;
import com.frantz.drewio.visual.editor.features.AddModelFeature;
import com.frantz.drewio.visual.editor.features.AddOutputFeature;
import com.frantz.drewio.visual.editor.features.CreateColumnFeature;
import com.frantz.drewio.visual.editor.features.CreateConnectionFeature;
import com.frantz.drewio.visual.editor.features.CreateInputStatementFeature;
import com.frantz.drewio.visual.editor.features.CreateOutputStatementFeature;
import com.frantz.drewio.visual.editor.features.DirectEditFeature;
import com.frantz.drewio.visual.editor.features.LayoutFeature;
import com.frantz.drewio.visual.editor.features.LayoutShape;
import com.frantz.drewio.visual.editor.features.PopulateDiagramFeature;
import com.frantz.drewio.visual.editor.features.UpdateInputStatementFeature;


public class EditorFeatureProvider extends DefaultFeatureProvider {

	public EditorFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
	}

	@Override
	public IDirectEditingFeature getDirectEditingFeature(IDirectEditingContext context) 
	{
		PictogramElement pic = context.getPictogramElement();
		Object sem = getBusinessObjectForPictogramElement(pic);
		/*if(sem instanceof DataType)
		{
			return new DirectEditColumnTypeFeature(this);
		
		}*/
		if(sem instanceof EObject)
		{
			return new DirectEditFeature(this);
		}
		return super.getDirectEditingFeature(context);
	}

	@Override
	public ICreateFeature[] getCreateFeatures() {
		return new ICreateFeature[] {new CreateInputStatementFeature(this), new CreateOutputStatementFeature(this)};
	}
	
	@Override
	public ICreateConnectionFeature[] getCreateConnectionFeatures() {
		return new ICreateConnectionFeature[] {new CreateConnectionFeature(this)};
	}
	
	@Override
	public IUpdateFeature getUpdateFeature(IUpdateContext context) 
	{
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		
		if (bo instanceof InputStatement) 
		{
			return new UpdateInputStatementFeature(this);
		}
		return super.getUpdateFeature(context);
	}

	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		// TODO: check for right domain object instances below
		Object connectionHint = context.getProperty("CREATE_CONNECTION_HINT");
		Object newObj = context.getNewObject();
		if (newObj instanceof IFile) {
			IAddContext addContext = adaptContext(context);
			if(addContext.getNewObject() instanceof Model)
			{
				return new AddModelFeature(this);
			}
		}
		else if (newObj instanceof Model) 
		{
			return new AddModelFeature(this);
		}
		
		else if (connectionHint instanceof Statement && newObj instanceof Statement)
		{
			return new AddConnectionFeature(this);
		}
		
		else if (newObj instanceof InputStatement) {
			return new AddInputFeature(this);
		}
		else if (newObj instanceof Column) {
			return new AddColumnFeature(this);
		}
		else if (newObj instanceof OutputStatement) {
			return new AddOutputFeature(this);
		}
		return super.getAddFeature(context);
	}
	
	@Override
	public ILayoutFeature getLayoutFeature(ILayoutContext context) {
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		if (bo instanceof Statement) {
			return new LayoutShape(this);
		}
		return super.getLayoutFeature(context);
	}
	
	@Override
	public ICustomFeature[] getCustomFeatures(ICustomContext context) {
		return new ICustomFeature[] {new LayoutFeature(this,true), new LayoutFeature(this,false),new PopulateDiagramFeature(this)};
	}
	/*
	 * As a prototype we do this when we link a model file to the diagram using DnD
	 * from project explorer . In a real product we would set this up as part of the New wizards.
	 */
	private IAddContext adaptContext(IAddContext context) {
		Object newObject = context.getNewObject();
		if (newObject instanceof IFile) 
		{
			IFile file = (IFile) newObject;
			if ("drewio".equals(file.getFileExtension())) {
				ContainerShape targetContainer = context.getTargetContainer();
				if (targetContainer instanceof Diagram) {
					Diagram diagram = (Diagram) targetContainer;
					ResourceSet resourceSet = diagram.eResource().getResourceSet();
					TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(resourceSet);
					if (editingDomain == null) {
						editingDomain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(resourceSet);
					}
					@SuppressWarnings("restriction")
					URI uri = org.eclipse.graphiti.ui.internal.services.GraphitiUiInternal.getEmfService().getFileURI(file);//.getFileURI(file, resourceSet);
					Resource resource = resourceSet.getResource(uri, true);
					if (resource != null) 
					{
						Model root = (Model) resource.getContents().get(0);
						if (root != null) {
							AddContext addContext = (AddContext) context;
							addContext.setNewObject(root);

							return addContext;
						}
					}

				}
			}
		}
		return context;
	}

}
