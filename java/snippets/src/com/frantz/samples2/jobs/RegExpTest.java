package com.frantz.samples2.jobs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpTest {
	public static void test()
	{
		String test[] = {"test *", "** test2", "test3 ***", "test4 ***", "nothing"};
	    //String pattern = "(.*)(\\d+)(.*)";
	    //String pattern = "[*]+";
		String pattern = "[*]{3,}";
	    // Create a Pattern object
	    Pattern r = Pattern.compile(pattern);
	    for(String line : test)
	    {
		    // Now create matcher object.
		    Matcher m = r.matcher(line);
		    if (m.find( )) {
		       System.out.println("Found value: " + m.group(0) );
		      
		    } else {
		       System.out.println("NO MATCH: " + line);
		    }
	    }
	}
	public static void main( String args[] ){
		RegExpTest.test();
		
	String test[] = {"foo= a100?", "foo=\t100", "foo=      100", "foo==\n100"};
    //String pattern = "(.*)(\\d+)(.*)";
    String pattern = "=[\\s]*[0-9]+";
    
    // Create a Pattern object
    Pattern r = Pattern.compile(pattern);
    for(String line : test)
    {
	    // Now create matcher object.
	    Matcher m = r.matcher(line);
	    if (m.find( )) {
	       System.out.println("Found value: " + m.group(0) );
	      
	    } else {
	       System.out.println("NO MATCH: " + line);
	    }
    }
}
}
