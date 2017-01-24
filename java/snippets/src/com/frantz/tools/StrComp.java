package com.frantz.tools;

import java.util.Comparator;

public class StrComp implements Comparator<String>
{
	public int compare(String arg0, String arg1)
	{
		return arg0.compareTo(arg1);
	}
}