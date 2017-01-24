package com.frantz.tools;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CppLint {
	class FilePair
	{
		public File m_cpp;
		public File m_header;
		
	}
	private String m_Path;
	private Map<String, Integer> m_IncludeCounts = new HashMap<String, Integer>();
	private StringBuffer m_Buffer=new StringBuffer();
	
	public CppLint() {
		
	}
	public String getName(){return "CPP";}
	public CppLint(String path) {
		m_Path = path;
	}
	void appendLine(String line)
	{
		m_Buffer.append(line);
		m_Buffer.append("\n");
		
	}
	public void testRedunant(Set<String> includes, File f) 
	{
		if(f==null) return;
		
		BufferedReader br = null;
		try
		{
			
			String sCurrentLine;
			br = new BufferedReader(new FileReader(f));
			while ((sCurrentLine = br.readLine()) != null) 
			{
				if (sCurrentLine.contains("#include")) {
					String stest = sCurrentLine.toLowerCase();
					stest = stest.replace("\\", "/");
					stest = stest.replace("<", "\"");
					stest = stest.replace(">", "\"");
					stest=stest.trim();
					if (includes.contains(stest)) 
					{
						appendLine("Dupe: " + stest + "  \t" + f.getAbsolutePath());
					} 
					else 
					{
						includes.add(stest);
					}
					Integer theInt = null;
					if(m_IncludeCounts.containsKey(stest))
					{
						theInt = m_IncludeCounts.get(stest);
						theInt+=1;
					}
					else
					{
						theInt= new Integer(1);
					}
					m_IncludeCounts.put(stest, theInt);
				}
			}
	
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	public void testRedunant(FilePair f) {
		Set<String> includes1 = new HashSet<String>();
		Set<String> includes2 = new HashSet<String>();
		testRedunant(includes1,f.m_cpp);
		testRedunant(includes2,f.m_header);
		
	}
	void writeFile(String theFile)
	{
		File fFile = new File(theFile);
		try (BufferedWriter bwr = new BufferedWriter(new FileWriter(fFile)))
		{
			if(fFile.exists())
			{
				fFile.delete();
			}
			fFile.createNewFile();
			
			
			bwr.write(m_Buffer.toString());
			   
			bwr.flush();
			   
			bwr.close();
		} 
		catch (Exception e) 
		{
		}
	}
	public void analyzeIncludes() {
		List<File> theFoundFiles = new ArrayList<File>();
		int cppCnt = 0;
		int hCnt = 0;
		Utils.collectAllFiles(new File(m_Path), theFoundFiles);
		
		Map<String,FilePair> cppFiles = new HashMap<String,FilePair>();
		
		for (File f : theFoundFiles) 
		{
			String fname = f.getAbsolutePath().toLowerCase();
			int idx = fname.lastIndexOf('.');
			if(idx>0)
			{
				fname = fname.substring(0,idx);
			}
			boolean cpp =f.getAbsolutePath().endsWith("cpp");
			boolean header =f.getAbsolutePath().endsWith("h");
			
			if ( cpp || header) 
			{
				FilePair fp =null;
				if(cppFiles.containsKey(fname))
				{
					fp = cppFiles.get(fname);
				}
				else
				{
					fp = new FilePair();
				}
				if(cpp)
				{
					fp.m_cpp=f;
					++cppCnt;
				}
				else
				{
					fp.m_header=f;
					++hCnt;
				}
				if(fp!=null)
				{
					cppFiles.put(fname, fp);
				}
				
				
			} 
			
			
		}
		for (Map.Entry<String,FilePair> entry : cppFiles.entrySet()) 
		{
			testRedunant(entry.getValue());
		}
		Set<String> dupeControlUnit = new HashSet<String>();
		for (Map.Entry<String,FilePair> entry : cppFiles.entrySet()) 
		{
			if(entry.getValue().m_cpp==null) continue;
			
			String theName = entry.getValue().m_cpp.getName();
			if(dupeControlUnit.contains(theName))
			{
				appendLine("Dupe Control Unit = " + entry.getValue().m_cpp.getAbsolutePath());
			}
			else
			{
				dupeControlUnit.add(theName);
			}
		}
		
		int totalIncludes=0;
		for (Map.Entry<String, Integer> entry : m_IncludeCounts.entrySet()) 
		{
			appendLine(entry.getValue() + ", " + entry.getKey());
			totalIncludes+=entry.getValue();
		}
		appendLine("Cpp/h files = " + cppCnt + "/ " + hCnt);
		appendLine("Unique #includes = " + m_IncludeCounts.size());
		appendLine("Total Include File openings = " + totalIncludes);
		writeFile("c:/data/cpp_analysis.txt");
		System.out.println("Done");
	}
	public static void main(String[] args) {
	
		CppLint lint = new CppLint("C:/projects/drew/drewio/cpp");
		lint.analyzeIncludes();
		
	}
}
