package com.company.Interview;

import java.util.Arrays;

public class BubbleTest {
    private static int input[] = new int[]{9, 2, 35, 4, 0, -5, 6};

    public static void main(String[] args) {

        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(bubbleOneFor(input)));
    }

    private static int[] bubbleTwoFor(int[] in) {
        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in.length - 1 - i; j++) {
                if (in[j] > in[j + 1]) {
                    int t = in[j];
                    in[j] = in[j + 1];
                    in[j + 1] = t;
                }
            }
        }
        return in;
    }

    private static int[] bubbleFlag(int[] in) {
        boolean flag = true;
        for (int i = 0; flag; i++) {
            flag = false;
            for (int j = 0; j < in.length - 1 - i; j++) {
                if (in[j] > in[j + 1]) {
                    int t = in[j];
                    in[j] = in[j + 1];
                    in[j + 1] = t;
                    flag = true;
                }
            }
            System.out.println(Arrays.toString(in));
        }
        return in;
    }

    private static int[] bubbleOneFor(int[] in) {
            for (int j = 0; j < in.length - 1;) {
                if (in[j] > in[j + 1]) {
                    int t = in[j];
                    in[j] = in[j + 1];
                    in[j + 1] = t;

                    if(j>0) j--;
                    else j++;
                }
                else j++;
                System.out.println(Arrays.toString(in));
            }
        return in;
    }


}
