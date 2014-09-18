package com.frantz.drewio.visual.editor;

import java.text.MessageFormat;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.frantz.drewio.visual.editor.i18n.Messages;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "com.frantz.drewio.visual.editor"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	public static final String INPUT_ST = "icons/tool16/input_st.gif";
	public static final String OUTPUT_ST = "icons/tool16/output_st.gif";
	public static final String COLUMN =     "icons/tool16/column.gif";
	
	public static final String[] ALL_IMAGES={INPUT_ST,OUTPUT_ST,COLUMN};
	private MessageConsoleStream myAuthoringMsgStream;
	private MessageConsole myAuthoringConsole;
	public Activator() {
	}
	@Override
	protected void initializeImageRegistry(ImageRegistry reg) {
        super.initializeImageRegistry(reg);
        for(int x=0;x< ALL_IMAGES.length;x++)
		{
			try
			{
				reg.put(ALL_IMAGES[x], getImageDescriptor(ALL_IMAGES[x]).createImage());
			}
			catch(Exception e)
			{
				Object args[] = {ALL_IMAGES[x]};
				String theResult = MessageFormat.format("Error: Cannot find {0}", args);
				logMessage(theResult);
				
			}
		}	
        
    }
	public void logMessage(String s)
	{
		getDefaultConsoleStream().println(s);
	}
	
	
	public MessageConsoleStream getDefaultConsoleStream()
	{
		if(this.myAuthoringMsgStream == null)
		{
			myAuthoringMsgStream = getDEfaultMessageConsole().newMessageStream();
		}
		return myAuthoringMsgStream;
	}
	private MessageConsole getDEfaultMessageConsole()
	{
		if(myAuthoringConsole == null)
		{
			myAuthoringConsole = new MessageConsole(Messages.STUDIO_CONSOLE, null); 
			ConsolePlugin.getDefault().getConsoleManager().addConsoles(new IConsole[]{ myAuthoringConsole });
		}
		return myAuthoringConsole;
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
}
