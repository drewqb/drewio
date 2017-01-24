package com.frantz.samples;




public class DStringBuffer {

	private char [] data;
	
	public DStringBuffer()
	{
		
	}
	public void append(String s)
	{
		if(s==null) return; // error
		if(s.length()<1) return; // error
		if(data==null)
		{
			data=new char[s.length()];
			for(int x=0;x< s.length();x++)
			{
				data[x]=s.charAt(x);
			}
		}
		else
		{
			char [] oldData = new char[data.length];
			for(int x=0;x<data.length;x++)
			{
				oldData[x]=data[x];
			}
			data = new char[data.length + s.length()];
			int i=0;
			for(i=0;i<oldData.length;i++)
			{
				data[i]=oldData[i];
			}
			for(int x=0;x<s.length();x++)
			{
				data[i]=s.charAt(x);
				i++;
			}
			
		}
	}
	public String toString()
	{
		String s =  new String();
		for(char c: data)
		{
			s = s+c;
		}
		
		return s;
	}
	
	public static void main(String[] args) 
	{
		DStringBuffer b = new DStringBuffer();
		
		for(int x=0;x<20;x++)
		{
			b.append("String" + x);
		}
		System.out.println(b.toString());

	}

}
