package com.frantz.samples;
import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Window;

import javax.swing.JFrame;
public class Screen {
	GraphicsDevice vc;
	public Screen()
	{
		GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
		vc = env.getDefaultScreenDevice();
	}
	public void setFull(DisplayMode dm, JFrame window)
	{
		window.setUndecorated(true);
		window.setResizable(false);
		vc.setFullScreenWindow(window);
		
		if(dm!=null && vc.isDisplayChangeSupported())
		{
			try {
				vc.setDisplayMode(dm);
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	public Window getFullScreenWindow()
	{
		return vc.getFullScreenWindow();
	}
	public void restoreFullScreen()
	{
		Window w = vc.getFullScreenWindow();
		if(w!=null)
		{
			w.dispose();
		}
		vc.setFullScreenWindow(null);
	}
}
