package com.company.Lesson07;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Toll on 01.07.2017.
 */

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("JUNE 5 1999"));
        map.put("Stallone2", new Date("JUNE 13 1996"));
        map.put("Stallone3", new Date("JUNE 1 1980"));
        map.put("Stallone4", new Date("JUNE 1 1980"));
        map.put("Stallone5", new Date("JUNE 1 1980"));
        map.put("Stallone6", new Date("JUNE 1 1980"));
        map.put("Stallone7", new Date("JUNE 1 1980"));
        map.put("Stallone8", new Date("DECEMBER 1 1980"));
        map.put("Stallone9", new Date("MARCH 1 1980"));
*/

public class Task09 {
    public static void main(String[] args) {
        Map<String, Date> map = new HashMap<>();


        map = adding();
        printing(map);
        System.out.println("-----------------------");
        printing(deleting(map));
    }

    private static Map<String, Date> adding() {
        Map<String, Date> map = new HashMap<>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("JUNE 5 1999"));
        map.put("Stallone2", new Date("JUNE 13 1996"));
        map.put("Stallone3", new Date("JUNE 1 1980"));
        map.put("Stallone4", new Date("JUNE 1 1980"));
        map.put("Stallone5", new Date("JUNE 1 1980"));
        map.put("Stallone6", new Date("JUNE 1 1980"));
        map.put("Stallone7", new Date("JUNE 1 1980"));
        map.put("Stallone8", new Date("DECEMBER 1 1980"));
        map.put("Stallone9", new Date("MARCH 1 1980"));
        return map;
    }

    private static Map deleting(Map<String, Date> map) {


        Iterator<Map.Entry<String, Date>> iter = map.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry<String, Date> entry = iter.next();

            if (entry.getValue().getMonth() > 4 && entry.getValue().getMonth() < 8) iter.remove();
        }
        return map;
    }

    private static void printing(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Date> entry = iter.next();
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
    }

}
