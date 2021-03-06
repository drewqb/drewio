package com.frantz.drewio.visual.editor.features;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import com.frantz.drewio.drewIO.DrewIOFactory;
import com.frantz.drewio.drewIO.InputStatement;
import com.frantz.drewio.drewIO.Model;
import com.frantz.drewio.visual.editor.ImageProvider;

public class CreateInputStatementFeature extends AbstractCreateFeature implements
		ICreateFeature {

	public CreateInputStatementFeature(IFeatureProvider fp) {
		super(fp, "InputStatement", "Creates a new InputStatement");
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public String getCreateImageId() {
		return ImageProvider.INPUT_ST;
	}

	@Override
	public Object[] create(ICreateContext context) {

		InputStatement newDomainObject = DrewIOFactory.eINSTANCE.createInputStatement();
		
		 Diagram d = getDiagram();
        ResourceSet set = d.eResource().getResourceSet();
        Resource res2 = set.getResources().get(1);
        EObject eoCont = res2.getContents().get(0);
        if(eoCont instanceof Model)
        {
        	Model root = (Model)eoCont;
        	root.getStatements().add(newDomainObject);
        	newDomainObject.setName(newDomainObject.eClass().getName()+root.getStatements().size());
        }


		addGraphicalRepresentation(context, newDomainObject);
		return new Object[] { newDomainObject };
	}
}
