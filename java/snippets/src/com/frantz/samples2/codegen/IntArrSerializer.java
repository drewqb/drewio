package com.frantz.samples2.codegen;

import java.lang.reflect.Type;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class IntArrSerializer implements JsonSerializer<int[]>
{
    private static final JsonParser mParser = new JsonParser();

    public JsonElement serialize(int[] arg0,
        Type type_,
        JsonSerializationContext context_)
    {
    	StringBuffer b = new StringBuffer();
    	b.append("'");
    	b.append("{");
    	
    	for(int i : arg0)
    	{
    		b.append(i);
    		b.append(',');
    	}
    	b.append("}");
    	b.append("'");
        return mParser.parse(b.toString());
    }
}

