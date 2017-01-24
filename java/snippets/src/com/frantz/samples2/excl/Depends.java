package com.frantz.samples2.excl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Depends {
	Map<String,List<String>> m_Bucket = new HashMap<String,List<String>>();
	
	public static void main(String[] args) {
		Depends d = new Depends();
		d.run("c:/tools/dep.txt");
	}
	public void run(String theFile)
	{
		read(theFile);
		
		for(String s: m_Bucket.keySet())
		{
			System.out.println(s);
			for(String s1: m_Bucket.get(s))
			{
				System.out.println("   " + s1);
			}
		}
	}
	void read(String theFile0)
	{
		BufferedReader theInFile = null;
		
		String tok1 = "Dump of file ";
		try
		{
			theInFile = new BufferedReader(new FileReader(theFile0));
			String theLine;
			List<String> theList = null;
			String lastKey = "";
			while ((theLine = theInFile.readLine()) != null)
			{
				theLine=theLine.trim();
				if (theLine.startsWith(tok1))
				{
					String theKey = theLine.substring(tok1.length());
					theList =  new ArrayList<String>();
					lastKey = theKey;
					m_Bucket.put(theKey,theList);
					
				}
				else if(theLine.endsWith(".dll"))
				{
					theList.add(theLine);
				}
			}
			if(theList!=null && !theList.isEmpty())
			{
				
			}
		}
		catch (Exception e)
		{
		}
		finally
		{
			if (theInFile != null)
			{
				try
				{
					theInFile.close();
				}
				catch (IOException e)
				{
					System.out.println(e.getMessage());
					
				}
			}
		}
	}
}
