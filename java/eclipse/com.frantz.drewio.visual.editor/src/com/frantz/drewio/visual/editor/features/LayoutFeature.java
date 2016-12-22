package com.frantz.drewio.visual.editor.features;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.graph.CompoundDirectedGraph;
import org.eclipse.draw2d.graph.DirectedGraph;
import org.eclipse.draw2d.graph.DirectedGraphLayout;
import org.eclipse.draw2d.graph.Edge;
import org.eclipse.draw2d.graph.EdgeList;
import org.eclipse.draw2d.graph.Node;
import org.eclipse.draw2d.graph.NodeList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.impl.MoveShapeContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.AnchorContainer;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;

import com.frantz.drewio.visual.editor.i18n.Messages;

public class LayoutFeature extends AbstractCustomFeature {
	      
	          private static final int PADDING = 7;
	          boolean bTopDown = true;
	      
	          public LayoutFeature(IFeatureProvider fp, boolean topDown) 
	          {
	              super(fp);
	              bTopDown=topDown;
	          }
	      
	          @Override
	          public String getDescription() 
	          {
	        	  if(bTopDown)
	        	  {
	        		  return Messages.LAYOUT_TOPDOWN;
	        	  }
	        	  return Messages.LAYOUT_LEFTRIGHT;
	          }
	      
	          @Override
	          public String getName() 
	          {
	        	  return getDescription();
	          }
	      
	          @Override
	          public boolean canExecute(ICustomContext context) {
	              return true;
	          }
	      
	          @Override
	          public void execute(ICustomContext context) {
	              final CompoundDirectedGraph graph = mapDiagramToGraph();
	              graph.setDefaultPadding(new Insets(50));
	              //outer margin for the entire graph. The margin is the space in
	               //which nodes should not be placed.
	              graph.setMargin(new Insets(35, 15, 0, 0) );

	              // Left to right layour
	              DirectedGraphLayout dgl = new DirectedGraphLayout();
	              if(!bTopDown)
	              {
	            	  transpose(graph);
	              }
	              dgl.visit(graph);
	              if(!bTopDown)
	              {
	            	  transpose(graph);
	              }
	              
	              mapGraphCoordinatesToDiagram(graph);
	          }
	      
	      
	          private Diagram mapGraphCoordinatesToDiagram(CompoundDirectedGraph graph) {
	              NodeList myNodes = new NodeList();
	              myNodes.addAll(graph.nodes);
	              myNodes.addAll(graph.subgraphs);
	              for (Object object : myNodes) {
	                  Node node = (Node) object;
	                  DefaultMoveShapeFeature moveNodeFeature = new DefaultMoveShapeFeature(getFeatureProvider());
	                  Shape shape = (Shape) node.data;
	                  MoveShapeContext context = new MoveShapeContext(shape);
	                  context.setX(node.x);
	                  context.setY(node.y);
	                  moveNodeFeature.moveShape(context);
	              }
	              return null;
	          }
	      
	      
	          private CompoundDirectedGraph mapDiagramToGraph() {
	              Map<AnchorContainer, Node> shapeToNode = new HashMap<AnchorContainer, Node>();
	              Diagram d = getDiagram();
	              CompoundDirectedGraph dg = new CompoundDirectedGraph();
	              dg.setDirection(PositionConstants.SOUTH); 
	              // LEFT_ENTER_RIGHT == CENTER
	              //SOUTH
	              //?? - more variations?
	             EdgeList edgeList = new EdgeList();
	             NodeList nodeList = new NodeList();
	             EList<Shape> children = d.getChildren();
	             for (Shape shape : children) {
	                 Node node = new Node();
	                 GraphicsAlgorithm ga = shape.getGraphicsAlgorithm();
	                 node.x = ga.getX();
	                 node.y = ga.getY();
	                 node.width = ga.getWidth();
	                 node.height = ga.getHeight();
	                 node.data = shape;
	                 shapeToNode.put(shape, node);
	                 nodeList.add(node);
	             }
	             EList<Connection> connections = d.getConnections();
	             for (Connection connection : connections) {
	                 AnchorContainer source =  connection.getEnd().getParent();
	                 AnchorContainer target = connection.getStart().getParent();
	                 Edge edge = new Edge(shapeToNode.get(source), shapeToNode.get(target));
	                 edge.data = connection;
	                 edgeList.add(edge);
	             }
	             dg.nodes = nodeList;
	             dg.edges = edgeList;
	             return dg;
	         }
	     
	          public void transpose(DirectedGraph g)
	      	{
	      		Iterator itNode = g.nodes.iterator();
	      		while (itNode.hasNext()) 
	      		{
	      			Node node = (Node) itNode.next();
	      			int temp = node.x;
	      			int hgt = node.height;
	      			int wdt = node.width;
	      			node.x = node.y;
	      			node.y = temp;
	      			node.height = wdt;
	      			node.width = hgt;
	      			
	      			
	      		}
	      		Iterator itEdges = g.edges.iterator();
	      		while (itEdges.hasNext()) 
	      		{
	      			Edge edge = (Edge) itEdges.next();
	      			if(edge.start !=null)
	      				edge.start = edge.start.getTransposed();
	      			if(edge.end!=null) 
	      				edge.end = edge.end.getTransposed();
	      			
	      			if (edge.vNodes != null)
	      			{
	      				for (Iterator iter2 = edge.vNodes.iterator(); iter2.hasNext();)
	      				{
	      					Object no2 = iter2.next();
	      				    Node n2 = (Node) no2;
	      				    int temp = n2.x;
	      				    int hgt = n2.height;
	      				    n2.x = n2.y;
	      				    n2.y = temp;
	      				    n2.height = n2.width;
	      				    n2.width = hgt;
	      			  }
	      			}
	      	    }		
	      	}	
	    }