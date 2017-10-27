package com.company.Lesson06;

/**
 * Created by Toll on 29.06.2017.
 */
public class Task01 {
    public static void main(String[] args) {
        int[] array = {5, 1, 20, 19, 0};
        sort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    private static void sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }
}
