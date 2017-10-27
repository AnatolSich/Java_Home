package com.company.Lesson17;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toll on 10.08.2017.
 */

public class Test02 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(8);
        list.add(4);
        list.add(8);
        list.add(12);
        list.add(-5);
        list.add(0);
        printing(list);
        sorting(list);
        printing(list);
    }

    private static void sorting (List<Integer> list ){
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size()-1-i; j++) {
                if(list.get(j)>list.get(j+1)) list.set(j,list.set(j+1,list.get(j)));
            }
        }
    }

    private static void printing(List <Integer> list){
        for (Integer i:list
             ) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
