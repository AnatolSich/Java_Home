package com.company.Lesson07;

import java.util.Date;

/**
 * Created by Toll on 01.07.2017.
 */
public class Task01 {
    public static void main(String[] args) throws InterruptedException {
        Date date = new Date();
        Thread.sleep(3000);
        Date endDate = new Date();

        long msDelay = endDate.getTime() - date.getTime();
        System.out.println("Time distance is: " + msDelay + " ms.");
    }
}
