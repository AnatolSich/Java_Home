package com.company.HomeWork;

/**
 * Created by Toll on 10.06.2017.
 */

/*
Создать класс Cat с параметрами: name, age, weight, power
        Реализовать метод boolean fight(Cat anotherCat):
        реализовать механизм драки котов в зависимости от age, weight, power.
        В методе main создать три объекта типа Cat и заполнить их данными.
        Провести три боя попарно между котами.
        Для боя использовать метод boolean fight(Cat anotherCat).
        Результат каждого боя вывести на экран.
*/

public class CatFight {

    public static void main(String[] args) {



        double d = Math.ceil(1.0/1000.0);
        System.out.println(d);

        System.out.println("name" + " " + "age" + " " + "weight" + " " + "power");
        Cat cat1 = new Cat("cat1", 3);
        System.out.println(cat1.name + "  " + cat1.age + "    " + cat1.weight + "    " + cat1.power);
        Cat cat2 = new Cat("cat2", 5);
        System.out.println(cat2.name + "  " + cat2.age + "    " + cat2.weight + "    " + cat2.power);
        Cat cat3 = new Cat("cat3", 1);
        System.out.println(cat3.name + "  " + cat3.age + "    " + cat3.weight + "    " + cat3.power);
        System.out.println("f1");
        if (cat1.fight(cat2)) System.out.println(cat1.name);
        else System.out.println(cat2.name);
        System.out.println("f2");
        if (cat1.fight(cat3)) System.out.println(cat1.name);
        else System.out.println(cat3.name);
        System.out.println("f3");
        if (cat2.fight(cat3)) System.out.println(cat2.name);
        else System.out.println(cat3.name);


    }
}

class Cat {

    String name;
    int age;
    int weight;
    int power;

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.power = (int) (Math.random() * 100 + 1);
        this.weight = (int) (Math.random() * 6 + 1);

    }

    boolean fight(Cat anotherCat) {
        int check = 0;
        if (this.age <= anotherCat.age) check++;
        if (this.power >= anotherCat.power) check++;
        if (this.weight >= anotherCat.weight) check++;
        if (check >= 2) return true;
        else return false;
    }
}