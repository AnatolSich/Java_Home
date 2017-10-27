package com.company.Lesson06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Toll on 29.06.2017.
 *
 *
 */
public class Task03 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Text1ge", "V1");
        map.put(null, "V7");
        map.put(null, "V8");
        map.put("Text2gwrerty", "V2");
        map.put("Text3rew", "V1");
        map.put("Text4", "V1");
        map.put("Text4", "V1");
        map.put("Text5grt", "V5");
        map.put("Text6grt", "V6");
        map.put("Text0fwefwe", "V65");
        map.put("Text20", "V6");

        System.out.println(map.remove("Text1ge"));

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }

        System.out.println("-----------------------");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
