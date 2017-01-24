package com.frantz.samples2.codegen;

import java.lang.reflect.Type;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class EnumSerializer implements JsonSerializer<Enum<?>>
{
    private static final JsonParser mParser = new JsonParser();

    public JsonElement serialize(Enum<?> object_,
        Type type_,
        JsonSerializationContext context_)
    {
        // that will convert enum object to its ordinal value and convert it to json element
        return mParser.parse(((Integer)object_.ordinal()).toString());  
    }
}

