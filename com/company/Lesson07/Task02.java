package com.company.Lesson07;

import java.util.Date;

/**
 * Created by Toll on 01.07.2017.
 */
public class Task02 {
    public static void main(String[] args) throws InterruptedException {
        Date startDate = new Date();

        long endTime = startDate.getTime() + 3000;
        Date endDate = new Date(endTime);

        Thread.sleep(4000);

        Date currentDate = new Date();

        if(currentDate.after(endDate)){
            System.out.println("Lose");
        } else {
            System.out.println("Win");
        }
    }
}
