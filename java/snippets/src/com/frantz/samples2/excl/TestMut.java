package com.frantz.samples2.excl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Modifier;

import com.frantz.samples2.codegen.EnumSerializer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TestMut {
	public static void main( String [] args ) throws IOException {
        Mut1 m1 = new Mut1();
        Mut2 m2 = new Mut2();
        m1.m2 = m2;
        m2.m1 = m1;
        
        new ObjectOutputStream( new ByteArrayOutputStream( ) ).writeObject( m1 );
        System.out.println("It works");

        
        GsonBuilder gBuilder = new GsonBuilder();
		gBuilder.registerTypeHierarchyAdapter(Enum.class, new EnumSerializer());   
		gBuilder.registerTypeAdapter(Mut2.class, new MyTypeAdapter<Mut2>());
		
		Gson gson = gBuilder.excludeFieldsWithModifiers(Modifier.STATIC).create();
		//JsonElement el = gson.toJsonTree(f);
		String json = gson.toJson(m1);  
		System.out.println(json);
		
		
    }   
}
