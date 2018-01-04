package com.frantz.samples;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SelSort {

	
	public void sort(int arr[], int start)
	{
		for(int i=0;i<arr.length;++i)
		{
			int idx=i;
			for(int j=i+1;j<arr.length;++j)
			{
				if(arr[j] < arr[idx])
				{
					idx=j;
				}
			}
			if(idx!=i)
			{
				int temp = arr[i];
				arr[i]=arr[idx];
				arr[idx]=temp;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<Integer>();
		Random rand = new Random(); 
		Random ssed = new Random(); 
		rand.setSeed(ssed.nextInt());
		SelSort s = new SelSort();
		for(int x=0;x<10;++x)
		{
			int value = rand.nextInt(1000); 
			arr.add(value);
		}
		//Collections.sort(arr);
		int mm[] = arr.stream().mapToInt(Integer::intValue).toArray();
		s.sort(mm, 0);
		
		for(int x : mm)
		{
			System.out.println("value" + x );
		}
		
	}

}
