package com.company.Lesson15;

/**
 * Created by Toll on 28.07.2017.
 */

/* Пиво и кола
Создать интерфейс Drink и классы Cola и Beer
В интерфейсе Drink создай метод isAlcoholic();
Реализуй интерфейс Drink в классах Beer и Cola.
Создать метод print, который должен определить
какой напиток пришел ему в параметрах, алкогольный или безалкогольный.
И вывести на экран соответствующую запись.
*/

public class Test03 {
    public static void main(String[] args) {
        print(new Beer());
        print(new Cola());
    }

    private static void print(Drink1 drink){
        if (drink.isAlcoholic()) System.out.println(drink.getClass().getSimpleName() + " is alcohol");
        else System.out.println(drink.getClass().getSimpleName() + " is not alcohol");
    }
}
interface Drink1{
    boolean isAlcoholic();
}
class Beer implements Drink1{


    @Override
    public boolean isAlcoholic() {
        return true;
    }

}
class Cola implements Drink1{

    @Override
    public boolean isAlcoholic() {
        return false;
    }
}