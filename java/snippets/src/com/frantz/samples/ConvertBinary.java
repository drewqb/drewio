package com.frantz.samples;
import java.util.Stack;


public class ConvertBinary {

	public boolean getBit(int num, int i)
	{
		return ((num & (1 << i))!=0);
	}
	public int setBit(int num, int i)
	{
		return (num | (1 << i));
	}
	public int clearBit(int num, int i)
	{
		int mask = ~(1 << i);
		return (num & mask);
	}
	// given n print number next smallest number with same bits and next largest with same bits
	public void testTheBitsDriver()
	{
		int input[] = {100, 5, 7, 22, 1000};
		for(int i : input)
		{
			testTheBits(i);
		}
	}
	public void testTheBits(int number)
	{
		int max = Integer.MAX_VALUE;
		int bitsBase = countBitsSet(number);
		System.out.println("BitCount of  " + number + "  " + bitsBase);
		for(int i=number+1;i<max;i++)
		{
			if(bitsBase == countBitsSet(i))
			{
				System.out.println("Bigger Same=" + i);
				break;
			}
		}
		for(int i=number-1;i>0;i--)
		{
			if(bitsBase == countBitsSet(i))
			{
				System.out.println("Smaller Same=" + i);
				break;
			}
		}
	}
	
	public void testCountBits()
	{
		int input[] = {100, 5, 7, 22, 1000};
		for(int i : input)
		{
			System.out.println("Binary = " +  convertToBinary(i) + " Bit Count = " + countBitsSet(i) + "IntegerBitcnt  = " + Integer.bitCount(i) + "  for " + i);
		}
	}
	public int countBitsSet(int input)
	{
		int count = 0;
		int n = input  ;
		while (n != 0)
		{
			if((n&1)>0)
			{
				count++;
			}
			n=n>>>1;
		}
		return count;
	}
	public void testBits3()
	{
		for(int x=0;x<36;x++)
		{

			System.out.println("x= " + x + " BIN = " + convertToBinary(x));

		}
	}
	public String convertToBinary(int x)
	{
		StringBuffer b = new StringBuffer();
		Stack <String> s = new Stack<String>();
		int n=x;
		if(n==0) return "0";
		while (n != 0)
		{
			if((n&1)>0)
			{
				s.push("1");
			}
			else
			{
				s.push("0");
			}
			n=n>>>1;
		}
		while(!s.empty())b.append(s.pop());

		return b.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConvertBinary t = new ConvertBinary();
		t.testCountBits();
		t.testTheBitsDriver();
	}
		
}
