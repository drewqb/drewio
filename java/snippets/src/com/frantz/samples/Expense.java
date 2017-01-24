package com.frantz.samples;


import java.util.HashMap;

public class Expense {
	private String myCompany;
	private double myAmount;
	public Expense(String nm, double amt)
	{
		myCompany=nm;
		myAmount=amt;
	}
	public String getCompany() {return myCompany;}
	public double getAmount() {return myAmount;}
	
	HashMap<String, Expense> build(Expense[] theData)
	{
		HashMap<String, Expense> map = new HashMap<String, Expense>();
		for(Expense e : theData)
		{
			map.put(e.getCompany(), e);
		}
		
		return map;
	}
}
