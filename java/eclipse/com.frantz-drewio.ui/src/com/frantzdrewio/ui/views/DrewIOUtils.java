package com.frantzdrewio.ui.views;

import java.io.File;
import java.util.Map;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.swt.SWT;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.ZestStyles;

import com.frantz.drewio.drewIO.Column;
import com.frantz.drewio.drewIO.DrewIOFactory;
import com.frantz.drewio.drewIO.InputStatement;
import com.frantz.drewio.drewIO.Model;
import com.frantz.drewio.drewIO.OutputStatement;
import com.frantz.drewio.drewIO.Statement;

public class DrewIOUtils {
	public static void buildGraphNodes(Graph theGraph, Map<Statement, GraphNode> theMap, Model root)
	{
		for(Statement t : root.getStatements())
		{
				GraphNode refNode = new GraphNode(theGraph, SWT.NONE, t.getName());
				refNode.setBackgroundColor(ColorConstants.lightBlue);
				refNode.setData(t);
				theMap.put(t, refNode);
				
		}
	}
	public static void buildGraphEdges(Graph theGraph, Map<Statement, GraphNode> theMap, Model root)
	{
		for(Statement t : root.getStatements())
		{
			if (t instanceof OutputStatement)
			{
				
				OutputStatement ref = (OutputStatement)t;
				GraphNode gTo = theMap.get(ref);
				if(gTo!=null)
				{
					for(Statement from : ref.getInputs())
					{
						GraphNode gFrom = theMap.get(from);
						if(gFrom!=null)
						{
							new GraphConnection(theGraph, ZestStyles.CONNECTIONS_DIRECTED, gFrom, gTo);
						}
						
					}
				}
			}
		}
	}

	public static Model buildModel(String theFile)
	{
		File aFile = new File(theFile);
		if(aFile.exists())
		{
			aFile.delete();
		}
		XtextResourceSet myResourceSet = new XtextResourceSet();
		URI uri = URI.createFileURI(theFile);
		Resource resource = myResourceSet.createResource(uri);

		Model root = DrewIOFactory.eINSTANCE.createModel();
		resource.getContents().add(root);
		
		for(int x=1;x<5;x++)
		{
			InputStatement in = DrewIOFactory.eINSTANCE.createInputStatement();
			in.setName("Input" + x);
			
			Column c = DrewIOFactory.eINSTANCE.createColumn();
			c.setName("Col");
			c.setType("integer");
			in.getColumns().add(c);
			
			root.getStatements().add(in);
			
		}
		OutputStatement out=null;
		for(int x=1;x<5;x++)
		{
			out = DrewIOFactory.eINSTANCE.createOutputStatement();
			out.setName("Output" + x);
			out.getInputs().add(root.getStatements().get(0));
			root.getStatements().add(out);
		}
		for(int x=1;x<3;x++)
		{
			OutputStatement newOut = DrewIOFactory.eINSTANCE.createOutputStatement();
			newOut.setName(out.getName() + "_" + x);
			newOut.getInputs().add(out);
			root.getStatements().add(newOut);
		}
		try
		{
			SaveOptions saveOptions = SaveOptions.newBuilder().getOptions();
			resource.save(saveOptions.toOptionsMap());	
			
			return createModel( theFile );
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	public static Model createModel(String theFile)
	{
		if (theFile == null || theFile.length()<1)
		{
			return null;
		}
		XtextResourceSet myResourceSet = new XtextResourceSet();
		URI uri = URI.createFileURI(theFile);
		Resource resource = myResourceSet.getResource(uri, true);
		EcoreUtil.resolveAll(resource);

		///////////////////////////////////////////
		return (Model)resource.getContents().get(0);
		
	}
}
