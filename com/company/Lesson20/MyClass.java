package com.company.Lesson20;

/**
 * Created by Toll on 24.08.2017.
 * [][][][]...16
 *       4
 *    2
 *    3
 *    1
 */
 interface Print { // (0)
    void print();
}

class A implements Print {
     static int a = 10;
    public void print() {
        System.out.println("Hello world !");
    }
    public static void print(int i){

    }
}

class B extends A implements Print {
    // (1)
}

public class MyClass{

    public static void main(String args[]) {
        B classB  = new B();
        classB.print();
        System.out.println(new A().a);
    }
}