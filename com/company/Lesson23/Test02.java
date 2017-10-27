package com.company.Lesson23;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toll on 02.09.2017.
 */

/* ООП - книги
1. Создать абстрактный класс Book с приватным параметром author.
1.2 Создать абстрактный метод Book getBook().
1.2 Создать абстрактный метод String getName().
1.3 Создать метод String getOutputByBookType() и проинициализировать в нём 2 переменные:
- String agathaChristieOutput, которая должна хранить текст author + ", " + getBook().getName() + " is a detective"
- String markTwainOutput, которая должна хранить текст getBook().getName() + " book was written by " + author
- После этого, в зависимости от типа объекта (MarkTwainBook, AgathaChristieBook), который вызывает данный метод,
он должен возвращает соответствующую переменную - agathaChristieOutput для книг Агаты Кристи, markTwainOutput для книг Марка Твена.
- Переопределить метод toString() так, что бы он возвращал результат метода getOutputByBookType().
2. Создайте public static класс MarkTwainBook, который наследуется от Book.
 Имя автора [Mark Twain]. Параметр конструктора - имя книги.
2.1 В классе MarkTwainBook реализуйте все абстрактные методы.
2.2 Для метода getBook расширьте тип возвращаемого результата.
3. Создайте по аналогии AgathaChristieBook. Имя автора [Agatha Christie].
4. В main создать список книг. Добавить в список 2 книги:
- Tom Sawyer - автор Mark Twain
- Hercule Poirot - автор Agatha Christie
Вывести список на экран
*/

public class Test02 {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        Book a = new MarkTwainBook("Tom Sawyer");
        Book b = new AgathaChristieBook("Hercule Poirot");


        System.out.println(a);
        System.out.println(b);

        list.add(a);
        list.add(b);

        System.out.println(list);

    }
}

abstract class Book {
    private String author;

    abstract Book getBook();

    abstract String getName();

    public String getAuthor() {
        return author;
    }

    public Book(String author) {
        this.author = author;
    }

    abstract String getOutput();

    String getOutputByBookType() {
        return getOutput();

    }

    @Override
    public String toString() {
        return this.getOutputByBookType();
    }
}

class MarkTwainBook extends Book {

    String name;

    @Override
    String getOutput() {
        return getBook().getName() + " book was written by " + getAuthor();
    }

    public MarkTwainBook(String name) {
        super("Mark Twain");
        this.name = name;
    }

    @Override
    Book getBook() {
        return this;
    }

    @Override
    String getName() {
        return this.name;
    }


}

class AgathaChristieBook extends Book {

    String name;


    public AgathaChristieBook(String name) {
        super("Agatha Christie");
        this.name = name;
    }

    @Override
    String getOutput() {
        return getAuthor() + ", " + getBook().getName() + " is a detective";
    }

    @Override
    Book getBook() {
        return this;
    }

    @Override
    String getName() {
        return this.name;
    }
}

