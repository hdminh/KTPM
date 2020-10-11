package com.week3.demo;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Log4j2
@AllArgsConstructor
public class FlexibleObject {
    private final Map<String, Object> attributes;
    private final boolean canAddNew;

    public FlexibleObject(){
        attributes = new HashMap<>();
        canAddNew = false;
    }

    public FlexibleObject(ObjectType type){
        attributes = new HashMap<>();
        canAddNew = false;
        Set<String> keys = type.getStrDefKeys();
        keys.forEach(key -> attributes.put(key, 1));
    }

    public Set<String> getAllKey(){
        return attributes.keySet();
    }

    public Object getKey(String key) {
        if (attributes.containsKey(key)) {
            return attributes.get(key);
        }
        return null;
    }

    public boolean setKey(String key, Object value) {
        if (attributes.containsKey(key)) {
            attributes.replace(key, value);
            return true;
        } else {
            if (isCanAddNew()) {
                attributes.put(key, value);
                return true;
            }
            return false;
        }
    }

    private boolean isCanAddNew() {
        return canAddNew;
    }
}
