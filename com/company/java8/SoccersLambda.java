package com.company.java8;
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

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiPredicate;

public class SoccersLambda {
    private static Map<String, String> map = adding();

    public static void main(String[] args) {

        printing(eliminate(map, predicate));
    }


    private static Map<String, String> adding() {
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

    private static void printing(Map<String, String> map) {
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    // BiPredicate<String,String> predicate = (s1,  s2) -> s1.equals(s2);
    private static BiPredicate<String, String> predicate = String::equals;

    private static Map<String, String> eliminate(Map<String, String> map, BiPredicate<String, String> predicate) {

        Map<String, String> tempMap = new HashMap<>();

        for (Map.Entry<String, String> entry1 : map.entrySet()
                ) {
            boolean flag = true;
            String key1 = entry1.getKey();
            String name1 = entry1.getValue();

            for (Map.Entry<String, String> entry2 : map.entrySet()
                    ) {
                String key2 = entry2.getKey();
                String name2 = entry2.getValue();
                if (!predicate.test(key1, key2) && predicate.test(name1, name2)) {
                    flag = false;
                }
            }
            if (flag) tempMap.put(key1, name1);
        }
        return tempMap;
    }

}

