package com.frantz.drewio.visual.editor.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import com.frantz.drewio.drewIO.OutputStatement;
import com.frantz.drewio.visual.editor.ImageProvider;
import com.frantz.drewio.visual.editor.util.StyleUtil;


public class AddOutputFeature extends AbstractAddTopFeature {

	public AddOutputFeature(IFeatureProvider fp) {
		super(fp);
	}

	
	@Override
	protected String getImageId() {
		return ImageProvider.OUTPUT_ST;
	}


	@Override
	public boolean canAdd(IAddContext context) {
		// Feature supports to add a book object into a section of the library
		if (context.getNewObject() instanceof OutputStatement && context.getTargetContainer() instanceof ContainerShape) {
			return true;
		}
		return false;
	}


	@Override
	protected String getNameText(IAddContext context) {
		OutputStatement newObject = (OutputStatement) context.getNewObject();
		return newObject.getName();

	}


	@Override
	protected void addCompartmentItems(IAddContext context,
			ContainerShape parent) {
		// TODO Auto-generated method stub
		
	}


	@Override
	protected Style getHeaderStyle(Diagram d) {
		return StyleUtil.getOutputStyle(d);
	}

	
}
