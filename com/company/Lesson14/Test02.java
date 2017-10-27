package com.company.Lesson14;

/**
 * Created by Toll on 26.07.2017.
 */

/* Лошадь и пегас
Написать два класса: Horse (лошадь) и Pegas (пегас).
В классе Horse создать переменные name, flyable, runnable
Созать конструктор для всех переменных класса Horse
В классе Horse создать метод, который проверяет переменную flyable и выводит на экран следующее:
- если переменная true, My name is + this.name + , i can fly =)
- если переменная false, My name is + this.name + , i cant fly =(
Унаследовать пегаса от лошади.
В методе main создать два объекта: horse и pegas
Подумать, какие значения присваивать переменным определенного класса.
*/

public class Test02 {
    public static void main(String[] args) {
        Horse horse = new Horse("Лошадь", false,true);
        Pegas pegas = new Pegas("Пегас", true,false);
        horse.test();
        pegas.test();
    }
}

class Horse{
  String name;
  boolean flyable;
  boolean runnable;

    public Horse(String name, boolean flyable, boolean runnable) {
        this.name = name;
        this.flyable = flyable;
        this.runnable = runnable;
    }

    protected void test(){
        if (this.flyable==true) System.out.println("My name is "+this.name+" , i can fly =)");
        else System.out.println("My name is "+ this.name +" , i cant fly =(");
    }
}
class Pegas extends Horse{
    public Pegas(String name, boolean flyable, boolean runnable) {
        super(name, flyable, runnable);
    }
}

