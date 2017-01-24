package com.frantz.tools.extensibility.impl;

import java.net.URL;
import java.net.URLClassLoader;

public class PluginClassLoader extends URLClassLoader{

	public PluginClassLoader(URLClassLoader classLoader) {
	    super(classLoader.getURLs());

	}

	@Override
	public void addURL(URL url) {
	    super.addURL(url);
	}

}
