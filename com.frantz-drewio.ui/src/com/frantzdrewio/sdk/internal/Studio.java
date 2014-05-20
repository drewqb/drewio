package com.frantzdrewio.sdk.internal;

import com.frantz_drewio.ui.Activator;
import com.frantzdrewio.sdk.IStudio;

public class Studio implements IStudio{

	@Override
	public void logMessage(String str) {
		Activator.getDefault().logMessage(str);
		
	}

}
