package com.company.Lesson06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Toll on 29.06.2017.
 */

/* Коллекция HashMap из котов
Есть класс Cat с полем имя (name, String).
Создать коллекцию HashMap<String, Cat>.
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота из массива:
 String[] cats = new String[] {"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};
 В качестве значения использовать экземпляр кота, с переданным именем из массива в конструктор.
 В классе Cat метод toString() должен переводить переданное в конструктор имя в верхний регистр ( метод toUpperCase() )
Вывести результат на экран, каждый элемент с новой строки.
Вывести результат на экран в виде:
васька - ВАСЬКА
мурка - МУРКА
...
*/

public class Task05 {

    public static void main(String[] args) {

        String[] catsArray = new String[] {"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        Map <String, Cat> catMap = new HashMap<>();

        for (String str: catsArray
             ) {
            catMap.put(str, new Cat(str));
        }

        Iterator <Map.Entry<String,Cat>> iter = catMap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry <String,Cat> entry = iter.next();
            System.out.println(entry.getKey()+" - "+entry.getValue().toString());
        }
    }
}

class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name.toUpperCase();
    }
}