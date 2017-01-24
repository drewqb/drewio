package com.frantz.samples2.codegen;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Bar implements Serializable{

	public int a = 1;
	public int b = 2;
	public int c = 3;
	public double d = 2.0;

	Boolean m_bool1 = new Boolean(true);
	Boolean m_bool2 = new Boolean(false);
	public Double DD = new Double(2.0);
	public ThirdLevel tt = new ThirdLevel();
	public int marrayInt[];
	public double marrayDouble[];
	List<String> mlist = new ArrayList<String>();
	Coordinate m_Location1 = new Coordinate();
	Coordinate m_Location2 = new Coordinate();
	MyEnum ee = MyEnum.RED1;
	List<Coordinate> m_locations = new ArrayList<Coordinate>();
	int myArray[] = {100, 101, 102, 103};
	char myCharArray[] = {'a', 'b', 'c', 'd'};
	
	public Bar() {
		marrayInt = new int[4];
		marrayInt[0] = 999;
		marrayInt[1] = 999;

		marrayDouble = new double[4];
		marrayDouble[0] = 100.12;
		marrayDouble[1] = 200.12;

		mlist.add("abc");
		mlist.add("def");

		Coordinate c1 = new Coordinate();
		c1.x_loc = 10.1;
		c1.y_loc = 20.1;

		Coordinate c2 = new Coordinate();
		c2.x_loc = 22.1;
		c2.y_loc = 32.1;

		m_locations.add(c1);
		m_locations.add(c2);

	}
}
