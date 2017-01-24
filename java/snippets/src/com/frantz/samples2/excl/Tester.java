package com.frantz.samples2.excl;

import java.awt.SystemTray;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.UIManager;

public class Tester {

	interface MyClosureScope
	{
		public void run2();
	}
	public static void awttChoose()
	{
		JFileChooser fc = new JFileChooser();
		fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		fc.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				// TODO Auto-generated method stub
				
			}

			
		});
		int ret = fc.showOpenDialog( null);
		if(ret ==  JFileChooser.APPROVE_OPTION)
		{
			
			File f = fc.getSelectedFile();
			System.out.println("Approve" + f.getAbsolutePath());
		}
	}
	
	public static void main(String[] args) {
		MyClosureScope r = () -> 
		{
			System.out.println("Hello!");
		};
		r.run2();
		
		SystemTray.getSystemTray();
		try
		{
			System.out.println("Begin!");
		}
		finally
		{
			System.out.println("End!");
		}
		 try {
		        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		    }catch(Exception ex) {
		        ex.printStackTrace();
		    }
		 awttChoose();
	}

}
