package com.frantz.sandbox;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// .01 to .99 pennies, nickels dimes quarters
// abcdabdabdf - first non repeating char in string
// delDir (File input)

public class TestMore {

	public void pndq(double input2)
	{
		int input = (int) (100*input2);
		int res = cnt(input);
		
		System.out.println("Amt = " +  res + " for input = " + input);
	}
	public int cnt(int input)
	{
		int amt = 0;
		int rem = input;
		while(rem > 0)
		{
			if(rem >= 25)
			{
				amt+=rem/25;
				rem = rem%25;
			}
			else if(rem >= 10)
			{
				amt+=rem/10;
				rem = rem%10;
			}
			else if(rem >= 5)
			{
				amt+=rem/5;
				rem = rem%5;
			}
			else
			{
				break;
			}	
		}
		return amt+rem;
	}
	public static void main(String[] args) {
		
		/*TestMore t = new TestMore();
		
		double d = .01;
		for(int x=0;x<99;x++)
		{
			t.pndq(d);
			d=d+.01;
		}
		*/
		/*replaceStr();
		testprime();
		testIsPrime();
		*/
		char cc[] = "DrewFrantz".toCharArray();
		flipWord(cc);
		System.out.println(cc );
		
	}
	public static void testprime()
	{
		for(int i=2;i<100;i++)
		{
			if( isPrime(i))
			{
				System.out.println("Prime " + i);
			}
			else
			{
				System.out.println( i);

			}
		}
	}
	public static void flipWord(char [] word)
	{
		int j=word.length-1;
		int mid=word.length/2;
		for(int i=0;i<mid;i++,j--)
		{
			char c=word[j];
			word[j]=word[i];
			word[i]=c;
		}
	}
	public static boolean isPrime(int test)
	{
		for(int i=2;i<test;i++)
		{
			if(test % i == 0 )
			{
				return false;
			}
		}
		return true;
	}
	public static void replaceStr()
	{
		String replaceSample = "This String replace Example shows how to replace one char from String";
		String newString1 = replaceSample.replace('r', 't');
		String newString2 = replaceStr(replaceSample, 'r', 't');
		System.out.println(newString1);
		System.out.println(newString2);
		
	}
	public static String replaceStr(String input, char src, char tar)
	{
		StringBuffer b = new StringBuffer();
		for(int i=0;i<input.length();i++)
		{
			char c = input.charAt(i);
			if(c==src)
			{
				b.append(tar);
			}
			else
			{
				b.append(c);

			}
		}
		return b.toString();
	}
	public static boolean isPrime(Integer input)
	{
	    if(input==null) return false; //todo add better error handling 
	    
	    for(int i=2;i<input.intValue();i++)
	    {
	        if(input % i ==0)
	        {
	            return false;
	        }
	    }
	    
	    return true;
	    
	    
	}

	public static void testIsPrime()
	{
	    for(int x=2;x<100;x++)
	    {
	        if(isPrime(new Integer(x)))
	        {
	            System.out.println("IsPrime " + x);
	        }
	        else
	        {
	            //System.out.println("NotPrime " + x);
	        }
	    }
	}
	public static int findDupe(List<Integer> input)
	{
	    if(input==null) return -1;// error
	    if(input.isEmpty()) return -1;// no dupes
	    
	    HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
	    for(Integer i : input)
	    {
	        Integer ii = map.get(i);
	        if(ii!=null)
	        {
	            return ii.intValue();
	        }
	        map.put(ii,ii);
	    }
	    return -1;// no dupes
	}    
	
	class TestArrayList extends ArrayList
	{
	    private boolean m_canhavedupes=true;
	    HashMap<Integer, Object> m_dupecache;
	    
	    public TestArrayList(boolean hasDupes)
	    {
	        m_canhavedupes=hasDupes;
	        
	    }
	    @Override
		public boolean add(Object arg0) {
			// TODO Auto-generated method stub
			return super.add(arg0);
		}
		public void add1(Object someParameterizedObj)
	    {
	        if(!m_canhavedupes)
	        {
	            if(isDupe(someParameterizedObj))
	            {
	                return;
	            }
	            getCache().put(someParameterizedObj.hashCode(), someParameterizedObj);
	            
	        }
	        super.add(someParameterizedObj);
	    }
	    HashMap<Integer, Object> getCache()
	    {
	        if(m_dupecache==null)
	        {
	            m_dupecache = new HashMap<Integer, Object>();
	        }
	        return m_dupecache;
	    }
	    boolean isDupe(Object someParameterizedObj)
	    {
	        Object i = getCache().get(someParameterizedObj.hashCode());
	        if(i==null)
	        {
	            return false;
	        }
	        return true;
	    }
	}
	
}

