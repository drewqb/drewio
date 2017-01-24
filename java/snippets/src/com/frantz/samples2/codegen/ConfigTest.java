package com.frantz.samples2.codegen;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigTest {

	public static void main(String[] args) {

		File f = new File(System.getProperty("user.home") + File.separator + "config.properties");
		if (!f.exists()) 
		{
			System.out.println(System.getProperty("user.home") );
			System.out.println("No props");
			return;
		}
		InputStream input =null;
		
		try 
		{
			Properties prop = new Properties();
			

			// load a properties file
			prop.load(input);
			input = new FileInputStream(f);
			// get the property value and print it out
			System.out.println(prop.getProperty("aaa"));
			System.out.println(prop.getProperty("bbb"));
			System.out.println(prop.getProperty("ccc"));

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
