package com.frantzdrewio.sdk;

import com.frantz_drewio.ui.Activator;

public class Studio implements IStudio{

	@Override
	public void logMessage(String str) {
		Activator.getDefault().logMessage(str);
		
	}

}
