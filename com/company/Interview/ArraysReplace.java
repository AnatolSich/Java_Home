package com.company.Interview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toll on 26.10.2017.
 */


public class ArraysReplace {

    public static void main(String[] args) {
        int[] arrayInput = new int[]{21, 20, 50, 21, 20, 50, 21, 20, 50, 21, 20};
        int[] arrayFind = new int[]{21, 20, 50, 21, 20};
        int[] arrayReplace = new int[]{70, 465, 23, 23};
        System.out.println(finding(arrayInput, arrayFind));


    }

    private static int[] replace(int[] arrayInput, int[] arrayFind, int[] arrayReplace) {

        List<Integer> list = finding(arrayInput, arrayFind);
        int n = arrayFind.length;

return arrayInput;
    }

    private static List<Integer> finding(int[] arrayInput, int[] arrayFind) {

        List<Integer> list = new ArrayList<>();
        int count = 0;

        for (int i = 0; i <= arrayInput.length - (arrayFind.length - count); ) {


            if (arrayInput[i] == arrayFind[count]) {
                count++;

                if (count == arrayFind.length) {
                    list.add(i - (count - 1));
                    System.out.println(i - (count - 1));
                    i = i - (count - 1) + 1;
                    count = 0;
                    continue;
                }


            } else {
                if (count != 0) {
                    i = i - count + 1;
                    count = 0;
                    continue;
                }
            }


          /*  for (int j = count; (j >= 0 && j < arrayFind.length); ) {
                if (arrayInput[i] == arrayFind[j]) {
                    count++;
                    break;
                } else break;
            }*/

            i++;

        }

        for (int i = 0; i < list.size() - 1; ) {
            if (list.get(i + 1) - list.get(i) < arrayFind.length) list.remove(i + 1);
            else i++;
        }

        return list;
    }

}
