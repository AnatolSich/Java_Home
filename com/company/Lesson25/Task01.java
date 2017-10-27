package com.company.Lesson25;

import java.util.*;

/**
 * Created by Toll on 14.10.2017.
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
      //  deleting(creator());
        deletingFromMap(creator());


    }

    private static Map creator() {
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
        // Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("*********************");
        return map;
    }

    private static Map deleting(Map<String,String> map){
      // List <Map.Entry<String, String>> list = new ArrayList<>();
        Map<String, String> map2 = new HashMap<>();

        for (Map.Entry<String, String> entry1 : map.entrySet()) {
            int i=0;
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                if (entry1.getValue().equals(entry2.getValue())) i++;
            }
            if (i==1) map2.put(entry1.getKey(),entry1.getValue());
        }

        for (Map.Entry<String, String> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        return map2;
    }

    private static void deletingFromMap(Map<String,String> map){
        List<String> keys = new ArrayList<>();

        for (Map.Entry<String, String> entry1 : map.entrySet()) {
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                if (entry1.getValue().equals(entry2.getValue()) && !entry1.getKey().equals(entry2.getKey())){
                    keys.add(entry2.getKey());
                }
            }
        }

       // keys.forEach(map::remove);

        for (String key : keys) {
            map.remove(key);
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}

