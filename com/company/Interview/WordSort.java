package com.company.Interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class WordSort {
    public static void main(String[] args) {
        List<String> list = wordsInsert();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        list = sorting2(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    private static List<String> sorting3(List<String> list) {
        boolean flag=false;
        for (int i = 0,j=0; i < list.size(); ) {

        }
        return list;
    }
    private static List<String> sorting2(List<String> list) {

        for (int i = 0; i < list.size()-1; ) {
            if (list.get(i).compareTo(list.get(i + 1)) >= 0) {
                swap(list, i, i + 1);
                if (i > 0) i--;

            }
            else i++;
        }
        return list;
    }

    private static List<String> sorting1(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size() - 1 - i; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) >= 0) {
                    swap(list, j, j + 1);
                }
            }
        }
        return list;
    }

    private static List<String> swap(List<String> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
        return list;
    }

    private static List<String> wordsInsert() {
        List<String> list = new ArrayList<>();
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {

                String str = bfr.readLine();
                if (!str.isEmpty()) {
                    list.add(str);
                } else break;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
