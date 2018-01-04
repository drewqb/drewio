package com.frantz.tools;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Renamer {
	public void collectAllFilesByExt(File theDir, String theExt, List<File> theFoundFiles) 
	{
		File[] theFiles = theDir.listFiles();
		for (int i = 0; i < theFiles.length; i++) 
		{
			if (theFiles[i].isDirectory()) 
			{
				collectAllFilesByExt(theFiles[i], theExt, theFoundFiles);
			} 
			else if(theFiles[i].getName().endsWith(theExt))
			{
				theFoundFiles.add(theFiles[i]);
			}
		}
	}
	public void run()
	{
		File theStart = new File("C:/Users/drew/Desktop/host/lax/lax_2017/west_deptford");
		String ext = ".JPG";
		String prefix = "west_deptford_";
		List<File> theFoundFiles = new ArrayList<File>();
		collectAllFilesByExt(theStart,ext,  theFoundFiles);
		int x=0;
		for(File f : theFoundFiles)
		{
			File newFile = new File(theStart.getAbsolutePath() + "/" +prefix+ x + ext);
			f.renameTo(newFile);
			++x;
		}
	}
	public static void main(String[] args) {
		
		Renamer r = new Renamer();
		r.run();
		System.out.println("Done");
		
	}
}