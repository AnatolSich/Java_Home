package com.company.Lesson12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Toll on 20.07.2017.
 */

// {6, 9, 3, 8}
// {7, -1, 8, -1}

public class Task02 {
    public static void main(String[] args) {
        Integer [] mass = new Integer[]{2,3,-6,11,8,9,10};
        printing(newMassiv(mass));
    }

    private static List newMassiv(Integer[] in) {
        List<Integer> list = Arrays.asList(in);
        List<Integer> listOut = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (i==list.size()-1) {
                listOut.add(i, -1);
                break;
            }
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    listOut.add(i, list.get(j));
                    break;
                }
                else if (j == list.size() - 1) listOut.add(i, -1);
            }
        }

        return listOut;
    }

    private static void printing(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}

