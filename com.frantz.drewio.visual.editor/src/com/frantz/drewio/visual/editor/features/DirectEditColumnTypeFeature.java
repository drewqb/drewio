package com.frantz.drewio.visual.editor.features;

import java.util.List;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import com.frantz.drewio.drewIO.Column;

public class DirectEditColumnTypeFeature extends AbstractDirectEditingFeature {

	public DirectEditColumnTypeFeature(IFeatureProvider fp) {
		super(fp);
	}

	public int getEditingType() {
		// there are several possible editor-types supported:
		// text-field, checkbox, color-chooser, combobox, ...
		return TYPE_DROPDOWN_READ_ONLY;
	}
	@Override
	public String[] getPossibleValues(IDirectEditingContext context)
	{
		String [] types = {"boolean", "string", "integer", "float"};
		return types;
	}

	@Override
	public boolean canDirectEdit(IDirectEditingContext context) {
		PictogramElement pe = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pe);
		GraphicsAlgorithm ga = context.getGraphicsAlgorithm();
		// support direct editing, if it is a EClass, and the user clicked
		// directly on the text and not somewhere else in the rectangle
		if (bo instanceof Column) {
			// EClass eClass = (EClass) bo;
			// additionally the flag isFrozen must be false
			// return !eClass.isFrozen();
			return true;
		}
		// direct editing not supported in all other cases
		return false;
	}
	
	public String getInitialValue(IDirectEditingContext context) {
		// return the current name of the EClass
		PictogramElement pe = context.getPictogramElement();
		Column eClass = (Column) getBusinessObjectForPictogramElement(pe);
		return eClass.getType();
	}

	@Override
	public String checkValueValid(String value, IDirectEditingContext context) {
		if (value.length() < 1)
			return "Please enter any text as class name."; //$NON-NLS-1$
		if (value.contains(" ")) //$NON-NLS-1$
			return "Spaces are not allowed in class names."; //$NON-NLS-1$
		if (value.contains("\n")) //$NON-NLS-1$
			return "Line breakes are not allowed in class names."; //$NON-NLS-1$

		// null means, that the value is valid
		return null;
	}
	
	public void setValue(String value, IDirectEditingContext context) {
		// set the new name for the EClass
		PictogramElement pe = context.getPictogramElement();
		Column eClass = (Column) getBusinessObjectForPictogramElement(pe);
		eClass.setType(value);
		
		
		// Update Features will update the pictogram
		GraphicsAlgorithm ga = context.getGraphicsAlgorithm();
		if(ga instanceof Text)
		{
			Text txt = (Text)ga;
			txt.setValue(value);
		}
		updatePictogramElement(((Shape) pe).getContainer());
		
	}
}