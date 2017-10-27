package com.company.Lesson06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Toll on 29.06.2017.
 */

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Task07 {

    public static void main(String[] args) throws IOException {
        Map<String, String> mapName = new HashMap<>();
        mapName =creating();
        printingMap(mapName);
        System.out.println(serch(mapName,"003"));
    }

    private static Map<String, String> creating() throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> mapName = new HashMap<>();
        while (true) {
            String str1 = bfr.readLine();
            if (str1.isEmpty()) break;
            else {
                String str2 = bfr.readLine();

                if (str2.isEmpty()) break;
                else mapName.put(str1, str2);
            }

        }
        return mapName;
    }
    private static int serch (Map<String,String> map, String name){
        Iterator <Map.Entry<String,String>> iter = map.entrySet().iterator();
        int i =0;
        while (iter.hasNext()) {
            Map.Entry<String, String> entry = iter.next();

            if(entry.getKey().equals(name) || entry.getValue().equals(name)) {
                i++;
            }
        }
        return i;
    }

    private static void printingMap (Map <String,String> map){
        Iterator <Map.Entry<String,String>> iter = map.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry<String,String> entry = iter.next();
            System.out.println("Имя - "+entry.getKey()+" Фамилия - "+ entry.getValue());
        }
    }



}
