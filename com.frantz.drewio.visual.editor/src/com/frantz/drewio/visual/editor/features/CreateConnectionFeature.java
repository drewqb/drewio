package com.frantz.drewio.visual.editor.features;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import com.frantz.drewio.drewIO.InputStatement;
import com.frantz.drewio.drewIO.OutputStatement;
import com.frantz.drewio.drewIO.Statement;

public class CreateConnectionFeature extends AbstractCreateConnectionFeature
		implements ICreateConnectionFeature {

	public CreateConnectionFeature(IFeatureProvider fp) {
		super(fp, "Connector", "Creates a new Connector");
	}

	@Override
	public boolean canStartConnection(ICreateConnectionContext context) {
		// TODO: check for right domain object instance below
		// return getBusinessObjectForPictogramElement(context.getSourcePictogramElement()) instanceof <DomainObject>;

		return true;
	}

	@Override
	public boolean canCreate(ICreateConnectionContext context) {
		PictogramElement sourcePictogramElement = context.getSourcePictogramElement();
		PictogramElement targetPictogramElement = context.getTargetPictogramElement();

		// TODO: check for right domain object instance below
		// if (getBusinessObjectForPictogramElement(sourcePictogramElement) instanceof <DomainObject> && getBusinessObjectForPictogramElement(targetPictogramElement) instanceof <DomainObject>) {
		//  	return true;
		// }
		
		return sourcePictogramElement != null && targetPictogramElement != null;
	}
	
	Connection createStreamToInputStream(ICreateConnectionContext context, EObject src, EObject tar)
	{
		Statement srcInput = (Statement)src;
		OutputStatement tarStream = (OutputStatement)tar;
		
		tarStream.getInputs().add(srcInput);
		
		Object newDomainObjectConnetion = tarStream;
		
		// flip the context
		AddConnectionContext addContext = new AddConnectionContext( context.getTargetAnchor(), context.getSourceAnchor());
		addContext.setNewObject(newDomainObjectConnetion);
		addContext.putProperty("CREATE_CONNECTION_HINT", srcInput);
		return (Connection) getFeatureProvider().addIfPossible(addContext);
	}
	
	@Override
	public Connection create(ICreateConnectionContext context) {

		EObject src = getEObjectForAnchor(context.getSourcePictogramElement());
		EObject tar = getEObjectForAnchor(context.getTargetPictogramElement());
		if(src==null || tar == null) return null;
		
		
		if(src instanceof InputStatement && tar instanceof OutputStatement)
		{
			return createStreamToInputStream(context, src,tar);
		}
		if(src instanceof OutputStatement && tar instanceof OutputStatement)
		{
			return createStreamToInputStream(context, src,tar);
		}
		return null;
	}
	EObject getEObjectForAnchor(PictogramElement anchor)
	{
		if(anchor==null) return null;
		Object o = getBusinessObjectForPictogramElement(anchor);
		if(o instanceof EObject) return (EObject)o;
		return null;
	}
}
