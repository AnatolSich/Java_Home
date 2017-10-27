package com.company.Lesson05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Toll on 24.06.2017.
 */

/*
Задача:  Программа вводит с клавиатуры данные про котов и выводит их на экран.
Создать класс Cat с параметрами name, age, weight, tail;
Переопределить метод toString() в классе Cat, что бы он выводил информацию про кота в виде:
"Cat name is " + name + ", age is " + age + ", weight is " + weight + ", tail = " + tailLength;
Вводить параметри с клавиатуры и создавать объект с введенными параметрами.
Ввод продолжается, пока переменная с именем не пуста.
Добавлять каждый объект в список, в конце вывести содержимое списка на экран.
 Пример:
Cat name is Barsik, age is 6, weight is 5, tail = 22
Cat name is Murka, age is 8, weight is 7, tail = 20
*/

public class Task03 {
    public static void main(String[] args) throws IOException {
        printing(adding());
    }

    private static List adding() throws IOException {
        List<Cat> list = new ArrayList<>();
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = bfr.readLine();
            if (str.isEmpty()) break;
            Cat cat = new Cat();
            cat.name = str;
            cat.age = Integer.parseInt(bfr.readLine());
            cat.weight = Integer.parseInt(bfr.readLine());
            cat.tail = Integer.parseInt(bfr.readLine());
            list.add(cat);
        }

        return list;
    }

    private static void printing(List list) {
        Iterator<Cat> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().toString());
        }
    }

    private static class Cat {
        String name;
        int age;
        int weight;
        int tail;

        @Override
        public String toString() {
            StringBuilder str = new StringBuilder();
            str.append("Cat name is ").append(this.name).append(", age is ").append(this.age).append(", weight is ").append(weight).append(", tail = ").append(tail);
            return str.toString();
        }
    }


}
