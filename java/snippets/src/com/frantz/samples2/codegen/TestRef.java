package com.frantz.samples2.codegen;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class TestRef {

	public String m_field1;
	public String m_field2;
	public String m_field3;
	public String m_field4;
	public String m_field5;
	public String m_field6;
	public String m_field7;
	public String m_field8;
	public String m_field9;
	public String m_field10;
	public String m_field11;
	public String m_field12;
	public String m_field13;
	public String m_field14;
	public String m_field15;

	public String getValues() {
		StringBuffer b = new StringBuffer();
		b.append(m_field1);
		b.append(m_field2);
		b.append(m_field3);
		b.append(m_field4);
		b.append(m_field5);
		b.append(m_field6);
		b.append(m_field7);
		b.append(m_field8);
		b.append(m_field9);
		b.append(m_field10);
		b.append(m_field11);
		b.append(m_field12);
		b.append(m_field13);
		b.append(m_field14);
		b.append(m_field15);

		return b.toString();
	}

	public TestRef(String[] a) {
		m_field1 = a[0];
		m_field2 = a[1];
		m_field3 = a[2];
		m_field4 = a[3];
		m_field5 = a[4];
		m_field6 = a[5];
		m_field7 = a[6];
		m_field8 = a[7];
		m_field9 = a[8];
		m_field10 = a[9];
		m_field11 = a[10];
		m_field12 = a[11];
		m_field13 = a[12];
		m_field14 = a[13];
		m_field15 = a[14];

	}

	public static String listit(Object a) {
		StringBuffer b = new StringBuffer();
		if (a.getClass().isArray()) {
			int len = Array.getLength(a);

			for (int i = 0; i < len; i++) {
				Object theout = Array.get(a, i);
				b.append(theout);
				b.append(",");

			}

		}
		return b.toString();
	}

	public static List<String> getFieldNames(int len) {
		List<String> b = new ArrayList<String>();
		for (int x = 0; x < len; ++x) {
			b.add("A_" + x);
		}

		return b;
	}

	public static List<String> listit2(Object a) {
		List<String> b = new ArrayList<String>();
		if (a.getClass().isArray()) {
			int len = Array.getLength(a);

			for (int i = 0; i < len; i++) {
				Object theout = Array.get(a, i);
				b.add(theout.toString());

			}

		}
		return b;
	}
	// TODO , how to handle enums and maps
	// use the getFiltred below for the dbinsertion
	// add new generated method to getAllFieldNames
	// chage get_SQL_... to return a List<String>
	// build sql string after filtering values
	public static void getFiltered(List<String> allFields,List<String> ppjFields, List<String> ret) 
	{
		HashSet<String> set = new HashSet<String>();
		HashSet<Integer> filtered = new HashSet<Integer>();
		for (String s : ppjFields) {
			set.add(s);
		}

		int idx = 0;
		for (String val : allFields) {
			if (!set.contains(val)) {
				filtered.add(new Integer(idx));
			}
			++idx;
		}

		Iterator<String> itr = ret.iterator();
		idx = 0;
		while (itr.hasNext()) {
			itr.next();
			if (filtered.contains(idx)) {
				itr.remove();
			}
			idx++;
		}
	}
	
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5 };
		double arr2[] = { 1.1, 2.1, 3.1, 4.1, 5.1 };
		System.out.println(listit(arr1));
		System.out.println(listit2(arr2));
		
		List<String> allFields = getFieldNames(arr2.length);
		List<String> actualFields = getFieldNames(arr2.length);
		List<String> ret = listit2(arr2);
		actualFields.remove(arr2.length-1);
		actualFields.remove(1);
		int LOOP = 1;
		Date d1 = new Date();
		for (int x = 0; x < LOOP; ++x) 
		{
			
			getFiltered(allFields, actualFields, ret);
					
			StringBuffer bsql = new StringBuffer();
			int cnt = ret.size();
			for (int i = 0; i < cnt; ++i) {
				bsql.append(ret.get(i));
				if (i < cnt - 1) {
					bsql.append(",");
				}
			}
			if(LOOP==1)System.out.println(bsql.toString());
		}
		
		Date d2 = new Date();
		System.out.println(d2.getTime() - d1.getTime()); // gives the time
	}

	public static void main2(String[] args) {
		List<String> values = new ArrayList<String>();
		for (int x = 0; x < 15; x++) {
			values.add("Test_" + x);
		}
		String[] arr = values.toArray(new String[values.size()]);
		TestRef ref = new TestRef(arr);
		int LOOP = 1000000;
		Date d1 = new Date();
		/*
		 * for(int x=0;x<LOOP;++x) { ref.getValues(); }
		 */

		for (int x = 0; x < LOOP; ++x) {
			Field[] fields = ref.getClass().getFields();
			StringBuffer b = new StringBuffer();
			for (int i = 0; i < fields.length; ++i) {
				fields[i].setAccessible(true);
				try {
					b.append(fields[i].get(ref).toString());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		Date d2 = new Date();
		System.out.println(d2.getTime() - d1.getTime()); // gives the time
															// difference in
		System.out.println((d2.getTime() - d1.getTime()) / 1000); // gives the
																	// time
																	// difference
																	// in s

	}

}
