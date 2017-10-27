package com.company.Lesson16;

/**
 * Created by Toll on 03.08.2017.
 */

/*
1. Создать класс EnglishTranslator, который наследуется от абстрактного класса Translator.
   В классе Translator создать абстрактный метод getLanguage() и не абстрактный метод
    public String translate(), который возвращает строку "Я переводчик с " + getLanguage();
2. Реализовать все абстрактные методы.
3. Подумай, что должен возвращать метод getLanguage.
4. Программа должна выводить на экран "Я переводчик с английского".
5. Создать класс GermanyTranslator, который наследуется от абстрактного класса Translator.
6. Реализовать все абстрактные методы.
7. Подумай, что должен возвращать метод getLanguage.
8. Программа должна выводить на экран "Я переводчик с немецкого".
*/

public class Task01 {
    public static void main(String[] args) {
        Translator a = new EnglishTranslator();
        Translator g = new GermanyTranslator();
        System.out.println(a.translate());
        System.out.println(g.translate());
    }
}

abstract class Translator{
   abstract String getLanguage();
    public String translate(){
        return "Я переводчик с " + getLanguage();
    }
}

class EnglishTranslator extends Translator{

    @Override
    String getLanguage() {
        return "английского";
    }
}
class GermanyTranslator extends Translator{

    @Override
    String getLanguage() {
        return "немецкого";
    }
}
