package com.company.Lesson23;

/**
 * Created by Toll on 02.09.2017.
 */

/* ООП - машинки
1.1 Создать вложенный класс/интерфейс Constants с переменными:
String WANT_STRING = "Я хочу ездить на ";
String LUXURIOUS_CAR = "роскошной машине";
String CHEAP_CAR = "дешевой машине";
String FERRARY_NAME = "Феррари";
String LANOS_NAME = "Ланосе";
1.2 Для вывода использовать можно только переменные из класса Constants.
2. Создать класс Ferrari, реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Феррари".
3. Создать класс Lanos, реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Ланосе".
4. Создайте public static класс LuxuriousCar(РоскошнаяМашина).
5. Создайте public static класс CheapCar(ДешеваяМашина).
6. Унаследуйте Ferrari и Lanos от CheapCar и LuxuriousCar, подумайте, какой класс для кого.
7. В классе LuxuriousCar реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на роскошной машине".
8. В классе CheapCar реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на дешевой машине".
9. В класах LuxuriousCar и CheapCar для метода printlnDesire расставьте различными способами модификаторы доступа так,
чтобы в классах Ferrari и Lanos выполнялось расширение видимости.
10. В выполняющем методе вызовите метод printlnDesire() у всех классов, в который он реализован.
*/

public class Test01 {

    public static void main(String[] args) {
        LuxuriousCar.printlnDesire();
        CheapCar.printlnDesire();
        Ferrari.printlnDesire();
        Lanos.printlnDesire();
    }

    public static class LuxuriousCar implements Constants{
        static protected void printlnDesire(){
            System.out.println(WANT_STRING+LUXURIOUS_CAR);
        }
    }
    public static class CheapCar implements Constants{
        static protected void printlnDesire(){
            System.out.println(WANT_STRING+CHEAP_CAR);
        }
    }


}

interface Constants{
    String WANT_STRING = "Я хочу ездить на ";
    String LUXURIOUS_CAR = "роскошной машине";
    String CHEAP_CAR = "дешевой машине";
    String FERRARY_NAME = "Феррари";
    String LANOS_NAME = "Ланосе";
}

class Ferrari extends Test01.LuxuriousCar implements Constants{
    public static void printlnDesire(){
        System.out.println(WANT_STRING+FERRARY_NAME);
    }
}
class Lanos extends Test01.CheapCar implements Constants{
    public static void printlnDesire(){
        System.out.println(WANT_STRING+LANOS_NAME);
    }
}


