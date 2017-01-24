package com.frantz.samples;
import java.util.ArrayList;
import java.util.List;


public class MyStack 
{
	List <ListElement>myList = new ArrayList<ListElement>();
	public MyStack()
	{
		
	}
	public void push(ListElement l)
	{
		if(l==null) return;
		
		myList.add(0, l);
	}
	public ListElement pop()
	{
		if(myList.isEmpty()) return null;
		return myList.remove(0);
		
	}
	public void print()
	{
		ListElement l = pop();
		while(l!=null)
		{
			System.out.println(l.getData());
			l=pop();
		}
	}
}
