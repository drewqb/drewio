package com.frantz.samples;

public class Foo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i[] = {1,2,3,4,5};
		Character c[] = {'a','b','c','d'};
		printMe(i);
		printMe(c);
	}
	public static <T> void printMe(T[] arr)
	{
		for(T t : arr)
		{
			System.out.println(t);
		}
	}
}
