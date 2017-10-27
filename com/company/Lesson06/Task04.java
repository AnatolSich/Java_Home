package com.company.Lesson06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Toll on 29.06.2017.
 */
public class Task04 {
    public static void main(String[] args) {
        Map<Integer, Character> map = new HashMap<>();
        map.put(65, 'a');
        map.put(4, 'b');
        map.put(9, 'c');
        map.put(9, 'd');
        map.put(10, 'e');

        Iterator<Map.Entry<Integer, Character>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<Integer, Character> entry = iter.next();
            System.out.println(entry.getKey() + "     " + entry.getValue());
            System.out.println(entry);
        }
    }
}
