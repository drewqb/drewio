package com.frantzdrewio.ui.views;

import java.util.HashMap;

import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.layouts.algorithms.AbstractLayoutAlgorithm;
import org.eclipse.zest.layouts.dataStructures.InternalNode;
import org.eclipse.zest.layouts.dataStructures.InternalRelationship;

import com.frantz.txtuml.txtUML.ActorDecl;
import com.frantz.txtuml.txtUML.MessageDecl;

public class SeqLayout extends AbstractLayoutAlgorithm {

	private static final double DELTA = 20;
	private static final double VSPACING = 2;

	public SeqLayout(int styles) {
		super(styles);
	}

	protected void layoutActors(InternalNode[] entitiesToLayout, HashMap<ActorDecl, GraphNode> theNodes)
	{
		int x=0;
		for(InternalNode node : entitiesToLayout)
		{
			Object data = node.getLayoutEntity().getGraphData();
			if(data instanceof GraphNode)
			{
				GraphNode gn = (GraphNode)data;
				Object theType = gn.getData();
				if(theType instanceof ActorDecl)
				{
					ActorDecl theActor = (ActorDecl)theType;
					node.setLocation(x, node.getInternalHeight());
					theNodes.put(theActor, gn);
					x += node.getLayoutEntity().getWidthInLayout() + 120;
				}
			}
		}
	}
	protected void layoutMessages(InternalNode[] entitiesToLayout, HashMap<ActorDecl, GraphNode> theNodes, HashMap<MessageDecl, GraphNode> theMsgNodes)
	{
		int y=50;
		for(InternalNode node : entitiesToLayout)
		{
			Object data = node.getLayoutEntity().getGraphData();
			if(data instanceof GraphNode)
			{
				GraphNode gn = (GraphNode)data;
				Object theType = gn.getData();
				if(theType instanceof MessageDecl)
				{
					MessageDecl theMessage = (MessageDecl)theType;
					ActorDecl l = theMessage.getLeftOp();
					ActorDecl r = theMessage.getRighOp();
					GraphNode gnSrc = theNodes.get(l);
					GraphNode gnTar = theNodes.get(r);
					
					int midx = gnTar.getLocation().x > gnSrc.getLocation().x ? gnTar.getLocation().x : gnSrc.getLocation().x;
					midx-=75;
					
					node.setLocation(midx, y);
					y +=  node.getLayoutEntity().getHeightInLayout()+5;
					theMsgNodes.put(theMessage, gn);
				}
			}
		
		}
	}
	protected void applyLayoutInternal(InternalNode[] entitiesToLayout, InternalRelationship[] relationshipsToConsider, double boundsX, double boundsY, double boundsWidth, double boundsHeight) {

		HashMap<ActorDecl, GraphNode> theNodes = new HashMap<ActorDecl, GraphNode>();
		HashMap<MessageDecl, GraphNode> theMsgNodes = new HashMap<MessageDecl, GraphNode>();
		
		layoutActors(entitiesToLayout, theNodes);
		layoutMessages(entitiesToLayout, theNodes, theMsgNodes);
		
		for(InternalNode node : entitiesToLayout)
		{
			Object data = node.getLayoutEntity().getGraphData();
			if(data instanceof GraphNode)
			{
				GraphNode gn = (GraphNode)data;
				Object theType = gn.getData();
				if(theType instanceof MessageEnd)
				{
					MessageEnd theMessage = (MessageEnd)theType;
					ActorDecl l = theMessage.getMyActor();
					MessageDecl msg = theMessage.getMyMsg();
									
					GraphNode gnSrcActor = theNodes.get(l);
					GraphNode gnSrcMsg = theMsgNodes.get(msg);
					int width = gnSrcActor.getSize().width/2;
					int loc = gnSrcActor.getLocation().x; 
					int newx= gnSrcMsg.getLocation().x > loc ? loc+width : loc+width;
					int newy= gnSrcMsg.getLocation().y;
					node.setLocation(newx, newy);
				}
			}
		
		}		
	}
	protected int getCurrentLayoutStep() {
		// TODO Auto-generated method stub
		return 0;
	}

	protected int getTotalNumberOfLayoutSteps() {
		// TODO Auto-generated method stub
		return 0;
	}

	protected boolean isValidConfiguration(boolean asynchronous, boolean continuous) {
		// TODO Auto-generated method stub
		return true;
	}

	protected void postLayoutAlgorithm(InternalNode[] entitiesToLayout, InternalRelationship[] relationshipsToConsider) {
		// TODO Auto-generated method stub
	}

	protected void preLayoutAlgorithm(InternalNode[] entitiesToLayout, InternalRelationship[] relationshipsToConsider, double x, double y, double width, double height) {
		// TODO Auto-generated method stub

	}

	public void setLayoutArea(double x, double y, double width, double height) {
		// TODO Auto-generated method stub
	}
}
