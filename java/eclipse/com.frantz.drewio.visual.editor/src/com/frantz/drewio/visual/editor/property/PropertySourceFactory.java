package com.frantz.drewio.visual.editor.property;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.platform.GraphitiShapeEditPart;
import org.eclipse.ui.views.properties.IPropertySource;

public class PropertySourceFactory implements IAdapterFactory {

		public PropertySourceFactory() {
			super();
		}

		public Object getAdapter(Object adaptableObject, @SuppressWarnings("rawtypes") Class adapterType) {
			if (IPropertySource.class.equals(adapterType)) {
				if (adaptableObject instanceof GraphitiShapeEditPart) {
					GraphitiShapeEditPart editPart = (GraphitiShapeEditPart) adaptableObject;
					PictogramElement pictogramElement = editPart.getPictogramElement();
					Object object = editPart.getFeatureProvider().getBusinessObjectForPictogramElement(pictogramElement);
					/*if (object instanceof Schema) 
					{
						return new SchemaPropertySource((Schema) object);
					}*/
				}
			}
			return null;
		}

		@SuppressWarnings("rawtypes")
		public Class[] getAdapterList() {
			return new Class[] { IPropertySource.class };
		}
	}