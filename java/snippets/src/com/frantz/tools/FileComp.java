package com.frantz.tools;

import java.io.File;
import java.util.Comparator;

public class FileComp implements Comparator<File>
{
	public int compare(File arg0, File arg1)
	{
		return arg0.compareTo(arg1);
	}
}