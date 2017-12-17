package com.company.Lesson40;

import java.util.*;

public class Task03 {
    static Map<String, String> stringMap = new HashMap<>();

    static Map<String, String> tree = new TreeMap<>(new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return (stringMap.get(o1).length() >= stringMap.get(o2).length())? 1:-1;

        /*    if (stringMap.get(o1).length() > stringMap.get(o2).length()) return 1;
            else if (stringMap.get(o1).length() < stringMap.get(o2).length()) return -1;
            else return 1;*/
        }
    });

    public static void main(String[] args) {

        for (int i = -5000; i < 5000; i += 500) {
            putting("12345" + i * 3, "" + i * 6);

        }
        Iterator<Map.Entry<String, String>> iter = tree.entrySet().iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next().getValue());
        }

    }

    private static void putting(String key, String value) {
        stringMap.put(key, value);
        tree.put(key, value);
        System.out.println(key + "   " + value);
    }

}
