package com.company.Lesson10;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/**
 * Created by Toll on 13.07.2017.
 */

/* Перехватывание исключений
1. Есть три исключения последовательно унаследованные от Exception:
2. class Exception1 extends  Exception
3. class Exception2 extends  Exception1
4. class Exception3 extends  Exception2
5. Есть метод, который описан так:
5.1. public static void method1() throws Exception1, Exception2, Exception3

6. Напиши catch, который перехватит все три Exception1, Exception2 и Exception3
*/

public class Task07 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception3 e3) {
            System.out.println("e3");
        } catch (Exception2 e2) {
            System.out.println("e2");
        } catch (Exception1 e1) {
            System.out.println("e1");
        }
    }

    public static void method1() throws Exception1 {
        int i = (int) (Math.random() * 3 + 1);
        System.out.println(i);
        switch (i) {
            case 1:
                throw new Exception1();
            case 2:
                throw new Exception2();
            case 3:
                throw new Exception3();
        }
    }
}

class Exception1 extends Exception {

}

class Exception2 extends Exception1 {

}

class Exception3 extends Exception2 {

}


