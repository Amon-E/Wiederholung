package com.example.Wiederholung;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MapService {

    public static HashMap<String, String > map = new HashMap<>();

    public static HashMap FullMap(HashMap input){
        input.put("1","A");
        input.put("2","B");
        return map;
    }

    public static String string(String param){
        FullMap(map);
        String answer = map.get(param);
        return answer;
    }

    public static String add(String plus, String plus2){;
        map.put(plus, plus2);
        return "Key: " + plus + " / Value: " + plus2;
    }

    public static Set<String> returnKeys(){
        return map.keySet();
    }


}


