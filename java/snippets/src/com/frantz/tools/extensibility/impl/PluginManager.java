package com.frantz.tools.extensibility.impl;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

import com.frantz.tools.extensibility.interfaces.IPlugin;
import com.frantz.tools.extensibility.interfaces.IPluginManager;

public class PluginManager implements IPluginManager {

	private static String PLUGIN_ID="com.frantz.tools.extensibility.interfaces.IPlugin";
	private List<IPlugin> m_Plugins = new ArrayList<IPlugin>();
	private PluginClassLoader m_Loader=null;
	@Override
	public List<IPlugin> getPlugins() {
		return m_Plugins;
	}
	public PluginManager() 
	{
		m_Loader = new PluginClassLoader((URLClassLoader)ClassLoader.getSystemClassLoader());
	}

	public void loadPlugins() 
	{
		loadPlugin("c:/data/plugin_test.jar");
		inspectPlugins();
	}
	private void loadPlugin(String theJar) 
	{
		
		try 
		{
			File file = new File (theJar);
			m_Loader.addURL(file.toURI().toURL());
			List<String> classes = getPluginClasseNames(m_Loader,theJar);
			for(String theClass : classes)    	
			{
				loadClass(m_Loader, theClass);
			}
		} 
		catch (Exception e) 
		{
			 e.printStackTrace();
		}
		
	}
	private void inspectPlugins()
	{
		for(IPlugin pl : m_Plugins)
		{
	    	System.out.println(pl.getId());
	    	System.out.println(pl.getDescription());

		}
	}
	private boolean isPlugin(ClassLoader loader, String className) 
	{
		try
		{
			Class<?> clazz = loader.loadClass(className);
			for(Class<?> iface : clazz.getInterfaces())
			{
				String iName1 = iface.getCanonicalName();
			
				if(iName1==PLUGIN_ID)
				{
					return true;
				}
			}
	    	
		} 
		catch (Exception ex)
		{
		    ex.printStackTrace();
		}
		return false;
	}
	private List<String> getPluginClasseNames(URLClassLoader loader, String jarName) {
		List<String> classes = new ArrayList<String>();
		try 
		{
			JarInputStream jarFile = new JarInputStream(new FileInputStream(jarName));
			while (true) 
			{
				JarEntry jarEntry = jarFile.getNextJarEntry();
				if (jarEntry == null) 
				{
					break;
				}
				if (jarEntry.getName().endsWith(".class")) 
				{
					String className =jarEntry.getName().replaceAll("/", "\\."); 
					className = className.substring(0, className.indexOf(".class")); 
					if(isPlugin(loader,className))
					{
						classes.add(className);
					}
				}
			}
			jarFile.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return classes;
	}
	private void loadClass(URLClassLoader loader, String className)
	{
	
		try
		{
			Class<?> clazz = loader.loadClass(className);
	    	Class<? extends IPlugin> runClass = clazz.asSubclass(IPlugin.class);
	    	Constructor<? extends IPlugin> ctor = runClass.getConstructor();
	    	IPlugin pl = ctor.newInstance();
	    	m_Plugins.add(pl);
		} 
		catch (Exception ex)
		{
		    ex.printStackTrace();
		}
	}

	public static void main(String[] args) 
	{
		
		PluginManager pl = new PluginManager();
		pl.loadPlugins();
		
		
	}
}
