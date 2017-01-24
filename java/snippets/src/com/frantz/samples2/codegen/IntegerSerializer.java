package com.frantz.samples2.codegen;

import java.lang.reflect.Type;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class IntegerSerializer implements JsonSerializer<Integer>
{
    private static final JsonParser mParser = new JsonParser();

    public JsonElement serialize(Integer arg0,
        Type type_,
        JsonSerializationContext context_)
    {
    	
         return new JsonPrimitive(arg0);
    }
}

