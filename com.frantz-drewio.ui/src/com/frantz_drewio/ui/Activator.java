package com.frantz_drewio.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.frantzdrewio.i18n.Messages;
import com.frantzdrewio.sdk.IStudio;
import com.frantzdrewio.sdk.Studio;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "com.frantz-drewio.ui"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	private MessageConsoleStream myAuthoringMsgStream;
	private MessageConsole myAuthoringConsole;
	private IStudio myStudio = new Studio();
	
	public Activator() {
	}
	public IStudio getStudio()
	{
		return myStudio;
	}
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
	public void logMessage(String s)
	{
		getAuthoringConsoleStream().println(s);
	}
	
	
	public MessageConsoleStream getAuthoringConsoleStream()
	{
		if(this.myAuthoringMsgStream == null)
		{
			myAuthoringMsgStream = getAuthoringMessageConsole().newMessageStream();
		}
		return myAuthoringMsgStream;
	}
	private MessageConsole getAuthoringMessageConsole()
	{
		if(myAuthoringConsole == null)
		{
			myAuthoringConsole = new MessageConsole(Messages.STUDIO_CONSOLE, null); 
			ConsolePlugin.getDefault().getConsoleManager().addConsoles(new IConsole[]{ myAuthoringConsole });
		}
		return myAuthoringConsole;
	}   
}
