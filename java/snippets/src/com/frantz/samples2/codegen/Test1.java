package com.frantz.samples2.codegen;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.LinkedTreeMap;

public class Test1 {

	public static boolean isPrimitive(Object value) {
		if (value == null) 	return false;
		Class c = value.getClass();
		if (c.isPrimitive() 
				|| c == java.lang.Long.class
				|| c == java.lang.String.class 
				|| c == java.lang.Integer.class
				|| c == java.lang.Double.class 
				|| c == java.lang.Float.class
				|| c == java.lang.Character.class
				|| c == java.lang.Boolean.class
				|| c == java.lang.Short.class) 
		{
			return true;
		}
		return false;
	}
	public static boolean isBoolean(Object value)
	{
		if (value == null) 	return false;
		return (value instanceof Boolean);
		/*
		Class c = value.getClass();
		String type = c.getTypeName().toLowerCase();
		return ( (type.compareTo("java.lang.boolean")==0) || (type.compareTo("boolean")==0));*/
		
	}
	public static void gatherValues(String beginName, Object o, List<Object> values) {
		Class oClass = o.getClass();
		
		if (oClass.isArray()) 
		{
			for (int i = 0; i < Array.getLength(o); i++) 
			{
				Object value = Array.get(o, i);
				if (value != null) 
				{
					if (isPrimitive(value)) 
					{
						if(value.getClass().isEnum())
						{
							Enum e = (Enum)value;
							e.ordinal();
							
						}
						values.add(beginName + "[" + i + "]=" + value);
					} else 
					{
						gatherValues(beginName, value, values);
					}
				}
				else
				{
					values.add(beginName + "[" + i + "]=" + "NULL");
				}
			}
		
		} 
		else 
		{
			while (oClass != null) 
			{
				Field[] fields = oClass.getDeclaredFields();
				for (int i = 0; i < fields.length; i++) 
				{
					if(!Modifier.isStatic(fields[i].getModifiers()))
					{
						fields[i].setAccessible(true);
						try 
						{
							Object value = fields[i].get(o);
							if (value != null) 
							{
								if (isPrimitive(value)) 
								{
									values.add(fields[i].getName() + "=" + value);
								} 
								else 
								{
									gatherValues(fields[i].getName(), value, values);
								}
							}
							else
							{
								values.add(fields[i].getName() + "=" + "NULL");
							}
						} 
						catch (IllegalAccessException e) {
							
						}
					}
					
				}
				oClass = oClass.getSuperclass();
			}
		}
	}

	public static String dump(Object o, int callCount) {
		callCount++;
		StringBuffer tabs = new StringBuffer();
		for (int k = 0; k < callCount; k++) {
			tabs.append("\t");
		}
		StringBuffer buffer = new StringBuffer();
		Class oClass = o.getClass();
		if (oClass.isArray()) {
			buffer.append("\n");
			buffer.append(tabs.toString());
			buffer.append("[");
			for (int i = 0; i < Array.getLength(o); i++) {
				if (i < 0)
					buffer.append(",");
				Object value = Array.get(o, i);
				if (value != null) {
					if (isPrimitive(value)) {
						buffer.append(value);
					} else {
						buffer.append(dump(value, callCount));
					}
				}
			}
			buffer.append(tabs.toString());
			buffer.append("]\n");
		} else {
			buffer.append("\n");
			buffer.append(tabs.toString());
			buffer.append("{\n");
			while (oClass != null) {
				Field[] fields = oClass.getDeclaredFields();
				for (int i = 0; i < fields.length; i++) {
					buffer.append(tabs.toString());
					fields[i].setAccessible(true);
					buffer.append(fields[i].getName());
					buffer.append("=");
					try {
						Object value = fields[i].get(o);
						if (value != null) {
							if (isPrimitive(value)) {
								buffer.append(value);
							} else {
								buffer.append(dump(value, callCount));
							}
						}
					} catch (IllegalAccessException e) {
						buffer.append(e.getMessage());
					}
					buffer.append("\n");
				}
				oClass = oClass.getSuperclass();
			}
			buffer.append(tabs.toString());
			buffer.append("}\n");
		}
		return buffer.toString();
	}
	static void test2(Stuff s, String theNames[])
	{
		Map<String, Object> vals = s.get_Mapped_Values();
		for(String sk : theNames)
		{
			Object v = vals.get(sk);
			
		}
	}
	static void test1(Stuff s, String theNames[])
	{
			
		
		Field[] theFields = s.getClass().getFields();
		for(Field f : theFields)
		{
			f.setAccessible(true);
			try {
				Object v = f.get(s);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	static void doTest()
	{
		Stuff s1 = new Stuff();
		String theName[] = {"m_var177", "m_var10", "m_var150", "m_var151", "m_var152", "m_var153", "m_var154"};
		
		int LOOP = 2000000;
		Date d1 = new Date();
		for (int x = 0; x < LOOP; ++x) 
		{
			test1(s1, theName);
		}
		Date d11 = new Date();
		
		Date d2 = new Date();
		for (int x = 0; x < LOOP; ++x) 
		{
			test2(s1, theName);
		}
		Date d22 = new Date();
		double diff1=d11.getTime() - d1.getTime();
		double diff2=d22.getTime() - d2.getTime();
		
		
		System.out.println((diff1-diff2)/diff1); // gives the time
		System.out.println("Diff1=" + diff1 + " Diff2 = " + diff2);
		
	}
	public static void gatherValues(Map<String, Object> theValues, Map<String,?> theMap, String theTab, String theParentKey)
	{
		Set<String> theKeys = theMap.keySet();
		
		for(String k : theKeys)
		{
			Object o1 = theMap.get(k);
			String newKey = theParentKey.isEmpty() ? k : theParentKey + "." + k;
			if(o1 instanceof LinkedTreeMap)
			{
				Map<String,?> jj = (Map<String,?>)o1;
				System.out.println(theTab + "key=" + k + "  Parent=" + newKey + "(" +  o1.getClass().getCanonicalName() + ")");
				gatherValues(theValues, jj, theTab + "   " , newKey);
			}
			else
			{
				theValues.put(newKey.toLowerCase(),  o1);
				System.out.println(theTab + "key=" + k +  "  Parent=" + newKey + " val = " + o1 + " type = " + o1.getClass().getCanonicalName());
			}
		}
	}
	public static byte[] readCompressedByteArray(byte[] buffer) throws IOException {
		 
		  GZIPInputStream gzi=new GZIPInputStream(new ByteArrayInputStream(buffer,0,buffer.length));
		  byte[] outbuf=new byte[buffer.length];
		  ByteArrayOutputStream bos=new ByteArrayOutputStream();
		  int len;
		  while ((len=gzi.read(outbuf,0,outbuf.length)) != -1) {
		    bos.write(outbuf,0,len);
		  }
		  byte[] decompressed=bos.toByteArray();
		  bos.close();
		  gzi.close();
		  return decompressed;
		}
	public static byte[] readCompressedByteArray2(byte[] compressedData) throws Exception {
	   
	    Inflater decompressor = new Inflater();
	    decompressor.setInput(compressedData);
	    ByteArrayOutputStream bos = new ByteArrayOutputStream(compressedData.length);
	    byte[] buf = new byte[1024];
	    while (!decompressor.finished()) {
	      int count = decompressor.inflate(buf);
	      bos.write(buf, 0, count);

	    }
	    bos.close();
	    return bos.toByteArray();

	  }
	 public static void serialize(Object obj, String fileName)
	            throws IOException {
	        FileOutputStream fos = new FileOutputStream(fileName);
	        ObjectOutputStream oos = new ObjectOutputStream(fos);
	        oos.writeObject(obj);
	 
	        fos.close();
	    }
	public static void main(String[] args) {
		//doTest();
		//String json = JsonWriter.objectToJson(user1);
		Bar f = new Bar();
		try {
			SerialTest t = new SerialTest();
			t.setId(100);
			t.setName("ThisIsTheName");
			t.setSalary(500);
			serialize(t, "c:/src/Foo.ser");	
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//FileWriter fileWriter = new FileWriter(jsonFilePath);
		//Gson gson = new GsonBuilder().excludeFieldsWithModifiers(Modifier.STATIC).setPrettyPrinting().create();
		GsonBuilder gBuilder = new GsonBuilder();
		gBuilder.registerTypeHierarchyAdapter(Enum.class, new EnumSerializer());   
		gBuilder.registerTypeAdapter(Boolean.class, new BooleanSerializer());   

		gBuilder.registerTypeAdapter(int[].class, new IntArrSerializer());   
		gBuilder.registerTypeAdapter(char[].class, new CharArrSerializer());   
		Gson gson = gBuilder.excludeFieldsWithModifiers(Modifier.STATIC).create();
		//JsonElement el = gson.toJsonTree(f);
		String json = gson.toJson(f);  
		
		
		Map<String, Object> jmap = gson.fromJson(json, Map.class);
		Map<String, Object> theValues = new HashMap<String, Object>();
		
		gatherValues(theValues, jmap, "   ", "");
		Set<String> theKeys = theValues.keySet();
		for(String k : theKeys)
		{
			Object o1 = theValues.get(k);
			System.out.println(k + " = " + o1 + "(" + o1.getClass().getCanonicalName() + ")");
		}
		
		System.out.println(json);
		System.out.println(jmap.get("m_third"));
		
		
		
		/*
		HashMap<String, String> m = new HashMap<String, String>();

		for (int x = 0; x < 10; x++) {
			m.put("key" + x, "value" + x);
		}

		List<String> filtered = m.values().stream()
				.filter(item -> item.contains("2"))
				.collect(Collectors.toList());
		System.out.println(filtered);

		Foo f = new Foo();
		List<Object> values = new ArrayList<Object>();
		gatherValues("", f, values);
		for(Object oo : values)
		{
			System.out.print(oo.toString() + " , ");
		}
		System.out.println("");
		boolean b = false;
		System.out.println(isBoolean(b));
		System.out.println(isBoolean(new Boolean(false)));
		System.out.println(isBoolean("Boolean"));
		*/
		
		
		// System.out.println(dump(f,0));
		/*
		 * List<Field> theFields = getAllFields(f.getClass()); for(Field f1 :
		 * theFields) {
		 * 
		 * if (f1.getGenericType() instanceof ParameterizedType) {
		 * ParameterizedType pt = (ParameterizedType) f1.getGenericType();
		 * System.out.println("raw type: " + pt.getRawType());
		 * System.out.println("owner type: " + pt.getOwnerType());
		 * System.out.println("actual type args:"); for (Type t :
		 * pt.getActualTypeArguments()) { Class cl = (Class)t;
		 * System.out.println("    " + cl.getTypeName() + " isInterface=" +
		 * cl.isInterface()); } } else { System.out.println(f1.getName() +
		 * "  Type=" + f1.getType() + "  GenType=" +
		 * f1.getGenericType().getTypeName()); f1.setAccessible(true); try {
		 * Object theData = f1.get(f); if(theData!=null) {
		 * System.out.println("data=" + theData); } } catch
		 * (IllegalArgumentException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } catch (IllegalAccessException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * 
		 * }
		 * 
		 * }
		 */

		// System.out.println(m.entrySet().stream().toArray());
		/*
		 * .collect(Collectors.toMap( Map.Entry::getValue, Map.Entry::getKey))
		 * );
		 */
	}

	public static List<Field> getAllFields(Class<?> inputType) {
		List<Field> fields = new ArrayList<Field>();
		for (Class<?> cl = inputType; cl != null; cl = cl.getSuperclass()) {
			fields.addAll(Arrays.asList(cl.getDeclaredFields()));
		}
		return fields;
	}

}
