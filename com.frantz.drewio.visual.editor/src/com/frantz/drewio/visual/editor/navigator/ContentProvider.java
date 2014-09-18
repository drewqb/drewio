package com.frantz.drewio.visual.editor.navigator;


import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.frantz.drewio.drewIO.Model;

public class ContentProvider implements ITreeContentProvider 
{
	private static final Object[] NO_CHILDREN = new Object[0];
	
	
	public Object[] getChildren(Object parentElement) 
	{
		if(parentElement instanceof EObject)
		{
			return NO_CHILDREN;
		}
		if(parentElement instanceof IFile)
		{
			IFile file = (IFile)parentElement;
			if("drewio".equals(file.getFileExtension()))
			{
				// TODO 
				XtextResourceSet myResourceSet = new XtextResourceSet();
				URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);	
				Resource resource = myResourceSet.getResource(uri, true);

				EcoreUtil.resolveAll(resource);
				Model root = (Model)resource.getContents().get(0);
				List <EObject> ret = new ArrayList<EObject>(); 
				ret.addAll(root.getStatements());
				return ret.toArray();
			}
		}
		return NO_CHILDREN;
	}

	public Object getParent(Object element) {
	
		return null;
	}

	public boolean hasChildren(Object element) 
	{
		if(element instanceof EObject)
		{
			return false;
		}
		if(element instanceof IFile)
		{
			IFile file = (IFile)element;
			if("drewio".equals(file.getFileExtension()))
			{
				return true;
			}
		}
		return false;
	}

	public Object[] getElements(Object inputElement) {

		return getChildren(inputElement);
	}

	public void dispose() {
		// TODO Auto-generated method stub

	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	
	}

}
