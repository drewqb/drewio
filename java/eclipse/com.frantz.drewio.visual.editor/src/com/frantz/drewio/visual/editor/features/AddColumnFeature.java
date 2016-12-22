package com.frantz.drewio.visual.editor.features;

import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.impl.LayoutContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;

import com.frantz.drewio.drewIO.Column;
import com.frantz.drewio.visual.editor.util.StyleUtil;


public class AddColumnFeature extends AbstractAddFeature implements
		IAddFeature {

	public AddColumnFeature(IFeatureProvider fp) {
		super(fp);
	}

	
	@Override
	public boolean canAdd(IAddContext context) {
		// Feature supports to add a book object into a section of the library
		if (context.getNewObject() instanceof Column && context.getTargetContainer() instanceof ContainerShape) {
			return true;
		}
		return false;
	}
	

	@Override
	public PictogramElement add(IAddContext context) {
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		IGaService gaService = Graphiti.getGaService();
		Column newObject = (Column) context.getNewObject();

		final ContainerShape containerShape = peCreateService.createContainerShape(context.getTargetContainer(), true);
		Rectangle roundedRectangle = gaService.createInvisibleRectangle(containerShape);
		gaService.setLocationAndSize(roundedRectangle, context.getX(), context.getY(), context.getWidth(), context.getHeight());
		

		final Shape shape = peCreateService.createShape(containerShape, false);
		final Text text = gaService.createText(shape, newObject.getName());
		text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
		text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
		gaService.setLocationAndSize(text, 0, 0, context.getWidth(), context.getHeight());
		
		text.setStyle(StyleUtil.getCompartmentStyle(getDiagram()));
		
		//peCreateService.createChopboxAnchor(containerShape);

		link(containerShape, newObject);
		link(shape, newObject);
		
		// provide information to support direct-editing directly
		// after object creation (must be activated additionally)
		final IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
		
		// set container shape for direct editing after object creation
		directEditingInfo.setMainPictogramElement(containerShape);
		// set shape and graphics algorithm where the editor for
		// direct editing shall be opened after object creation
		directEditingInfo.setPictogramElement(shape);
		directEditingInfo.setGraphicsAlgorithm(text);

		//addDataType(containerShape, newObject,context);
		
		// Layout and size the Top shape
		LayoutContext lc = new LayoutContext(context.getTargetContainer());

		new LayoutShape(getFeatureProvider()).execute(lc);
		GraphicsAlgorithm ga = context.getTargetContainer().getGraphicsAlgorithm();
		IDimension gaSize = Graphiti.getGaService().calculateSize(ga,true);
		IDimension theShapeSize = Graphiti.getGaService().calculateSize(containerShape.getGraphicsAlgorithm(),true);
		
		gaService.setHeight(ga, gaSize.getHeight()+theShapeSize.getHeight()+10);
		layoutPictogramElement(context.getTargetContainer());
		
		
		return containerShape;

	}
	
}
