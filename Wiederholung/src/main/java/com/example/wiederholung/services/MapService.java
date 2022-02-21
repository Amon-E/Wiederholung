package com.example.wiederholung.services;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Service
public class MapService {

    public final Map<String, String> map = new HashMap<>();

    public String get(String param) {
        return map.get(param);
    }

    public void put(String key, String value) {
        map.put(key, value);
    }

    public Set<String> keys() {
        return map.keySet();
    }

    public boolean contains(String key) {
        return map.containsKey(key);
    }


}


