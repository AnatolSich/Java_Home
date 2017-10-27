package com.company.Lesson10;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/**
 * Created by Toll on 13.07.2017.
 */

/* Исключения
Есть метод, который выбрасывает два исключения, унаследованные от Exception, и два унаследованных от RuntimeException:
NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException.

Нужно перехватить NullPointerException и FileNotFoundException, но не перехватывать
ArithmeticException и URISyntaxException.
*/

public class Task06 {
    public static void main(String[] args) throws URISyntaxException {
        try {
            metod();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    private static void metod() throws FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random() * 4 + 1);
        System.out.println(i);
        switch (i) {
            case 1:
                throw new NullPointerException();
            case 2:
                throw new FileNotFoundException();
            case 3:
                throw new ArithmeticException();
            case 4:
                throw new URISyntaxException("", "");
        }
    }
}
