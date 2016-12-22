package com.frantz.drewio.visual.editor.navigator;


import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import com.frantz.drewio.drewIO.Column;
import com.frantz.drewio.drewIO.InputStatement;
import com.frantz.drewio.drewIO.OutputStatement;
import com.frantz.drewio.drewIO.Statement;
import com.frantz.drewio.visual.editor.Activator;

public class StudioLabelProvider extends LabelProvider {

	@Override
	public Image getImage(Object element) {
		if(element instanceof IFile)
		{
			IFile iFile = (IFile)element;

			if("drewio".equals(iFile.getFileExtension()))
			{
				return  super.getImage(element); 
			}
		}	
		if(element instanceof InputStatement)
		{
			return Activator.getDefault().getImageRegistry().get(Activator.INPUT_ST);
		}
		else if(element instanceof OutputStatement)
		{
			return  Activator.getDefault().getImageRegistry().get(Activator.OUTPUT_ST);
		}
		else if(element instanceof Column)
		{
			return  Activator.getDefault().getImageRegistry().get(Activator.COLUMN);
		}
		return super.getImage(element);
	}

	@Override
	public String getText(Object element) {
		if(element instanceof IResource)
		{
			IResource r = (IResource) element;
			return r.getName(); 
		}
		if(element instanceof Statement)
		{
			Statement eo = (Statement)element;
			return eo.getName();
		}
		
		return super.getText(element);
	}

}
