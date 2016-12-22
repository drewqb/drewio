package com.frantz.drewio.visual.editor.features;

import java.util.Stack;

import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.context.impl.CustomContext;
import org.eclipse.graphiti.features.context.impl.RemoveContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;

import com.frantz.drewio.drewIO.Model;
import com.frantz.drewio.visual.editor.i18n.Messages;

public class PopulateDiagramFeature extends AbstractCustomFeature {

	public PopulateDiagramFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public String getDescription() {
		return Messages.POPULATE_DIAGRAM;
	}

	@Override
	public String getName() {
		return Messages.POPULATE_DIAGRAM;
	}

	@Override
	public boolean canExecute(ICustomContext context) {
		return true;
	}

	@Override
	public void execute(ICustomContext context) {
		Diagram d = getDiagram();
		Stack<Shape> shapes = new Stack<Shape>();
		for(Shape s : d.getChildren())
		{
			shapes.push(s);
		}
		
		while(!shapes.isEmpty())
		{
			Shape s = shapes.pop();
			RemoveContext r = new RemoveContext(s);
			IRemoveFeature f = getFeatureProvider().getRemoveFeature(r);
			f.execute(r);
		}
		Object obj = getBusinessObjectForPictogramElement(d);
		if(obj instanceof Model)
		{
			AddContext r = new AddContext();
			r.setNewObject(obj);
			r.setTargetContainer(d);
			
			IAddFeature f = getFeatureProvider().getAddFeature(r);
			f.execute(r);
			new LayoutFeature(getFeatureProvider(),true).execute( new CustomContext());
		}
			
		
	}

}