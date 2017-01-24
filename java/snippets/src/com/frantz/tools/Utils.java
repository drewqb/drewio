package com.frantz.tools;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Utils 
{

	static public String getUUID()
	{
		return UUID.randomUUID().toString().toUpperCase();
	}
	static public String getNowAsString()
	{
		DateTimeFormatter dateWriter = DateTimeFormatter.ofPattern("YYYYMMdd_HHmmssSSS");
		
		LocalDateTime date = LocalDateTime.now();
		return date.format(dateWriter);
	}
	
	static public String getSpaces(int level)
	{
		StringBuffer s = new StringBuffer();
		for(int i=0;i<level;++i)
		{
			s.append("    ");
		}
		return s.toString();
	}
	

	static public void collectFiles(File theDir, String base, List<File> theFoundFiles, boolean bBmd) 
	{
		File[] theFiles = theDir.listFiles();
		for (int i = 0; i < theFiles.length; i++) 
		{
			if (theFiles[i].isDirectory()) 
			{
				collectFiles(theFiles[i], base, theFoundFiles, bBmd);
			} 
			else 
			{
				theFoundFiles.add(theFiles[i]);
			}
		}
	}
	static public String getUUIDStr()
	{
		String s= UUID.randomUUID().toString().toUpperCase();
		return s.replaceAll("-", "_");
	}
	static public void collectAllFiles(File theDir, List<File> theFoundFiles) 
	{
		File[] theFiles = theDir.listFiles();
		for (int i = 0; i < theFiles.length; i++) 
		{
			if (theFiles[i].isDirectory()) 
			{
				collectAllFiles(theFiles[i], theFoundFiles);
			} 
			else
			{
				theFoundFiles.add(theFiles[i]);
			}
		}
	}
	static public void collectAllFilesByName(File theDir, String theFilter, List<File> theFoundFiles) 
	{
		File[] theFiles = theDir.listFiles();
		for (int i = 0; i < theFiles.length; i++) 
		{
			if (theFiles[i].isDirectory()) 
			{
				collectAllFilesByName(theFiles[i], theFilter, theFoundFiles);
			} 
			else if(theFiles[i].getName().compareTo(theFilter)==0)
			{
				theFoundFiles.add(theFiles[i]);
			}
		}
	}
	static public void sanitizeAllDBDumpFile(String theDir)
	{
		File theFileDir = new File(theDir);
		List<File> theFoundFiles = new ArrayList<File>();
		collectAllFiles(theFileDir, theFoundFiles);
		
		for(File f : theFoundFiles)
		{
			sanitizeDBDumpFile(f.getAbsolutePath());
		}
		
	}
	static public void sortFile(String theName)
	{
		File theFile0 = new File(theName);
		BufferedReader inFile=null;
		if (!theFile0.exists()) return;
		
		try 
		{
			List<String> temp = new ArrayList<String>();
			inFile = new BufferedReader(new FileReader(theFile0));
			String line = "";
			while ((line = inFile.readLine()) != null) 
			{
				temp.add(line);
			}
			Collections.sort(temp, new StrComp());
			theFile0.delete();
			theFile0.createNewFile();
			FileWriter fw = new FileWriter(theFile0);
			BufferedWriter bw = new BufferedWriter(fw);
			for(String s: temp)
			{
				bw.write(s);
				bw.write("\n");
			}
			bw.close();
		} 
		catch (Exception e) 
		{
		}
		finally
		{
			if(inFile!=null)
			{
				try 
				{
					inFile.close();
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
		}

	}
	static public void sanitizeDBDumpFile(String theName)
	{
		File theFile0 = new File(theName);
		BufferedReader inFile=null;
		if (!theFile0.exists()) return;
		
		try 
		{
			StringBuffer b = new StringBuffer();
			inFile = new BufferedReader(new FileReader(theFile0));
			String line = "";
			boolean bGot=false;
			while ((line = inFile.readLine()) != null) 
			{
				if (line.contains("INSERT INTO")) 
				{
					if(!line.contains("load_log") && !line.contains("dataset_info"))
					{
						//todo strip off rowno column INSERT INTO measure_file VALUES (71436, 99, 26, 0, 0, 0, 11);
						int idx = line.lastIndexOf(',');
						line = line.substring(0, idx) + ");";
						b.append(line);
						b.append("\n");
						bGot=true;
					}
				} 
			}
			if(bGot)
			{
				theFile0.delete();
				theFile0.createNewFile();
				FileWriter fw = new FileWriter(theFile0);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(b.toString());
				bw.close();

				sortFile(theFile0.getAbsolutePath());
			}
		} 
		catch (Exception e) 
		{
		}
		finally
		{
			if(inFile!=null)
			{
				try 
				{
					inFile.close();
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
	public static String getConfigValue(String theKey)
	{
		 Map<String,String> theValues = new HashMap<String,String>();
		 File theIni = new File(getIniConf());
		 populateMap(theIni,theValues);
		 return theValues.get(theKey);
		 
	}
	public static void populateMap(File iniFile, Map<String,String> map) 
	{
		if (iniFile==null || !iniFile.exists()) return;
		
		BufferedReader theReader=null;
		try 
		{
			theReader = new BufferedReader(new FileReader(iniFile));
			String theLine;
			while ((theLine = theReader.readLine()) != null) 
			{
				String tokens[] = theLine.split("=");
				if (tokens.length > 0) {
					String theKey = tokens[0].trim();

					if (tokens.length > 1) {
						String theVal = tokens[1].trim();
						map.put(theKey, theVal);
					} else {
						map.put(theKey, "");
					}
				}
			}
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			if(theReader!=null)
			{
				try 
				{
					theReader.close();
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
	public static String getIniConf()
	{
		return getAppDataEnv() + "/my_config.ini";
	}
	public static String getAppDataEnv()
	{
		return System.getenv("APPDATA");
	}
	
	static public String readFileContents(String theFile)
	{
		StringBuilder bld = new StringBuilder();
		BufferedReader theInFile = null;
		try
		{
			theInFile = new BufferedReader(new FileReader(theFile));
			String theLine;
			while ((theLine = theInFile.readLine()) != null)
			{
				bld.append(theLine);
				bld.append('\n');
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
				}
			}
		}
		return bld.toString();
	}
	public static String runCommand(String command, String theDir) {
		StringBuffer theOut = new StringBuffer();

		Process theProc;
		try {
			theProc = Runtime.getRuntime()
					.exec(command, null, new File(theDir));
			BufferedReader theReader = new BufferedReader(
					new InputStreamReader(theProc.getInputStream()));

			String theLine;
			while ((theLine = theReader.readLine()) != null) {
				theOut.append(theLine + "\n");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return theOut.toString();

	}
}
