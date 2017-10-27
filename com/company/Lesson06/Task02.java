package com.company.Lesson06;

/**
 * Created by Toll on 29.06.2017.
 */
public class Task02 {
    public static void main(String[] args) {
       int [] arrayIn = {5,6,8,20,5};

        for (int i: sorting(arrayIn)
             ) {
            System.out.println(i);

        }
    }
    private static int [] sorting (int [] arrayIn){
        for (int i = 0; i < arrayIn.length ; i++) {
            for (int j = 0; j < arrayIn.length-1-i; j++) {
                int temp;
                if (arrayIn[j]>arrayIn[j+1]) {
                    temp=arrayIn[j+1];
                    arrayIn[j+1]=arrayIn[j];
                    arrayIn[j]=temp;
                }
            }
        }
        return arrayIn;
    }
}
