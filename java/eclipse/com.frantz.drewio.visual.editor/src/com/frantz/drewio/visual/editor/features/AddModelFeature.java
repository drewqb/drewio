package com.frantz.drewio.visual.editor.features;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.context.impl.AreaContext;
import org.eclipse.graphiti.features.context.impl.CustomContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import com.frantz.drewio.drewIO.Model;
import com.frantz.drewio.drewIO.OutputStatement;
import com.frantz.drewio.drewIO.Statement;


public class AddModelFeature extends AbstractAddFeature implements
IAddFeature {

	public AddModelFeature(IFeatureProvider fp) {
		super(fp);
	}


	@Override
	public boolean canAdd(IAddContext context) {
		if (context.getNewObject() instanceof Model && context.getTargetContainer() instanceof Diagram) {
			return true;
		}
		return false;
	}

	@Override
	public PictogramElement add(IAddContext context) 
	{

		Diagram targetDiagram = (Diagram) context.getTargetContainer();
		Model newObject = (Model) context.getNewObject();
		link(targetDiagram, newObject);
		
		for(Statement top : newObject.getStatements())
		{
			AddContext newContext = new AddContext(new AreaContext(), top);
			newContext.setTargetContainer(targetDiagram);
			addGraphicalRepresentation(newContext, top);
		}
		for(Statement top : newObject.getStatements())
		{
			if(top instanceof OutputStatement)
			{
				OutputStatement theStream = (OutputStatement)top;
				Anchor sourceAnchor = ((Shape) getFeatureProvider().getPictogramElementForBusinessObject(theStream)).getAnchors().get(0);
			
				for(Statement from : theStream.getInputs())
				{
					Anchor targetAnchor = ((Shape) getFeatureProvider().getPictogramElementForBusinessObject(from)).getAnchors().get(0);
					
					addConnection(sourceAnchor, targetAnchor, theStream,from,targetDiagram);
				}
				
			}
		}
		new LayoutFeature(getFeatureProvider(),true).execute( new CustomContext());
		return targetDiagram;
	}
	void addConnection(Anchor sourceAnchor, Anchor targetAnchor, EObject src, EObject tar, ContainerShape container)
	{
		AddConnectionContext addContext = new AddConnectionContext(sourceAnchor, targetAnchor);
		addContext.setNewObject(src);
		addContext.putProperty("CREATE_CONNECTION_HINT", tar);
		addContext.setTargetContainer(container);
		IAddFeature addFeature = getFeatureProvider().getAddFeature(addContext);
		if (addFeature.canAdd(addContext)) 
		{
			addFeature.add(addContext);
		}
	}
}
