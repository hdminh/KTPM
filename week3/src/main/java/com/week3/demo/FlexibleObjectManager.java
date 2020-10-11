package com.week3.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FlexibleObjectManager {

    private FlexibleObjectManager(){}

    public static Map<String, Object> initDefaultAttributes(ObjectType type){
        Set<String> keys = type.getStrDefKeys();
        Map<String, Object> attributes = new HashMap<>();
        switch (type){
            case BOOK:
                keys.forEach(key -> attributes.put(key, ""));
                break;
            case PHAN_SO:
                keys.forEach(key -> attributes.put(key, 1));
                break;
            default:
                attributes.put("key", "value");
        }
        return attributes;
    }
}
