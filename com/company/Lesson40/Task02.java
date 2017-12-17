package com.company.Lesson40;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task02 {
    static int [] massiv = {2,4,6,8,23,89,345,8989,13454};

    public static void main(String[] args) {
        System.out.println(binary(massiv,0,massiv.length-1,13454));
    }

    private static int binary(int[] array,int start, int end, int num){
        int res=-1;
        int temp = start+(end-start+1)/2;
        if(num==array[temp]) res=temp;
        else {
            if(num>array[temp]) {
                res=binary(array,temp+1,end,num);
            }
            if (num<array[temp]) {
                res=binary(array,start,temp-1,num);
            }
        }
        return res;
    }
}
