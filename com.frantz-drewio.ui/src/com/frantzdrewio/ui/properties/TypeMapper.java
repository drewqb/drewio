package com.frantzdrewio.ui.properties;

import org.eclipse.ui.views.properties.tabbed.ITypeMapper;
import org.eclipse.zest.core.widgets.GraphNode;

public class TypeMapper implements ITypeMapper {

	@Override
	public Class<? extends Object> mapType(Object object) {

		Class<? extends Object> type = object.getClass();
		
		if(object instanceof GraphNode)
		{
			GraphNode bep = (GraphNode)object;
			Object theModel = bep.getData();
			
			return theModel.getClass();
			
		}
		
		return type;
	}

}
