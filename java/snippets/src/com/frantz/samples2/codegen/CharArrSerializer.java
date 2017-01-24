package com.frantz.samples2.codegen;

import java.lang.reflect.Type;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class CharArrSerializer implements JsonSerializer<char[]>
{
    private static final JsonParser mParser = new JsonParser();

    public JsonElement serialize(char[] theInput,
        Type type_,
        JsonSerializationContext context_)
    {
       StringBuffer b = new StringBuffer();
       for(char c : theInput)
       {
    	   b.append(c);
       }
        return mParser.parse(b.toString());  
    }
}

