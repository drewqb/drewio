package com.frantzdrewio.sdk.internal;

import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

public class Utils 
{
	static public IWorkbenchPart getViewPart(String sId) 
	{
		IViewReference theViews[] = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getViewReferences();
		for (int x = 0; x < theViews.length; x++) 
		{
			IViewReference theref = theViews[x];
			String theSec = theref.getSecondaryId();
			if (theSec == null && sId.compareTo(theref.getId()) == 0) 
			{
				IWorkbenchPart thePart = theref.getPart(true);
				return thePart;
			}
		}
		return null;
	}
}
