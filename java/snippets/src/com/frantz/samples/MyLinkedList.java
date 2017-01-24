package com.frantz.samples;

public class MyLinkedList {
	ListElement root=null;
	public MyLinkedList()
	{
		
	}
	public void add(ListElement l)
	{
		if(l==null) return;
		
		if(root == null)
		{
			root = l;
		}
		else
		{
			ListElement last = getLast();
			if(last!=null)
			{
				last.setNext(l);
			}
		}
	}
	public void remove(ListElement l)
	{
		if(l==null) return;
		
		if(root!=null && root.getData()==l.getData())
		{
			root = root.getNext();
			return;
		}
		ListElement current = root.getNext();
		ListElement previous = root;
		while(current!=null)
		{
			if(current.getData()==l.getData())
			{
				// remove it
				previous.setNext(current.getNext());
				current=null;
				return;				
			}
			previous=current;
			current = current.getNext();
			
		}
	
	}
	public void print()
	{
		if(root==null)
		{ 
			System.out.println("Empty");
			return;
		}
		ListElement l = root;
		while(l!=null)
		{
			System.out.println(l.getData());
			l=l.getNext();
		}
		System.out.println("Size=" + size());
	}
	public ListElement getLast()
	{
		if(root==null) return null;
		ListElement l = root;
		
		while(l.getNext()!=null)
		{
			l=l.getNext();
		}
		return l;
	}
	public int size()
	{
		if(root==null) return 0;
		ListElement l = root;
		int cnt=1;
		while(l.getNext()!=null)
		{
			l=l.getNext();
			++cnt;
		}
		return cnt;
	}
	
	public void insertAt()
	{
		
	}
	// get the M element from the end of the list
	// using a single trversal
	public ListElement getM_ElementFromEnd(int m)
	{
		if(root==null) return null;
		ListElement current = root;
		ListElement mBehind = root;
		for(int x=0;x<m;x++)
		{
			current=current.getNext();
			if(current==null) return null;//
		}
		while(current!=null)
		{
			current=current.getNext();
			mBehind=mBehind.getNext();
		}
		return mBehind;
		
	}
}
