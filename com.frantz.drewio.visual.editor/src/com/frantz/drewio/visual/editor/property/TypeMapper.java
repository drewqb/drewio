package com.frantz.drewio.visual.editor.property;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.ui.views.properties.tabbed.ITypeMapper;

public class TypeMapper implements ITypeMapper {

	public Class<? extends Object> mapType(Object object) {

		Class<? extends Object> type = object.getClass();
		if (object instanceof EditPart) {

			Object model = ((EditPart) object).getModel();

			if (model instanceof PictogramElement) 
			{
				PictogramElement pe = (PictogramElement) model;

				EObject businessObject = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
				if (businessObject == null) 
				{
					return null;//pe.getClass();
				} 
				else 
				{
					return businessObject.getClass();
				}
			}
		}
		return type;
	}
}