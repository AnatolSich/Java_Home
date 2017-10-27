package com.company.Lesson07;

import java.util.Date;

/**
 * Created by Toll on 01.07.2017.
 */
public class Task03 {
    public static void main(String[] args) throws InterruptedException {
        Date startData = new Date();
        Thread.sleep(2000);
        Date endData = new Date();
        System.out.println((endData.getTime()-startData.getTime()));
    }
}
