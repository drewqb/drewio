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

import com.frantz.txtuml.txtUML.ActorDecl;
import com.frantz.txtuml.txtUML.ActorSectionDecl;
import com.frantz.txtuml.txtUML.MessageDecl;
import com.frantz.txtuml.txtUML.MessageOperator;
import com.frantz.txtuml.txtUML.MessageSectionDecl;
import com.frantz.txtuml.txtUML.Model;
import com.frantz.txtuml.txtUML.SequenceDecl;
import com.frantz.txtuml.txtUML.SequenceSectionDecl;
import com.frantz.txtuml.txtUML.Statement;
import com.frantz.txtuml.txtUML.TxtUMLFactory;




public class TxtUMLUtils {
	public static void buildGraphNodes(Graph theGraph, Map<com.frantz.txtuml.txtUML.ActorDecl, GraphNode> theMap, Model root)
	{
		int x=0;
		int y=0;
		for(Statement t : root.getStatements())
		{
			if (t instanceof SequenceDecl)
			{
				SequenceDecl seq = (SequenceDecl)t;
				for(SequenceSectionDecl sd : seq.getSections())
				{
					if(sd  instanceof ActorSectionDecl)
					{
						ActorSectionDecl ad = (ActorSectionDecl)sd;
						for(ActorDecl actor : ad.getActors())
						{
						
							GraphNode refNode = new GraphNode(theGraph, SWT.NONE, actor.getName());
							refNode.setBackgroundColor(ColorConstants.lightBlue);
							refNode.setData(actor);
							//refNode.setSize(50, 250);
							theMap.put(actor, refNode);
						}
					}
				}
			}
		}
	}
	public static void buildGraphEdges(Graph theGraph, Map<ActorDecl, GraphNode> theMap, Model root)
	{
		for(Statement t : root.getStatements())
		{
			if (t instanceof SequenceDecl)
			{
				SequenceDecl seq = (SequenceDecl)t;
				for(SequenceSectionDecl sd : seq.getSections())
				{
					if(sd  instanceof MessageSectionDecl)
					{
						MessageSectionDecl md = (MessageSectionDecl)sd;
						for(MessageDecl m : md.getMessages())
						{
							ActorDecl l = m.getLeftOp();
							ActorDecl r = m.getRighOp();
							MessageOperator op = m.getOperator();
							String nm = m.getName();
							
							GraphNode gFrom = theMap.get(l);
							GraphNode gTo = theMap.get(r);
							if(gFrom!=null && gTo!=null)
							{
								//GraphConnection gc = new GraphConnection(theGraph, ZestStyles.CONNECTIONS_DIRECTED, gFrom, gTo);
								
								GraphNode msgNode = new GraphNode(theGraph, SWT.NONE, m.getName());
								msgNode.setBackgroundColor(ColorConstants.green);
								msgNode.setData(m);
								
								MessageEnd meLeft = new MessageEnd(m, l);
								GraphNode meLeftNode = new GraphNode(theGraph, SWT.NONE, "");
								meLeftNode.setBackgroundColor(ColorConstants.orange);
								meLeftNode.setData(meLeft);
								
								MessageEnd meRight= new MessageEnd(m, r);
								GraphNode meRightNode = new GraphNode(theGraph, SWT.NONE, "");
								meRightNode.setBackgroundColor(ColorConstants.orange);
								meRightNode.setData(meRight);
								
								
								//GraphConnection gc1 = new GraphConnection(theGraph, ZestStyles.CONNECTIONS_DIRECTED, gFrom, msgNode);
								//GraphConnection gc2 = new GraphConnection(theGraph, ZestStyles.CONNECTIONS_DIRECTED, msgNode, gTo);
								GraphConnection gc1 = new GraphConnection(theGraph, ZestStyles.CONNECTIONS_DIRECTED, meLeftNode, msgNode);
								GraphConnection gc2 = new GraphConnection(theGraph, ZestStyles.CONNECTIONS_DIRECTED, msgNode, meRightNode);
								
								
							}
							
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

		Model root = TxtUMLFactory.eINSTANCE.createModel();
		resource.getContents().add(root);
	
		SequenceDecl seqdecl = TxtUMLFactory.eINSTANCE.createSequenceDecl();
		seqdecl.setName("Sequence1");
		root.getStatements().add(seqdecl);
		
		ActorSectionDecl actorsect = TxtUMLFactory.eINSTANCE.createActorSectionDecl();
		MessageSectionDecl msgsect = TxtUMLFactory.eINSTANCE.createMessageSectionDecl();
		seqdecl.getSections().add(actorsect);
		seqdecl.getSections().add(msgsect);
		
		ActorDecl lastDecl=null;
		ActorDecl firstDecl=null;
		
		for(int x=1;x<5;x++)
		{
			ActorDecl in = TxtUMLFactory.eINSTANCE.createActorDecl();
			in.setName("Actor" + x);
			if(lastDecl!=null)
			{
				MessageDecl msg = TxtUMLFactory.eINSTANCE.createMessageDecl();
				msg.setName("Message" + x);
				msg.setLeftOp(lastDecl);
				msg.setRighOp(in);
				msg.setOperator(MessageOperator.LEFT_MSG);
				msgsect.getMessages().add(msg);
				
			}
			lastDecl=in;
			if(firstDecl==null)
			{
				firstDecl=in;
			}
			actorsect.getActors().add(in);
		}
		MessageDecl mLast = TxtUMLFactory.eINSTANCE.createMessageDecl();
		mLast.setName("MessageLast");
		mLast.setLeftOp(lastDecl);
		mLast.setRighOp(firstDecl);
		mLast.setOperator(MessageOperator.LEFT_MSG);
		msgsect.getMessages().add(mLast);
		
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
