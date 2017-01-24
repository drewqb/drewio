package com.frantz.tools;

import java.util.List;

import com.frantz.tools.extensibility.interfaces.IMenuItem;
import com.frantz.tools.extensibility.interfaces.IPlugin;
public class TestPlugin2 implements IPlugin{

	@Override
	public String getJarPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return "IAmTestPlugin2";
	}

	@Override
	public String getDescription() {
		return "IAmTestPlugin2 descri" ;
	}

	@Override
	public List<IMenuItem> getToolbarMenus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IMenuItem> getMenuContribution(String theMenuId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getDatabaseFiles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getHelpFiles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void applicationStarting() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void applicationStopping() {
		// TODO Auto-generated method stub
		
	}

}
