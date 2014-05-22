package com.frantzdrewio.ui.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;

import com.frantzdrewio.sdk.internal.Utils;
import com.frantzdrewio.ui.views.DrewIOView;

public class ShowInViewer extends AbstractHandler implements IEditorActionDelegate{

	private IEditorPart myPart;
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEditorPart part = HandlerUtil.getActiveEditor(event);
		return handleRun(part);
	}

	@Override
	public void run(IAction action) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		myPart=targetEditor;
		
	}
	Object handleRun(IEditorPart ed)
	{
		if(ed==null) return null;
		
		IEditorInput theInput = ed.getEditorInput();
		if(theInput instanceof org.eclipse.ui.part.FileEditorInput)
		{
			org.eclipse.ui.part.FileEditorInput fi = (org.eclipse.ui.part.FileEditorInput)theInput;
			String thePath = fi.getFile().getRawLocation().toOSString();
			IWorkbenchPart thePart = Utils.getViewPart(DrewIOView.ID);
			
			if(thePart instanceof DrewIOView)
			{
				DrewIOView div = (DrewIOView)thePart;
				div.openModel(thePath);
				
			}
		}
		return null;
		
	}
	

}
