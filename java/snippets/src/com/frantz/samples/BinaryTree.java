package com.frantz.samples;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


public class BinaryTree implements Serializable{
	private Node root; 

	public Node getRoot(){return root;}
	/* 
	   --Node-- 
	   The binary tree is built using this nested node class. 
	   Each node stores one data element, and has left and right 
	   sub-tree pointer which may be null. 
	   The node is a "dumb" nested class -- we just use it for 
	   storage; it does not have any methods. 
	 */ 
	public static class Node implements Serializable{ 
		Node left; 
		Node right; 
		int data;

		Node(int newData) { 
			left = null; 
			right = null; 
			data = newData; 
		} 
	}

	/** 
	   Creates an empty binary tree -- a null root pointer. 
	 */ 
	public BinaryTree() { 
		root = null; 
	} 


	/** 
	   Returns true if the given target is in the binary tree. 
	   Uses a recursive helper. 
	 */ 
	public Node lookup(int data) { 
		return(lookup(root, data)); 
	} 


	/** 
	   Recursive lookup  -- given a node, recur 
	   down searching for the given data. 
	 */ 
	private Node lookup(Node node, int data) { 
		if (node==null) { 
			return null; 
		}
		int currentData = node.data;
		if (data==currentData) 
		{ 
			return node; 
		} 
		else if (data<currentData) 
		{ 
			return(lookup(node.left, data)); 
		} 
		else 
		{ 
			return(lookup(node.right, data)); 
		} 
	} 
	public Node lookupNon(int data) { 
		Node next = root;
		while(next!=null)
		{
			int currentData=next.data;
			if(currentData==data) return next;
			if(data<currentData)
			{
				next = next.left;
			}
			else
			{
				next=next.right;
			}
		}
		return null;

	} 

	public void insert(int data) { 
		root = insert(root, data); 
	} 
	private Node insert(Node node, int data) 
	{ 
		if (node==null) 
		{ 
			node = new Node(data); 
		} 
		else 
		{ 
			if (data <= node.data) 
			{ 
				node.left = insert(node.left, data); 
			} 
			else 
			{ 
				node.right = insert(node.right, data); 
			} 
		}
		return node; // in any case, return the new pointer to the caller 
	} 
	public int size() { 
		return(size(root)); 
	}
	private int size(Node node) { 
		if (node == null)
		{
			return(0); 
		}
		else 
		{ 
			return(size(node.left) + 1 + size(node.right)); 
		} 
	} 
	public int maxDepth() 
	{ 
		return(maxDepth(root)); 
	}
	private int maxDepth(Node node) { 
		if (node==null) 
		{ 
			return(0); 
		} 
		else 
		{ 
			int lDepth = maxDepth(node.left); 
			int rDepth = maxDepth(node.right);

			// use the larger + 1 
			return(Math.max(lDepth, rDepth) + 1); 
		} 
	} 

	public void printPreOrder(Node n)
	{
		if(n==null){return;}
		System.out.println("Data=" + n.data);
		printPreOrder(n.left);
		printPreOrder(n.right);



	}
	public void printInOrder(Node n)	{
		if(n==null){return;}
		printInOrder(n.left);
		System.out.println("Data=" + n.data);

		printInOrder(n.right);



	}
	void print(List<Node> l)
	{
		for(Node n: l)
		{
			System.out.println("Data=" + n.data);
		}
	}
	public void printInOrderNon(Node node)	{
		if(node==null){return;}
		Stack<Node> nodes = new Stack();
		while (!nodes.isEmpty() || null != node) 
		{
			if (null != node) 
			{
				nodes.push(node);
				node = node.left;
			}
			else
			{
				node = nodes.pop();
				System.out.println("Node value: " + node.data);
				node = node.right;
			}
		}      
	}

	public void printpostOrder(Node n)
	{
		if(n==null){
			//System.out.println("End");
			return;
		}
		printpostOrder(n.left);

		printpostOrder(n.right);
		System.out.println("Data=" + n.data);



	}
	public void breadthQueu()
	{
		Queue<Node> q=new LinkedList<Node>();
		Node item;
		if( root != null)
		{
			q.add(root);
			while(!q.isEmpty() )
			{
				item = q.remove();
				System.out.println(item.data);
				if(item != null)
				{
					if(item.left != null)
					{
						q.add(item.left);
					}
					if(item.right != null)
					{
						q.add(item.right);
					}
				}
			}
		}
	}
	public void depthStack()
	{
		if(root==null) return;
		Stack<Node> q=new Stack<Node>();
		HashMap<Node, Node> vis=new HashMap<Node,Node>();

		q.push(root);
		vis.put(root,  root);

		while ( !q.isEmpty())
		{
			Node n = q.peek();
			Node nextNode = n.left;

			if ( nextNode!=null && !vis.containsKey(nextNode))
			{
				vis.put(nextNode,  nextNode);

				q.push(nextNode);               // Process this node first
			}
			else
			{ 
				q.pop();       // Move on to the next node on the stack
			}
		}
	}
}


