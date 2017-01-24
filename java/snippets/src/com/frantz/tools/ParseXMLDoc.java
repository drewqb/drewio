package com.frantz.tools;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXParseException;

public class ParseXMLDoc {

	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("args required: xmlFilename");
			return;
		}
		File theFile0 = new File(args[0]);
		if (!theFile0.exists()) 
		{
			System.out.println("Error: invalid file " + theFile0.getAbsolutePath());
			return;
		}
		parse(theFile0);

	}

	public static void parse(File xmlFile)
	{
		try
		{
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			
			NodeList catalogList = doc.getElementsByTagName("CLASSCATALOG");
			for(int hh=0;hh<catalogList.getLength();hh++)
			{
				Integer drg=null;
				Node catNode = catalogList.item(hh);
				Element catElement = (Element) catNode;
				
				System.out.println(catElement.getNodeName() + "  " + catElement.getNodeValue());
			}
		}
		catch(SAXParseException e)
		{
			System.out.println("Parse Error line/col: " + e.getLineNumber() + ":"  + e.getColumnNumber() + " " + e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("ok:" + xmlFile.getAbsolutePath());
	}
}
