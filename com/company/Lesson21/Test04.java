package com.company.Lesson21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Toll on 26.08.2017.
 */

/* MovieFactory
1. Добавить абстрактный класс Movie с абстрактным методом String getGenre().
2. Добавить классы SoapOpera, Cartoon, Thriller и унаследовать их от Movie и реализовать метод String getGenre():
- в классе SoapOpera метод getGenre() должен вернуть строку "Genre is drama";
- в классе Cartoon метод getGenre() должен вернуть строку "Genre is comedy";
- в классе Thriller метод getGenre() должен вернуть строку "Genre is horror";
3. Создать класс MovieFactory с методом getMovie(String key)
4. Добавить в MovieFactory.getMovie получение объекта Cartoon для ключа "cartoon".
5. Добавить в MovieFactory.getMovie получение объекта SoapOpera для ключа "soapOpera".
6. Добавить в MovieFactory.getMovie получение объекта Thriller для ключа "thriller".

7. Считать с консоли несколько ключей (строк).
7.1. Ввод заканчивается, как только вводится строка не совпадающая с одной из: "cartoon", "thriller", "soapOpera".
8. Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1. Получить объект используя MovieFactory.getMovie и присвоить его переменной movie.
8.2. Вывести на экран movie.getClass().getSimpleName() + movie.getGenre();.
*/


public class Test04 {
    public static void main(String[] args) throws IOException {
        creating();
    }

    private static void creating() throws IOException {
        System.out.println("Enter any of this words: cartoon soapOpera thriller ");
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String str;
        Movie movie;

        while (true) {
            str = bfr.readLine();
            if (str.equals("cartoon")) movie = new Cartoon();
            else if (str.equals("soapOpera")) movie = new SoapOpera();
            else if (str.equals("thriller")) movie = new Thriller();

            else break;


            System.out.println( movie.getClass().getSimpleName() + movie.getGenre());

        }

    }
}

abstract class Movie{
    abstract String getGenre();
}

class SoapOpera extends Movie{

    @Override
    String getGenre() {
        return "Genre is drama";
    }
}
class Cartoon extends Movie{

    @Override
    String getGenre() {
        return "Genre is comedy";
    }
}
class Thriller extends Movie{

    @Override
    String getGenre() {
        return "Genre is horror";
    }
}
class MovieFactory{

    Movie getMovie(String key){
        if(key.equals("cartoon")) return new Cartoon();
        else if(key.equals("soapOpera")) return new SoapOpera();
        else if(key.equals("thriller")) return new Thriller();
        else return null;

    }
}


