package com.company.Interview;

import java.util.Arrays;

/**
 * Created by Toll on 26.10.2017.
 */
public class BubbleSortBoolean {
    public static void main(String[] args) {
        int[] array = {5, 6, 7, 21, 6, 0, 6, 9, 3, 4, 8, 3, -4, 4};
        System.out.println(Arrays.toString(array).substring(1,array.length*2+15));
        for (int i:bubblesorting(array)
             ) {
            System.out.print(i+" ");
        }
    }

    private static int[] bubblesorting(int[] array) {
        boolean flag = true;
        for (int i = 0; flag; i++) {
            flag = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int k = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = k;
                    flag = true;
                }
            }
        }
        return array;
    }
}
