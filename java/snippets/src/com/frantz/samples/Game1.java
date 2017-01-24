package com.frantz.samples;
import java.awt.Color;
import java.awt.DisplayMode;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;


public class Game1 extends JFrame{

	
	public static void main(String[] args) {
		DisplayMode dm = new DisplayMode(800,600,16,DisplayMode.REFRESH_RATE_UNKNOWN);
		Game1 g = new Game1();
		g.run(dm);
	}
	public void run(DisplayMode dm)
	{
		setForeground(Color.YELLOW);
		setBackground(Color.GREEN);
		
		setFont(new Font("Arial", Font.PLAIN,24));
		Screen s = new Screen();
		try {
			s.setFull(dm, this);
			try {
				Thread.sleep(5000);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		} 
		finally
		{
			s.restoreFullScreen();
		}
		
		
	}
	public void paint(Graphics g)
	{
		
		if(g instanceof Graphics2D)
		{
			Graphics2D g2d = (Graphics2D) g;
			g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		}
		g.drawString("Hello",200,200);
	}
}
