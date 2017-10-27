package com.company.p01;

/**
 * Created by Toll on 25.10.2017.
 */
public class T {
    public static void main(String[] args) {
        int i=100;
         i =new Long(Math.round(i*0.9)).intValue();
       /* int i=100;
        i*=0.9;
        i*=0.9;
        i=Integer.valueOf(Math.round(i*0.9).intValue());*/
        System.out.println(i);
    }
}
