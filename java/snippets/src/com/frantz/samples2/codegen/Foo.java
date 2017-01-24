package com.frantz.samples2.codegen;

import java.util.HashMap;
import java.util.Map;

public class Foo {//extends Bar{
	public int a1;
	/*public int b1;
	public int c1;
	private int d1;
	private int e1;
	private int f1;
	ArrayList<IFoo> mfoos1;
	
	ArrayList<IFoo> mfoos2;*/
	IFoo mthefoo = new AFoo();
	Bar mybar = new Bar();
	Bar[] mybar2 = {new Bar(), new Bar()};

	int myArray[] = {100, 101, 102, 103};
	//Map<String, Bar> myMap = new HashMap<String, Bar>();
	//List<Bar> mybars = new ArrayList<Bar>();
	public Foo()
	{
		mthefoo.foo();
		mybar.a=100;
		mybar.b=101;
		mybar2[0].a=1000;
		mybar2[0].b=1001;;
		mybar2[1].a=2000;
		mybar2[1].b=2001;;
		//
		Bar mybar2 = new Bar();
		mybar2.a=2;
		mybar2.b=200;
		//mybars.add(mybar2);
		/*for(int x=0;x<5;++x)
		{
			Bar b = new Bar();
			b.a=500+x;
			myMap.put("key_" + x, b);
		}*/
		
		/**/
	}
	public Map<String, Object> get_Values()
	{
		Map<String, Object> ret = new HashMap<String, Object>();
		
		ret.put("a1", a1);
		
		return ret;
	}
}
