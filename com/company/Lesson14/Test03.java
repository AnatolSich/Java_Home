package com.company.Lesson14;

/**
 * Created by Toll on 26.07.2017.
 */

/*
Создать классы Pet, Cat, Dog
В классе Pet создать метод getChild(), который возвращает экземпляр класса Pet.
Переопределить метод getChild в классах Cat(кот) и Dog(собака),
чтобы кот порождал кота, а собака – собаку.
*/

public class Test03 {
//    int a = 5;
//    int a;
//
//    {
//        a = 5;
//    }
//
//    static int b = 10;
//    static int b;
//
//    static {
//        b = 10;
//    }

}

class Pet {
    public Pet getChild() {
        return new Pet();
    }
}

class Cat extends Pet {
    @Override
    public Cat getChild() {
        return new Cat();
    }
}

class Dog extends Pet {
    @Override
    public Dog getChild() {
        return new Dog();
    }
}

