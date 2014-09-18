package com.frantz.drewio.visual.editor.features;

import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;

import com.frantz.drewio.drewIO.Column;
import com.frantz.drewio.drewIO.DrewIOFactory;
import com.frantz.drewio.drewIO.InputStatement;

public class CreateColumnFeature extends AbstractCreateFeature implements
		ICreateFeature {

	public CreateColumnFeature(IFeatureProvider fp) {
		super(fp, "Column", "Creates a new Column");
	}

	
	@Override
	public boolean canCreate(ICreateContext context) 
	{
		Object oParent = context.getProperty("PARENT");
		if(oParent instanceof InputStatement)
		{	return true;
		}
		return false;
		
	}

	@Override
	public Object[] create(ICreateContext context) {
		Column newDomainObject = null;
		Object oParent = context.getProperty("PARENT");
		if(oParent instanceof InputStatement)
		{
			InputStatement theSchema = (InputStatement) oParent;
			newDomainObject = DrewIOFactory.eINSTANCE.createColumn();
			newDomainObject.setType( "boolean");
			
			newDomainObject.setName(newDomainObject.eClass().getName()+theSchema.getColumns().size());
			theSchema.getColumns().add(newDomainObject);
			addGraphicalRepresentation(context, newDomainObject);
		}
		return new Object[] { newDomainObject };
	}
}
