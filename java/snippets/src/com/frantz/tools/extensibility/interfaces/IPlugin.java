package com.frantz.tools.extensibility.interfaces;

import java.util.List;

public interface IPlugin {

	public String getJarPath();
	public String getId();
	public String getDescription();
	public List<IMenuItem> getToolbarMenus();
	public List<IMenuItem> getMenuContribution(String theMenuId);
	public List<String> getDatabaseFiles();
	public List<String> getHelpFiles();
	
	// Notifications
	public void applicationStarting();
	
	public void applicationStopping();
	
}
