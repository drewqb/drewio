package com.frantz.tools.extensibility.interfaces;

import java.util.List;


public interface IMenuItem {
	public String getIdentifier();
	public String getText();
	public String getType();
	public boolean isDisabled();
	  
	public List<IMenuItem> getChildren();
}
