package com.hotroute.web1.shared;

import java.io.Serializable;

public class WeatherReport implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -427895213675140797L;
	double m_temp=0;
	String m_location;
	String m_description;
	public WeatherReport()
	{
		
	}
	public WeatherReport(String loc, double t, String desc)
	{
		m_location=loc;
		m_description=desc;
		m_temp=t;
	}
	public double getTemp()
	{
		return m_temp;
	}
	public String getLocation()
	{
		return m_location;
	}
	public String getDescription()
	{
		return m_description;
	}
}
