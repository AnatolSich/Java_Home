package com.company.Lesson03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Toll on 10.06.2017.
 */

/* Максимальное среди массива на 10 чисел
1. В методе initializeArray():
1.1. Создайте массив на 10 чисел
1.2. Считайте с консоли 10 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/

public class Task06 {

    public static void main(String[] args) throws IOException {
        System.out.println(max(initializeArray()));


    }

    static int [] initializeArray() throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int [10];
        for (int i = 0; i < 10; i++) {
            array[i]=Integer.parseInt(bfr.readLine());
        }
        return array;
    }

    static int max(int[] array){
        int m=array[0];
        for (int i = 0; i < array.length-1; i++) {
            if (m<array[i+1])  m=array[i+1];
        }
        return m;
    }

}
