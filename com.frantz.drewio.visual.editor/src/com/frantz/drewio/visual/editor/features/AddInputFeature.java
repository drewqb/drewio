package com.frantz.drewio.visual.editor.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.features.context.impl.AreaContext;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import com.frantz.drewio.drewIO.Column;
import com.frantz.drewio.drewIO.InputStatement;
import com.frantz.drewio.visual.editor.ImageProvider;
import com.frantz.drewio.visual.editor.util.StyleUtil;


public class AddInputFeature extends AbstractAddTopFeature {

	public AddInputFeature(IFeatureProvider fp) {
		super(fp);
	}
	@Override
	protected String getImageId() {
		return ImageProvider.INPUT_ST;
	}


	
	@Override
	public boolean canAdd(IAddContext context) {
		// Feature supports to add a book object into a section of the library
		if (context.getNewObject() instanceof InputStatement && context.getTargetContainer() instanceof ContainerShape) {
			return true;
		}
		return false;
	}


	@Override
	protected String getNameText(IAddContext context) {
		InputStatement newObject = (InputStatement) context.getNewObject();
		return newObject.getName();

	}


	@Override
	protected void addCompartmentItems(IAddContext context, ContainerShape parent) 
	{
		InputStatement theObj = (InputStatement) context.getNewObject();

		for(Column c: theObj.getColumns())
		{
			AddContext subCon = new AddContext(new AreaContext(), c);
			subCon.setTargetContainer(parent);
			addGraphicalRepresentation(subCon, c);
		}

		
	}


	@Override
	protected Style getHeaderStyle(Diagram d) {
		return StyleUtil.getInputStyle(d);
	}

	
}
