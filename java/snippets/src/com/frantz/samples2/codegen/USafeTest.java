package com.frantz.samples2.codegen;

import java.lang.reflect.Field;

import sun.misc.Unsafe;

public class USafeTest 
{
	@SuppressWarnings("restriction")
	public static Unsafe getUnsafe() {
	    try {
	            Field f = Unsafe.class.getDeclaredField("theUnsafe");
	            f.setAccessible(true);
	            return (Unsafe)f.get(null);
	    } 
	    catch (Exception e) { /* ... */ }
	    return null;
	}
	public static long sizeOf(Object object) {
		   Unsafe unsafe = getUnsafe();
		   return unsafe.getAddress( normalize( unsafe.getInt(object, 4L) ) + 12L );
		}
		 
		public static long normalize(int value) {
		   if(value >= 0) return value;
		   return (~0L >>> 32) & value;
		}
	
	public static void main(String[] args) 
	{
	try {
		TestStruct structure = new TestStruct(); // create a test object
		structure.x = 777;
		 
		long size = sizeOf(structure);
		long offheapPointer = getUnsafe().allocateMemory(size);
		getUnsafe().copyMemory(
		                structure,      // source object
		                0,              // source offset is zero - copy an entire object
		                null,           // destination is specified by absolute address, so destination object is null
		                offheapPointer, // destination address
		                size
		); // test object was copied to off-heap
		 
		Pointer p = new Pointer(); // Pointer is just a handler that stores address of some object
		long pointerOffset = getUnsafe().objectFieldOffset(Pointer.class.getDeclaredField("pointer"));
		getUnsafe().putLong(p, pointerOffset, offheapPointer); // set pointer to off-heap copy of the test object
		 
		//structure.x = 222; // rewrite x value in the original object
		//System.out.println(  ((TestStruct)p.pointer).x  ); // prints 777
	} catch (Exception e) {
		// TODO: handle exception
	}
		
		 
	}
}
