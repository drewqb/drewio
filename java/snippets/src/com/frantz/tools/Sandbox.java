package com.frantz.tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
public class Sandbox {


	public static void createTrades()
	{
		
		StringBuffer b = new StringBuffer();
		String desc[] = {"GOOG", "APPL", "FB", "AMZN"};
		
		b.append("trade_id,description,shares,price\n");
		int loop = 20000;
		int id=1;
		for(String s: desc)
		{
			for(int i=0;i<loop;++i, ++id)
			{
				b.append(id);
				b.append(',');
				
				b.append(s);
				b.append(',');
				
				b.append(100+i);
				b.append(',');
				
				b.append(200+i);
				b.append('\n');
				
			}
		}
		try {
			PrintWriter writer = new PrintWriter("c:/data/trades2.unclass", "UTF-8");
			writer.println(b.toString());
			
			writer.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public static String getGitRevision( String path){
		try{
			//String cmd = "git log --pretty=format:%h  " + path;
			
			ProcessBuilder builder = new ProcessBuilder("git", "log", "--pretty=format:%h");
			builder.directory(new File(path));
			Process process = builder.start();
			BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String str =  in.readLine();
			if(str!=null)
			{
				str = str.trim().toLowerCase();
			}
			return str;

		}
		catch(Exception ioe){
			System.err.println(ioe.getMessage());
			return "";
		}
	}

	public static void main3(String[] args) {
		//System.out.println(System.getProperty("java.home"));
		long ss = 0x00010008;
		System.out.println(ss);
		for(int i=0;i<25;++i)System.out.print("$");
		//testLogging();
		
	}

	public static String jsonTest()
	{

		String jsonStr = Utils.readFileContents("/data/json1.str");
		JsonParser parser = new JsonParser();
		JsonObject json = parser.parse(jsonStr).getAsJsonObject();
		String firstName = json.get("firstname").getAsString();
		System.out.println("The first name is: " + firstName);
		long id =  json.get("id").getAsLong();
		System.out.println("The id is: " + id);
		return jsonStr;
		/*JsonArray jsonFiles = json.getAsJsonArray("runtimeLogFiles");
		for (JsonElement jElement : jsonFiles)
		{
			JsonObject jsonDataset = jElement.getAsJsonObject();
			String sfile = jsonDataset.get("fileName").getAsString();
			System.out.println(sfile);
		}*/
		
	}
		
	static public String geUrlFromConfig(int portTry,String theStrUrl)
	{
		try
		{
			
			int irange=10; 
			int idx=0;
			int timeout=500;
			while(idx<irange)
			{
				//String theUrl = "http://localhost:" + portTry +"/path";
				System.out.println("Test port " + theStrUrl);
				URL theUrl = new URL(theStrUrl);
				++portTry;
				++idx;
				try
				{
					HttpURLConnection theConn = (HttpURLConnection) theUrl.openConnection();
					theConn.setConnectTimeout(timeout);
					theConn.setRequestMethod("GET");
					theConn.connect();
					if(theConn.getResponseCode()==200)
					{
						return theStrUrl;
					}
				}
				catch(Exception e)
				{
				}
				Thread.sleep(timeout);
			}
		}
		catch (Exception e)
		{
		}
		return "";
	}
	
	public static void main(String[] args) {
		//createTrades();
		//readDeployment();
		
		
	
		
		/*ResourceUtilities.getInstance().configure(getUrl());
		
		LoggingInfo info = new LoggingInfo();
		String jsonStr = info.getLogFiles();
		JsonParser parser = new JsonParser();
		JsonObject json = parser.parse(jsonStr).getAsJsonObject();
		JsonArray jsonFiles = json.getAsJsonArray("runtimeLogFiles");
		for (JsonElement jElement : jsonFiles)
		{
			JsonObject jsonDataset = jElement.getAsJsonObject();
			String sfile = jsonDataset.get("fileName").getAsString();
			System.out.println(sfile);
		}
	*/
	
		System.out.println("Done sandbox");
	}

}
