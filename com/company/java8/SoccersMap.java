package com.company.java8;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.*/
public class SoccersMap {
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

        map.forEach((key1, value1) -> {
                    boolean flag = true;

                    for (Map.Entry<String, String> entry2 : map.entrySet()
                            ) {
                        String key2 = entry2.getKey();
                        String value2 = entry2.getValue();
                        if (!key1.equals(key2) && value1.equals(value2)) {
                            flag = false;
                        }
                    }
            if (flag) tempMap.put(key1, value1);
                }
        );
        return tempMap;
    }
}
