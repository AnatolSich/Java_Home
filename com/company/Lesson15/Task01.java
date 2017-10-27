package com.company.Lesson15;

/**
 * Created by Toll on 28.07.2017.
 */

/* Или «Кошка», или «Собака», или «Птица», или «Лампа»
Написать метод, который определяет, объект какого класса ему передали,
и выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.
*/

public class Task01 {
    public static void main(String[] args) {
        testing(new Lamp());
       /* testing(new Dog());
        testing(new Bird());
        testing(new Lamp());
*/
    }
    private static void testing(Object o){
        if (o instanceof Cat) System.out.println("Cat");
        if (o instanceof Dog) System.out.println("Dog");
        if (o instanceof Bird) System.out.println("Bird");
        if (o instanceof Lamp) System.out.println("Lamp");
    }

}

class Cat{

}
class Dog extends Cat{

}
class Bird extends Dog{

}
class Lamp extends Bird{

}
