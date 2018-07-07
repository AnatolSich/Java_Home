package com.company.java8;
/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.*/

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SoccersStream {
    private static Map<String, String> map = adding();

    public static void main(String[] args) {
        printing(deleting(map));
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
        map.forEach((key, value) -> {
            System.out.print(key + "=");
            System.out.println(value);
        });
    }

    private static Map<String, String> deleting(Map<String, String> map) {
        Map<String, String> tempMap = new HashMap<>();
        Collection<String> collection = map.values();

        for (Map.Entry<String, String> entry : map.entrySet()
                ) {
            String value = entry.getValue();
            long count = collection
                    .parallelStream()
                    .filter(s -> s.equals(value))
                    .count();
            if (count == 1) tempMap.put(entry.getKey(), value);
        }

        return tempMap;
    }
}
