package com.frantz.samples;

public class ListElement {
	ListElement next=null;
	int data=0;
	public ListElement(int d)
	{
		data=d;
	}
	public ListElement getNext() {
		return next;
	}
	public void setNext(ListElement next) {
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
}
