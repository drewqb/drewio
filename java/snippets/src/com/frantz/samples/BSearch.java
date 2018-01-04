package com.frantz.samples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BSearch {

	
	public int run(int arr[], int find)
	{
		int lo=0;
		int high=arr.length;
	
		while(lo <=high)
		{
			int mid=lo+(high-lo)/2;
			if(mid>arr.length-1) return -1;
			
			if(arr[mid]==find)
			{
				return mid;
			}
			else if(arr[mid]<find)
			{
				lo=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		
		return -1;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<Integer>();
		Random rand = new Random(); 
		BSearch s = new BSearch();
		for(int x=0;x<500;++x)
		{
			int value = x;//rand.nextInt(1000); 
			arr.add(value);
		}
		Collections.sort(arr);
		int mm[] = arr.stream().mapToInt(Integer::intValue).toArray();
		
		for(int x=0;x<50;++x)
		{
			int value = rand.nextInt(550); 
			System.out.println("value" + value + "found=" + s.run(mm, value));
		}
		
	}

}
