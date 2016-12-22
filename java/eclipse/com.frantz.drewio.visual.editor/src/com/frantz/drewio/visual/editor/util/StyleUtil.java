package com.frantz.drewio.visual.editor.util;

import java.util.Collection;

import org.eclipse.graphiti.mm.StyleContainer;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.util.ColorConstant;
import org.eclipse.graphiti.util.IColorConstant;

public class StyleUtil {
	private static final IColorConstant INPUT_SHAPE = new ColorConstant(155,213,113);
	private static final IColorConstant OUTPUT_SHAPE = new ColorConstant(113,155,213);
	private static final IColorConstant DEFAULT_TEXT_STYLE = IColorConstant.BLACK;
	public static Style getStyle(Diagram theDiagram, String theStyleId, IColorConstant theFg, IColorConstant theBg) 
	{
		Style style = lookupStyle(theDiagram, theStyleId);

		if (style == null) { // style not found - create new style
			IGaService gaService = Graphiti.getGaService();
			style = gaService.createStyle(theDiagram, theStyleId);
			style.setForeground(gaService.manageColor(theDiagram, theFg ));
			// "overwrites" values from parent style
			style.setBackground(gaService.manageColor(theDiagram, theBg));
			style.setFilled(true);
		}
		return style;
		
	}
	public static Style getInputStyle(Diagram diagram) 
	{
		final String styleId = "DEFAULT_TEXT_STYLE"; //$NON-NLS-1$
		Style theStyle = getStyle(diagram, styleId, DEFAULT_TEXT_STYLE, INPUT_SHAPE);
		
		return theStyle;
	}
	public static Style getDefaultTextStyle(Diagram diagram) 
	{
		final String styleId = "INPUT_SHAPE"; //$NON-NLS-1$
		Style theStyle = getStyle(diagram, styleId, DEFAULT_TEXT_STYLE, INPUT_SHAPE);
		theStyle.setFilled(false);
		theStyle.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
		return theStyle;
	}
	public static Style getCompartmentStyle(Diagram diagram) 
	{
		final String styleId = "COMPARTMENT_STYLE"; //$NON-NLS-1$
		Style theStyle =  getStyle(diagram, styleId, DEFAULT_TEXT_STYLE, IColorConstant.WHITE);
		theStyle.setFilled(false);
		return theStyle;
	}
	public static Style getHeaderCompartmentStyle(Diagram diagram) 
	{
		final String styleId = "HEADER_COMPARTMENT_STYLE"; //$NON-NLS-1$
		Style theStyle =  getStyle(diagram, styleId, DEFAULT_TEXT_STYLE, IColorConstant.WHITE);
		theStyle.setTransparency(.0);
		theStyle.setFilled(false);
		return theStyle;
	}
	public static Style getOutputStyle(Diagram diagram) 
	{
		final String styleId = "OUTPUT_SHAPE"; //$NON-NLS-1$
		return getStyle(diagram, styleId, DEFAULT_TEXT_STYLE, OUTPUT_SHAPE);
	}
	
	private static Style lookupStyle(StyleContainer styleContainer, String id) {
		// find and return style
		Collection<Style> styles = styleContainer.getStyles();
		if (styles != null) {
			for (Style style : styles) {
				if (id.equals(style.getId())) {
					return style;
				}
			}
		}
		return null;
	}
}
