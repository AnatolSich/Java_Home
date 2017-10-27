package com.company.Lesson07;

import java.util.Date;

/**
 * Created by Toll on 01.07.2017.
 */
public class Task05 {
    public static void main(String[] args) {
        Date date = new Date();
//        Date yearStartDate = new Date();
//        yearStartDate.setHours(0);
//        yearStartDate.setDate(1);
//        yearStartDate.setMinutes(0);
//        yearStartDate.setSeconds(0);
//        yearStartDate.setMonth(0);

        int [] monthes = {31,29,31,30,31,30,31,31,31,30,31,31};
        int days=0;
        for (int i = 0; i < date.getMonth(); i++) {
            days=days+monthes[i];
        }


        System.out.println(days);
    }
}
