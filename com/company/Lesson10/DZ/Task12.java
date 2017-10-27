package com.company.Lesson10.DZ;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;

/**
 * Created by Toll on 15.07.2017.
 */

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот». - createMap()
Получить из Map множество(Set) всех имен и вывести его на экран. - convertMapToSet(Map<String, Cat> map)
*/


public class Task12 {
    public static void main(String[] args) {
        convertMapToSet(createMap());
    }
    private static Map createMap(){
        Map <String, Cat> catMap = new HashMap<String, Cat>();
        for (int i = 0; i <10 ; i++) {
            Cat cat;
            if (i!=9) {
                 cat = new Cat("Кот0" + (i + 1));
            } else {
                 cat = new Cat("Кот" + (i + 1));
            }
            catMap.put(cat.name,cat);
        }
        return catMap;
    }

    private static void convertMapToSet(Map<String, Cat> map){
        for (String name:map.keySet()
             ) {
            System.out.println(name+" "+name.hashCode());
        }

    }
}

class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }
}