package com.hotroute.web1.shared;

import java.io.Serializable;

public class StockPrice implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6172114557033412260L;
	double m_price=0;
	String m_symbol;
	double m_change=0;
	public StockPrice()
	{
		
	}
	public StockPrice(String s, double p, double ch)
	{
		m_symbol=s;
		m_price=p;
		m_change=ch;
	}
	public double getPrice()
	{
		return m_price;
	}
	public String getSymbol()
	{
		return m_symbol;
	}
	public double getChange()
	{
		return m_change;
	}
}
