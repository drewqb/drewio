package com.frantz.drewio.visual.editor.features;


import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;

import com.frantz.drewio.drewIO.Statement;
import com.frantz.drewio.visual.editor.util.StyleUtil;


public abstract class AbstractAddTopFeature extends AbstractAddFeature implements
IAddFeature {

	public AbstractAddTopFeature(IFeatureProvider fp) {
		super(fp);
	}


	@Override
	public boolean canAdd(IAddContext context) {
		// Feature supports to add a book object into a section of the library
		if (context.getNewObject() instanceof Statement && context.getTargetContainer() instanceof Diagram) {
			return true;
		}
		return false;
	}

	abstract protected String getNameText(IAddContext context);

	@Override
	public PictogramElement add(IAddContext context) {
		int INVISIBLE_RECT_RIGHT = 6;
		Diagram targetDiagram = (Diagram) context.getTargetContainer();
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		IGaService gaService = Graphiti.getGaService();
		Statement newObject = (Statement) context.getNewObject();

		// CONTAINER SHAPE WITH ROUNDED RECTANGLE
		final ContainerShape containerShape = peCreateService.createContainerShape(targetDiagram, true);

		// check whether the context has a size (e.g. from a create feature)
		// otherwise define a default size for the shape
		final int width = context.getWidth() <= 0 ? 150 : context.getWidth();
		final int height = context.getHeight() <= 0 ? 30 : context.getHeight();

		RoundedRectangle roundedRectangle; // need to access it later
		{
			// create invisible outer rectangle expanded by
			// the width needed for the anchor
			final Rectangle invisibleRectangle = gaService.createInvisibleRectangle(containerShape);
			gaService.setLocationAndSize(invisibleRectangle, context.getX(), context.getY(), width + INVISIBLE_RECT_RIGHT, height);

			// create and set visible rectangle inside invisible rectangle
			roundedRectangle = gaService.createPlainRoundedRectangle(invisibleRectangle, 12,12);
			roundedRectangle.setStyle(getHeaderStyle(getDiagram()));
			gaService.setLocationAndSize(roundedRectangle, 0, 0, width, height);
			
			// create link and wire it
			link(containerShape, newObject);
		}

		// ICON
		{
			final Shape shape = peCreateService.createShape(containerShape, false);
			final Image shapeImage = gaService.createImage(shape, getImageId());
			gaService.setLocationAndSize(shapeImage, 0, 0, 16, 16);
			
		}
		// SHAPE WITH LINE
		{
			// create shape for line
			final Shape shape = peCreateService.createShape(containerShape, false);

			// create and set graphics algorithm
			final Polyline polyline = gaService.createPlainPolyline(shape, new int[] { 0, 20, width, 20 });
			//polyline.setStyle(StyleUtil.getStyleForEClass(getDiagram()));
		}

		// SHAPE WITH TEXT
		{
			// create shape for text
			final Shape shape = peCreateService.createShape(containerShape, false);
			
			// create and set text graphics algorithm
			final Text text = gaService.createPlainText(shape, getNameText(context));
			text.setStyle(StyleUtil.getDefaultTextStyle(getDiagram()));
			
			gaService.setLocationAndSize(text, 20, 0, width, 20);
			// create link and wire it
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
			
		}

		// add a chopbox anchor to the shape
		peCreateService.createChopboxAnchor(containerShape);
		addCompartmentItems(context,containerShape);
		
		layoutPictogramElement(containerShape);

		return containerShape;

	}
	abstract protected void addCompartmentItems(IAddContext context, ContainerShape parent) ;
	abstract protected Style getHeaderStyle(Diagram d);
	abstract protected String getImageId();
	
	
	
}
