package com.frantz.drewio.visual.editor.features;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.datatypes.IDimension;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;

import com.frantz.drewio.drewIO.Statement;

public class LayoutShape extends AbstractLayoutFeature {

	private static final int MIN_HEIGHT = 30;

	private static final int MIN_WIDTH = 100;

	public LayoutShape(IFeatureProvider fp) {
		super(fp);
	}

	public boolean canLayout(ILayoutContext context) {
		// return true, if pictogram element is linked to an EClass
		PictogramElement pe = context.getPictogramElement();
		if (!(pe instanceof ContainerShape))
			return false;
		EList<EObject> businessObjects = pe.getLink().getBusinessObjects();
		return businessObjects.size() == 1 && businessObjects.get(0) instanceof Statement;
	}

	public boolean layout(ILayoutContext context) {
		boolean anythingChanged = false;
		int INVISIBLE_RECT_RIGHT = 0;
		ContainerShape containerShape = (ContainerShape) context.getPictogramElement();
		GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();
		// the containerGa is the invisible rectangle
		// containing the visible rectangle as its (first and only) child
		GraphicsAlgorithm rectangle = containerGa.getGraphicsAlgorithmChildren().get(0);

		// height of invisible rectangle
		if (containerGa.getHeight() < MIN_HEIGHT) {
			containerGa.setHeight(MIN_HEIGHT);
			anythingChanged = true;
		}

		// height of visible rectangle (same as invisible rectangle)
		if (rectangle.getHeight() != containerGa.getHeight()) {
			rectangle.setHeight(containerGa.getHeight());
			anythingChanged = true;
		}

		// width of invisible rectangle
		if (containerGa.getWidth() < MIN_WIDTH) {
			containerGa.setWidth(MIN_WIDTH);
			anythingChanged = true;
		}

		// width of visible rectangle (smaller than invisible rectangle)
		int rectangleWidth = containerGa.getWidth() - INVISIBLE_RECT_RIGHT;
		if (rectangle.getWidth() != rectangleWidth) {
			rectangle.setWidth(rectangleWidth);
			anythingChanged = true;
		}

		// width of text and line (same as visible rectangle)
		IGaService gaService = Graphiti.getGaService();
		for (Shape shape : containerShape.getChildren()) {
			GraphicsAlgorithm graphicsAlgorithm = shape.getGraphicsAlgorithm();
			IDimension size = gaService.calculateSize(graphicsAlgorithm);
			if (rectangleWidth != size.getWidth()) {
				if (graphicsAlgorithm instanceof Polyline) {
					Polyline polyline = (Polyline) graphicsAlgorithm;
					Point secondPoint = polyline.getPoints().get(1);
					Point newSecondPoint = gaService.createPoint(rectangleWidth, secondPoint.getY());
					polyline.getPoints().set(1, newSecondPoint);
					anythingChanged = true;
				} else {
					gaService.setWidth(graphicsAlgorithm, rectangleWidth);
					anythingChanged = true;
				}
			}
		}
		layoutSingleList(containerShape);
				
		return true;
	}
	void layoutSingleList(ContainerShape containerShape)
	{
		IGaService gaService = Graphiti.getGaService();
		int y=20;
		int w = containerShape.getGraphicsAlgorithm().getWidth()/2 -2;
		for (Shape shape : containerShape.getChildren()) {
			GraphicsAlgorithm graphicsAlgorithm = shape.getGraphicsAlgorithm();
			if (graphicsAlgorithm instanceof Rectangle)
			{
				gaService.setLocationAndSize(graphicsAlgorithm, 0, y, w, 20);
				y+=20;
			}
			else if(graphicsAlgorithm instanceof Image)
			{
				gaService.setLocationAndSize(graphicsAlgorithm, 2, 2,16,16);
				
			}
			
		}
		
	}
	void layout_2_across_ContainerShape(ContainerShape containerShape)
	{
		IGaService gaService = Graphiti.getGaService();
		int y=20;
		int x=1;
		int w = containerShape.getGraphicsAlgorithm().getWidth()/2 -2;
		int midX =containerShape.getGraphicsAlgorithm().getWidth()/2;
		for (Shape shape : containerShape.getChildren()) {
			GraphicsAlgorithm graphicsAlgorithm = shape.getGraphicsAlgorithm();
			if (graphicsAlgorithm instanceof Rectangle)
			{
				if(x%2==0)
				{
					gaService.setLocationAndSize(graphicsAlgorithm, midX, y, w, 20);
					y+=20;
				}
				else
				{
					gaService.setLocationAndSize(graphicsAlgorithm, 0, y, w, 20);
				}
				++x;
				
			}
			else if(graphicsAlgorithm instanceof Image)
			{
				gaService.setLocationAndSize(graphicsAlgorithm, 2, 2,16,16);
				
			}
			
		}
	}
}
