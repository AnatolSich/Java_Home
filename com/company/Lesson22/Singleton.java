package com.company.Lesson22;

/**
 * Created by Toll on 31.08.2017.
 */

public class Singleton {
    private static Singleton singleton = new Singleton();


    private Singleton() {

    }


    static Singleton getInstance() {
         return singleton ;
    }
}
