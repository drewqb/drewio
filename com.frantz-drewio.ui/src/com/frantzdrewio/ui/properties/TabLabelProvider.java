package com.frantzdrewio.ui.properties;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import com.frantz.drewio.drewIO.Statement;

public class TabLabelProvider implements ILabelProvider {

	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public Image getImage(Object element) {
		
		return null;
	}

	@Override
	public String getText(Object element) {
		Object obj = element;

		if(obj instanceof Statement)
		{
			Statement st = (Statement)obj;
			return st.getName();
		}
		return null;
	}

}
