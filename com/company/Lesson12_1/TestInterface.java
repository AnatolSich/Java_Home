package com.company.Lesson12_1;

/**
 * Created by Toll on 22.07.2017.
 */
public interface TestInterface {
    public static final int a = 5;
    public abstract void m();
    abstract  void m4();
    default void m2(){
        System.out.println("");
    }

    static void m3(){

    }
}

abstract class Clazz {
    private int a = 10;

    public void m(){
        System.out.println("erberber");
    }

    protected abstract void m2();

    public void m1(){
       m();
    }
}

abstract class C extends Clazz{
    public abstract void m();
}

class A implements TestInterface{


    @Override
    public void m() {

    }

    @Override
    public void m4() {

    }

    public void m2(){
        TestInterface.m3();
    }
}

class B extends C{
    A a = new A();

    {

    }


    @Override
    protected void m2() {

    }

    @Override
    public void m() {

    }
}