package com.company.Lesson33;

/**
 * Created by Toll on 11.11.2017.
 */


public class TestMethods{
    public static void main(String[] args){
        TestMethods test = new TestMethods();
        Thread anotherThread = new Thread("Thread#2"){
            public void run(){
                staticMethod();
            }
        };
        anotherThread.start();
        test.instanceMethod();
    }

    public static synchronized void staticMethod(){
        System.out.println("Running static method");
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.out.println(Thread.currentThread().getName() + " interrupted!");
        }
        System.out.println("Exiting static method");
    }

    public synchronized void instanceMethod(){
        System.out.println("Running instance method");
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.out.println(Thread.currentThread().getName() + " interrupted!");
        }
        System.out.println("Exiting instance method");
    }
}