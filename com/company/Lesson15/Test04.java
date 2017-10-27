package com.company.Lesson15;

/**
 * Created by Toll on 28.07.2017.
 */

/*
1. Создать интерфейс DBObject и создать в нем метод initializeIdAndName(long id, String name)
2. Создать класс User с параметрами long id, String name;
Вынести реализацию метода initializeIdAndName в класс User.
3. initializeIdAndName в классе User должен возвращать тип User.
4. Переопределить метод toString() в классе User,
что бы он выводил следующее User has name %s, id = %d
5. Создать класс Matrix и создать в нем 2 объекта используя ранее созданые интерефейс и класс.
6. В методе main вывести на экран объекты.
*/

public class Test04 {
    public static void main(String[] args) {
        System.out.println(Matrix.user1);
        System.out.println(Matrix.user2);
    }
}

interface DBObject {
    DBObject initializeIdAndName(long id, String name);
}

class User implements DBObject {
    long id;
    String name;

    @Override
    public User initializeIdAndName(long id, String name) {
        this.id = id;
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return String.format("User has name %s, id = %d", name, id);
    }
}

class Matrix{
   static User user1 = new User().initializeIdAndName(01l,"Tom");
   static User user2 = new User().initializeIdAndName(02l,"Den");
}