package com.company.Interview;

import java.util.Arrays;

/**
 * Created by Toll on 04.11.2017.
 */
public class BinarySearch {
    private static int[] input = new int[]{1, 2, 3, 5, 6, 7, 7, 8, 9};

    public static void main(String[] args) {
        input = bubbleOneFor(input);
        System.out.println(Arrays.toString(input));
        System.out.println(binary(input,0,8,9));


    }

    private static int binary(int[] in, int start, int end, int key) {
        if(end<start) return -100;
        int m = (end + start) / 2;
        int mid = in[m];
        if (mid == key) return m;
        else if (mid > key) {
            return binary(in, start, m - 1, key);
        } else {
            return binary(in, m + 1, end, key);
        }
    }


    private static int[] bubbleOneFor(int[] in) {
        for (int j = 0; j < in.length - 1; ) {
            if (in[j] > in[j + 1]) {
                int t = in[j];
                in[j] = in[j + 1];
                in[j + 1] = t;

                if (j > 0) j--;
                else j++;
            } else j++;
        }
        return in;
    }
}
