package com.frantz.samples;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Stack;

/*
 * 
 a balanced tree
 a hash table
 two or three sorts
 BFS, DFS
 permutations of a set

 * Interviewer ask me to solve some permutation related problems.
1) Algorithm to get Index of a permutation when all permutations arranged in lexicographical order
2) and its Complexity

What guarantees does the synchronized keyword give when used on a method? When a thread calls the synchronized method, can another thread call a method that isn't synchronized on the same object?
View Answers (1)

explain pointer arithmetic

 serialize/deserialize a binary tree

 The first one was about finding if an integer k is the some of 2 others taken from a table. 
 The second one was about printing the digits of an integer.
 Having two tree nodes, find a node that is the conman parent
 Given two strings. remove the letters in order from the first string that are in the second.

 Find the median of a very large dataset distributed over several network nodes. 
 the coding question was something about writing an iterator.
 * Write iterator class encapsulating in-order traversal of a binary tree. What is a time complexity? What is a worst case?

 * You have a collection of html documents grouped by a source web site . You need to count frequencies of bi-grams across all documents and present it in a sorted order (may be return top N frequent bi-grams). How would you approach it? How to filter out non-significant bi-grams? How to distribute and merge? What data structures to use to keep counters?

 * OOP. Write classes representing expression tree for a simple calculator. You care only about constants and basic binary operators. Write function evaluating expressions.

 * N clients - M servers. Each server can handle limited number of queries/sec. How to improve availability and performance ?

 * Write code to shift a string with rotation [a, b, c << 2 = 2 c, a, b]

 * How to count frequencies of characters in a string. What if the string is too huge? When is it reasonable to distribute across machines? How to find the most frequent character in the distributed scenario with a minimum data exchange between machines?

 * You are given a huge stream of geo coordinates. Unordered. Return list of objects in a specified radius from some point X.

 Phone Interview:
i) Find the number of inversions in an array (describe & code)
ii) Find collinear points in a given set of 2D points (describe & code)
View Answers (3)

It started with some basic java questions like describe threads, 
inheritance, abstract vs interfaces, static, final.
I was next asked to describe a shortest path algorithm in a graph.
I was then asked about a solution for file upload issue that interviewer has faced. 
It was like there was some issue in uploading more then 3 files at a time. So how will 
you restrict that only 3 files are uploaded at a time where user can enter any number of files. 
So basically 3 files at a time till all the files are done.
My answer was will maintain a count variable. He asked me alternate solution's. I said we can 
use a stack. He then asked me to write the code using the stack solution. He had the google 
doc window shared where i wrote the code. 

 */
public class Test {
	long random_seed=System.nanoTime();
	Random myRand = new Random(random_seed);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.testBtree();
		/*t.testRandUnique();
		t.testPalindrome();
		t.testRotateWrd();
		t.printFizzBuzz();	
		t.testSumInArray(true);
		t.testSumInArray(false);
		t.testInjection();
		t.testBits();
		t.testBits2();
		t.testBits3();
		t.testAtoi();
		t.testLL();
		t.testLLReverse();
		t.testStack();
		t.testSerial();
		t.testLarge();
		t.testMatches();
		t.testInsertSort();*/
	}
	public void testSerial()
	{
		int[] out1={1,17,2,25,12,3,55,36};//new int[cnt];
		//int[] out2=new int[cnt];;
		//genRandAndUnique(cnt,max,out1,out2);
		BinaryTree b = new BinaryTree();
		for(int x=0;x<out1.length;x++)
		{
			int c = out1[x];
			b.insert(c);

		}
		System.out.println("inorder");
		b.printInOrder(b.getRoot());
		String filename = "testbtree.txt";
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		try
		{
			fos = new FileOutputStream(filename);
			out = new ObjectOutputStream(fos);
			out.writeObject(b);
			out.close();

			FileInputStream fis= new FileInputStream(filename);
			ObjectInputStream     in = new ObjectInputStream(fis);
			BinaryTree     bNew = (BinaryTree)in.readObject();
			System.out.println("bnew inorder");
			b.printInOrder(bNew.getRoot());
			in.close();

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public void testStack()
	{
		MyStack l = new MyStack();
		for(int x=0;x<10;x++)
		{
			ListElement e = new ListElement(x);
			l.push(e);
		}
		l.print();
	}
	public void testLLReverse()
	{
		MyLinkedList l = new MyLinkedList();
		for(int x=0;x<10;x++)
		{
			ListElement e = new ListElement(x);
			l.add(e);
		}
		l.print();
		System.out.println("reveresed");

		ListElement ptr = l.root;
		ListElement prev = null;
		ListElement temp=null;
		while(ptr!=null)
		{
			temp = ptr.getNext();
			ptr.setNext(prev);
			prev = ptr;
			ptr = temp;
		}
		l.root = prev;
		l.print();
	}
	public void testLL()
	{
		MyLinkedList l = new MyLinkedList();
		for(int x=0;x<10;x++)
		{
			ListElement e = new ListElement(x);
			l.add(e);
		}
		l.remove(new ListElement(0));
		l.remove(new ListElement(1));
		l.remove(new ListElement(5));
		l.remove(new ListElement(9));
		l.print();
		ListElement m = l.getM_ElementFromEnd(3);
		System.out.println("3 from end = " + m.getData());

	}
	public void testAtoi()
	{
		String arr[] = {"5", "123", "4444", "5001"};
		for(int x=0;x<arr.length;x++)
		{
			int a = atoi(arr[x]);
			System.out.println("X=" + a + ", s2a=" + a*2);
		}
		for(int x=0;x<10;x++)
		{
			System.out.println("x=" + x + ", compare to 7=" + compare(x,7));
		}
	}
	// compare without using comparator operators
	public boolean compare(int a, int b)
	{
		int x=a^b;
		//int count = Integer.bitCount(x);  
		//String s = Integer.toString(x);
		//return s =="0";
		switch(x)
		{
		case 0:
			return true;
		default:
			return false;
		}
	}
	public int atoi(String s)
	{
		Stack <Integer> l = new Stack<Integer>();
		for(int i=0;i<s.length();i++)
		{
			char c =s.charAt(i);
			switch(c)
			{
			case '0':
				l.push(0);
				break;
			case '1':
				l.push(1);
				break;
			case '2':
				l.push(2);
				break;
			case '3':
				l.push(3);
				break;
			case '4':
				l.push(4);
				break;
			case '5':
				l.push(5);
				break;
			case '6':
				l.push(6);
				break;
			case '7':
				l.push(7);
				break;
			case '8':
				l.push(8);
				break;
			case '9':
				l.push(9);
				break;
			}
		}
		int ret = 0;
		int pow = 0;
		while(!l.isEmpty())
		{
			int v = l.pop().intValue();
			double d = Math.pow(10, pow);
			ret += d*v;
			pow++;
		}
		return ret;
	}

	
	public void testPalindrome()
	{
		String []s1 = {"Test","HOHOH", "HzzHzzHzzH", "a"};
		for(int i=0;i<s1.length;i++)
		{
			String ss = s1[i];
			System.out.println(ss + " isPalidrome " + isPalidrome(ss));
		}
	}
	public void testRotateWrd()
	{
		System.out.println(rotateWord("ABCDEF"));
		System.out.println(rotateWord("a"));

		char s [] = {'A', 'B', 'C', 'D', 'E', 'F'};
		char s1 [] = {'A', 'B'};

		rotateWordInPlace2(s);
		System.out.println(s);

		rotateWordInPlace2(s1);
		System.out.println(s1);

	}
	public void testRandUnique()
	{
		int cnt=10, max=100;
		int[] out1=new int[cnt];
		int[] out2=new int[cnt];;
		Test t = new Test();
		t.genRandAndUnique(cnt,max,out1,out2);
		print(out1,out2);

	}
	public void testBtree()
	{
		int cnt=10, max=100;
		int[] out1={21,17,2,25,12,3,10, 1, 55,36};//new int[cnt];
		
		//int[] out2=new int[cnt];;
		//genRandAndUnique(cnt,max,out1,out2);
		BinaryTree b = new BinaryTree();
		for(int x=0;x<out1.length;x++)
		{
			int c = out1[x];
			b.insert(c);

		}
		b.breadthQueu();
		
		BinaryTree.Node n1 = b.lookup(12);
		BinaryTree.Node n2 = b.lookupNon(12);

		System.out.println("inorder");
		b.printInOrder(b.getRoot());

		System.out.println("inorder non");
		b.printInOrderNon(b.getRoot());


		System.out.println("preorder");
		b.printPreOrder(b.getRoot());
		System.out.println("postorder");
		b.printpostOrder(b.getRoot());
		System.out.println("Size = " + b.size() + " depth=" + b.maxDepth());

		int[] tt={1,8,10,20,32,44,88,77,100,1000,10111};

		System.out.println("BS = " + binarySearch(tt,77));
		System.out.println("endBS = ");
		
	}
	// used in c-library
	private static boolean isPowerOfTwoFast(int n) 
	{
		return ((n!=0) && (n&(n-1))==0);

	}

	public void testInjection()
	{
		ICar c = CarFactory.buildCar();
		System.out.print(c.getSpeed());
	}
	public boolean isCircular(LinkedList l)
	{
		Object r = l.getFirst();
		// 2 iterators
		// tortoise and hare alg
		return false;
	}
	boolean hasCircle(List l)
	{
		Iterator i = l.iterator(), j = l.iterator();
		Object slow,fast;
		while (true) {
			// increment the iterators, if either is at the end, you're done, no circle
			if (i.hasNext())  slow=i.next(); else return false;

			// second iterator is travelling twice as fast as first
			if (j.hasNext())  fast=j.next(); else return false;
			if (j.hasNext())  fast=j.next(); else return false;

			// this should be whatever test shows that the two
			// iterators are pointing at the same place
			if (fast==slow) { 
				return true;
			} 
		}
	}
	/*
	 * Write a program that prints the numbers from 1 to 100. 
	 * But for multiples of three print "Fizz" instead of the 
	 * number and for the multiples of five print "Buzz". For 
	 * numbers which are multiples of both three and five print "FizzBuzz".
	 */
	public void printFizzBuzz()
	{
		for(int x=1;x<=100;x++)
		{
			boolean fizz=(x%3==0);
			boolean buzz=(x%5==0);
			if(fizz && buzz)
			{
				System.out.println("FizzBuzz=" + x);
			}
			else if(fizz)
			{
				System.out.println("Fizz=" + x);
			}
			else if(buzz)
			{
				System.out.println("Buzz=" + x);
			}
			else
			{
				System.out.println(x);
			}

		}
	}
	public boolean isPalidrome(String s)
	{
		String s2 = rotateWord(s);

		return (s2.compareTo(s)==0);
	}
	
	public void rotateWordInPlace2(char []s)
	{
		if(s==null || s.length<=1) return;
		int last = s.length-1;
		int mid = s.length/2;

		for(int x=0;x<mid;x++)
		{
			swap(s, x, last-x);
		}

	}
	public void swap(char s[], int l, int h)
	{
		char c = s[l];
		s[l]=s[h];
		s[h]=c;
	}
	public String rotateWord(String s)
	{
		if(s==null || s.length()<1) return "error";

		StringBuffer b = new StringBuffer();
		int sz=s.length()-1;
		for(int x=sz;x>-1;x--)
		{
			b.append(s.charAt(x));
		}
		return b.toString();
	}
	public void genRandAndUnique(int cnt, int max, int[]out1, int[] out2)
	{
		if(cnt>max) {System.out.println("Error");return ;}//todo error
		if(out1==null||out1.length<cnt) {System.out.println("Error");return ;}//todo error
		if(out2==null||out2.length<cnt) {System.out.println("Error");return ;}//todo error
		for(int i=0;i<cnt;i++)
		{
			genRandAndUnique(i, max,out1);
			genRandAndUnique(i, max,out2);
		}

	}
	void genRandAndUnique(int i, int max,int []out1)
	{
		int r1=rand(max);
		while(!isUnique(r1,out1))
		{
			r1=rand(max);
		}
		out1[i]=r1;
	}
	void print(int[]out1, int[] out2)
	{
		for(int i=0;i<out1.length;i++)
		{
			System.out.println("Out1=" + out1[i] + ",Out2=" + out2[i]);
		}
	}
	int rand(int max)
	{
		//return randJ(max);
		//return randKC(max);
		return randDirty(max);
	}
	int randJ(int max) 
	{
		return myRand.nextInt(max);
	}
	int randKnR(int max) 
	{
		random_seed = random_seed * 1103515245 +12345; 
		int ret= (int)(random_seed / 65536) % 32768;
		if (ret < 0) ret = -ret;

		return ret%max;

	}
	int randDirty(int max) 
	{
		random_seed ^= (random_seed<< 21);
		random_seed ^= (random_seed>>> 35);
		random_seed ^= (random_seed << 4);

		int ret = (int)random_seed;
		if (ret < 0) ret = -ret;

		return ret%max;

	}
	boolean isUnique(int n, int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(n==arr[i]) return false;
		}
		return true;
	}
	// find sum in array (1,3,7,8,10,12)
	void testSumInArray(boolean b)
	{
		int arr[] = {1,3,4,5,7,8,10,12};
		int tests[] = {1,6,13,20,4,8,11,19,22};
		for(int i=0;i<tests.length;i++)
		{

			IndexItem idx = b ? sumInArray3(arr, tests[i]) : sumInArray(arr, tests[i]);
			if(idx == null)
			{
				System.out.println("suminArray Failed on" + tests[i]);
			}
			else
			{
				System.out.println("suminArray Success on " + tests[i] + " x=" + idx.x + " y=" + idx.y);
			}
		}

	}
	IndexItem sumInArray3(int arr[], int sum)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int x=i+1;x<arr.length;x++)
			{
				int c=arr[i] + arr[x];
				if(c==sum)
				{
					return new IndexItem(arr[i] , arr[x]);
				}
			}
		}
		return null;

	}
	IndexItem sumInArray(int arr[], int sum)
	{
		Map<Integer, IndexItem> sums = new HashMap<Integer, IndexItem>();
		buildSums(sums,arr);
		return sums.get(new Integer(sum));

	}
	void buildSums(Map<Integer, IndexItem> sums, int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int x=i+1;x<arr.length;x++)
			{
				int sum=arr[i] + arr[x];
				sums.put(new Integer(sum), new IndexItem(arr[i] , arr[x]));
			}
		}
	}
	void print(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("===============");
	}
	public void testInsertSort()
	{
		int size = 200000;
		int arr[] = new int[size];
		int arr2[] = new int[size];
		for(int x=0;x<arr.length;x++)
		{
			arr[x]=myRand.nextInt();
			arr2[x]=arr[x];

		}
		long i = System.currentTimeMillis();
		insertionSort(arr);
		long end = System.currentTimeMillis();
		System.out.println("Insert = " + (end-i)/1000);

		i = System.currentTimeMillis();
		mergeSort(arr2);

		end = System.currentTimeMillis();
		System.out.println("Merge = " + (end-i)/1000);


		//Mergesort m = new Mergesort();
		//m.sort(arr2);



	}
	void insertionSort(int arr[])
	{
		for (int i = 1; i < arr.length; i++) 
		{
			int newValue = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > newValue) 
			{
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = newValue;
		}
	}
	void mergeSort(int numbers[])
	{
		if(numbers.length<=1) return;

		int temp[] = new int[numbers.length];

		mergesort(numbers, temp, 0, numbers.length - 1);
	}

	private void mergesort(int numbers[], int temp[], int low, int high) {
		// Check if low is smaller then high, if not then the array is sorted
		if (low < high) {
			// Get the index of the element which is in the middle
			int middle = (low + high) / 2;
			// Sort the left side of the array
			mergesort(numbers, temp,low, middle);
			// Sort the right side of the array
			mergesort(numbers, temp,middle + 1, high);
			// Combine them both
			merge(numbers, temp, low, middle, high);
		}
	}

	private void merge(int numbers[], int[] temp, int low, int middle, int high) {

		// Copy both parts into the helper array
		for (int i = low; i <= high; i++) {
			temp[i] = numbers[i];
		}
		int i = low;
		int j = middle + 1;
		int k = low;
		// Copy the smallest values from either the left or the right side back
		// to the original array
		while (i <= middle && j <= high) {
			if (temp[i] <= temp[j]) {
				numbers[k] = temp[i];
				i++;
			} else {
				numbers[k] = temp[j];
				j++;
			}
			k++;
		}
		// Copy the rest of the left side of the array into the target array
		while (i <= middle) {
			numbers[k] = temp[i];
			k++;
			i++;
		}
		temp=null;

	}
	void mergea(int numbers[], int temp[], int left, int mid, int right)
	{
		int i, left_end, num_elements, tmp_pos;

		left_end = mid - 1;
		tmp_pos = left;
		num_elements = right - left + 1;

		while ((left <= left_end) && (mid <= right))
		{
			if (numbers[left] <= numbers[mid])
			{
				temp[tmp_pos] = numbers[left];
				tmp_pos = tmp_pos + 1;
				left = left +1;
			}
			else
			{
				temp[tmp_pos] = numbers[mid];
				tmp_pos = tmp_pos + 1;
				mid = mid + 1;
			}
		}

		while (left <= left_end)
		{
			temp[tmp_pos] = numbers[left];
			left = left + 1;
			tmp_pos = tmp_pos + 1;
		}
		while (mid <= right)
		{
			temp[tmp_pos] = numbers[mid];
			mid = mid + 1;
			tmp_pos = tmp_pos + 1;
		}

		for (i=0; i <= num_elements&&right>=0; i++)
		{
			numbers[right] = temp[right];
			right = right - 1;
		}
	}
	int binarySearch(int sorted[], int find)
	{
		int low = 0;
		int high = sorted.length;

		while(low < high)
		{
			int mid = (low + high) / 2;
			if(find < sorted[mid])
			{
				high=mid;
			}
			else if (find > sorted[mid])
			{
				low=mid+1;
			}
			else
			{
				return mid;
			}

		}

		return -1;//not found
	}
	//Example: if the input is (-10, 2, 3, -2, 0, 5, -15), the largest sum is 8
	public void testLarge()
	{
		int a[] =  {-10, 2, 3, -2, 0, 5, -15};
		System.out.println(this.GetLargestContiguousSum(a));
	}
	public int GetLargestContiguousSum(int[]a)
	{
		int sum=0;
		for(int x=0;x<a.length-1;x++)
		{
			for(int j=x+1;j<a.length;j++)
			{
				int temp = a[x]+a[j];
				if(temp >sum) sum=temp;
			}
		}
		return sum;
	}
	public void testMatches()
	{
		String s1 = "DEBITCARDLEFT";
		String s2= "ADEBITCARDLEFT";

		System.out.println(s1 + "," + doesMatch3(s1));
		System.out.println(s2 + "," + doesMatch3(s2));

		String s3 = "DEBITCARD";
		String s4= "DEBITCAR";

		System.out.println(s3 + "," + doesMatch2(s3));
		System.out.println(s4 + "," + doesMatch2(s4));



	}
	boolean lookup(String s)
	{
		String dict [] = {"DEBIT", "CARD", "LEFT"};
		for(int x=0;x<dict.length;x++)
		{
			if(dict[x].compareTo(s)==0) return true;
		}
		return false;
	}
	boolean lookup2(String s)
	{
		String dict [] = {"DEBIT", "CARD"};
		for(int x=0;x<dict.length;x++)
		{
			if(dict[x].compareTo(s)==0) return true;
		}
		return false;
	}
	boolean doesMatch3(String s)
	{

		// no ws, long stream of words,
		// find dictionary items
		// use all letters of string 
		//

		for (int x=0; x < s.length(); x++) 
		{
			String firstPart = s.substring(0, x);
			if (lookup(firstPart))
			{
				for (int j=x+1; j < s.length()-1; j++) 
				{

					String secondPart = s.substring(x,j);
					String thirdPart = s.substring(j, s.length());
					if(lookup(secondPart) && lookup(thirdPart))
					{
						System.out.println(firstPart + ' ' + secondPart + ' ' + thirdPart);
						return true;
					}
				}
			}

		}
		return false;

	}
	boolean doesMatch2(String s)
	{

		// no ws, long stream of words,
		// find dictionary items
		// use all letters of string 
		//

		for (int x=0; x < s.length(); x++) 
		{
			String firstPart = s.substring(0, x);
			String secondPart = s.substring(x,s.length());
			if(lookup2(firstPart) && lookup2(secondPart))
			{
				System.out.println(firstPart + ' ' + secondPart );
				return true;
			}

		}
		return false;

	}
	String readNthLine(String fileName, int n)
	{
		 try {
			 List<String> theFile = readFile(fileName);
			 return theFile.get(n+1);	
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	void ff(int xi)
	{
		for(int i =0;i<10;i++)
		{
			System.out.println("hello");
		}
		
	}
	private List<String> readFile( String file ) throws Exception
	{
		List<String>  stringBuilder = new ArrayList<String>();

		BufferedReader reader= new BufferedReader( new FileReader (file));
	    String         line = null;
	    
    	while( ( line = reader.readLine() ) != null ) {
	        stringBuilder.add( line );
	    }
	    reader.close();
	    return stringBuilder;
	}
}