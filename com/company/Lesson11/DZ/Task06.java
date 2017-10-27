package com.company.Lesson11.DZ;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toll on 20.07.2017.
 */

/* You have an array a containing positive numbers,
in which n numbers occur twice and two other numbers occur only once and are distinct.

  Find the two distinct numbers and return them in ascending order. /
          */
public class Task06 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(3);
        list.add(20);
        list.add(8);
        list.add(9);
        list.add(9);

        list.add(8);
        list.add(9);
        list.add(-77);
        printing(list);
        System.out.println("******************");
        List<Integer> listCheck = finding(list);
        printing(list);
        System.out.println("******************");

        printing(sortiingAscending(listCheck));


    }

    private static List finding(List<Integer> list) {

        List<Integer> listOut = new ArrayList<>();
        //  List<Integer> listCheck = new ArrayList<>();

        while (true) {
            if (list.size()==1) {
                listOut.add(list.get(0));
                list.remove(0);
                break;
            }
            Integer start = list.get(0);
            int i = 1;
            boolean flag = true;
            while (flag) {
                if (start == list.get(i)) {
                    list.remove(0);
                    list.remove(i-1);
                    flag = false;
                } else {
                    if (i == list.size() - 1) {
                        listOut.add(start);
                        list.remove(0);
                        flag = false;
                    } else {
                        i++;
                    }
                }
            }

        }

        return listOut;
    }
private static List<Integer> sortiingAscending(List <Integer> list){
    for (int i = 0; i <list.size() ; i++) {
        for (int j = 0; j <list.size()-1-i ; j++) {
            if(list.get(j)>list.get(j+1)) list.set(j, list.set(j + 1, list.get(j)));
        }
    }
    return list;
}
    private static void printing(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
