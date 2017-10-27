package com.company.Lesson15;

/**
 * Created by Toll on 28.07.2017.
 */

/*
    Создать интерфейс Drink и класс AlcoholicBeer
    В интерфейсе Drink создай метод isAlcoholic();
    Добавь к классу AlcoholicBeer интерфейс Drink и реализуй все нереализованные методы.
    Метод  toString в классе AlcoholicBeer должен выводить на экран "Напиток алкогольный",
    если isAlcoholic() возвращает true,
    иначе вывести на экран надпись "Напиток безалкогольный".
*/

public class Test02 {

    public static void main(String[] args) {
        System.out.println(new AlcoholicBeer());
    }
}

interface Drink{
 public abstract  boolean isAlcoholic();
}
class AlcoholicBeer implements Drink{


    @Override
    public boolean isAlcoholic() {

        return true;
    }


    @Override
    public String toString() {
        if (this.isAlcoholic())
        return "Напиток алкогольный";
        else return "Напиток безалкогольный";
    }
}