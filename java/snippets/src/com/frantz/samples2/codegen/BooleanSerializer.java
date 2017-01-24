package com.frantz.samples2.codegen;

import java.lang.reflect.Type;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class BooleanSerializer implements JsonSerializer<Boolean>
{
    private static final JsonParser mParser = new JsonParser();

    public JsonElement serialize(Boolean arg0,
        Type type_,
        JsonSerializationContext context_)
    {
    	 int value = arg0.booleanValue() ? 1 : 0;
         return new JsonPrimitive(value);
    }
}

