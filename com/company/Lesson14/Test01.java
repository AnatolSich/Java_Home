package com.company.Lesson14;

/**
 * Created by Toll on 26.07.2017.
 */

/*
Создать 2 класса Сow и Whale.
В классе Cow создать метод getName(), который возвращает строку "Я - корова".
Унаследовать Whale от Cow
Переопределить метод getName в классе Whale(Кит), чтобы программа выдавала:
Я не корова, Я - кит.
*/

public class Test01 {
    public static void main(String[] args) {
        Cow whale = new Whale();
        System.out.println(whale.getName());
    }

}

class Cow {
    String getName(){
       return "Я - корова";
   }
}

class Whale extends Cow{

    @Override
     String getName() {
        return "Я не корова, Я - кит.";
    }
}