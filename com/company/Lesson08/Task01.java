package com.company.Lesson08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Toll on 06.07.2017.
 */

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.

map.put("Rooney", "Leo");
map.put("Lloris", "Hugo");
map.put("Messi", "Leo");
map.put("Ronaldo", "Cristiano");
map.put("Maldini", "Paolo");
map.put("Indzaghi", "Pipo");
map.put("Del Piero", "Alesandro");
map.put("Balotelli", "Mario");
map.put("Gotze", "Mario");
map.put("Gomez", "Mario");
*/

public class Task01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map = adding();
        printing(map);
        System.out.println("----------------");
        printing(deleting(map));

    }

    private static Map adding() {
        Map<String, String> map = new HashMap<>();
        map.put("Rooney", "Leo");
        map.put("Lloris", "Hugo");
        map.put("Messi", "Leo");
        map.put("Ronaldo", "Cristiano");
        map.put("Maldini", "Paolo");
        map.put("Indzaghi", "Pipo");
        map.put("Del Piero", "Alesandro");
        map.put("Balotelli", "Mario");
        map.put("Gotze", "Mario");
        map.put("Gomez", "Mario");
        return map;
    }

    private static Map deleting(Map<String, String> map) {
        Map<String, String> tempMap = new HashMap<>();

        for (Map.Entry<String,String> entry1 : map.entrySet()) {

            int count2 = 0;
            for (Map.Entry<String,String> entry2 : map.entrySet()) {
                if (entry1.getValue().equals(entry2.getValue()))
                    count2++;

            }
            if (count2<=1) tempMap.put(entry1.getKey(),entry1.getValue());
        }
        return tempMap;
    }

    private static void printing(Map<String, String> map) {
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
