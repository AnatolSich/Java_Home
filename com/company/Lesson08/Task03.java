package com.company.Lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Toll on 06.07.2017.
 */

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
    map.put("January",1);
        map.put("February",2);
        map.put("March",3);
        map.put("April",4);
        map.put("May",5);
        map.put("June",6);
        map.put("July",7);
        map.put("August",8);
        map.put("September",9);
        map.put("October",10);
        map.put("November",11);
        map.put("December",12);
*/

public class Task03 {
    public static void main(String[] args) throws IOException {
        printing(adding());
    }
    private static Map adding (){
        Map <String,Integer> map = new HashMap<>();
        map.put("January",1);
        map.put("February",2);
        map.put("March",3);
        map.put("April",4);
        map.put("May",5);
        map.put("June",6);
        map.put("July",7);
        map.put("August",8);
        map.put("September",9);
        map.put("October",10);
        map.put("November",11);
        map.put("December",12);
        return map;
    }

    private static void printing(Map<String, Integer> map) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String str = bfr.readLine();
            if (str.isEmpty()) break;
            Integer i = Integer.parseInt(str);
            for (Map.Entry<String,Integer> entry : map.entrySet()) {
                if(i==entry.getValue()) System.out.println(entry.getKey());
            }
        }
    }
}
