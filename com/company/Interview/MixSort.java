package com.company.Interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


@SuppressWarnings("Duplicates")
public class MixSort {
    public static void main(String[] args) {
        List<String> list = wordsInsert();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        list = sorting(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    private static List<String> sorting(List<String> list) {

        List<String> listDig = new ArrayList<>();
        List<String> listWord = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (isDigit(str)) {
                listDig.add(str);
            } else listWord.add(str);

        }
        sortingDigits(listDig);
        sortingWords(listWord);
        int d = 0;
        int w = 0;
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (isDigit(str)) {
                list.remove(i);
                list.add(i, listDig.get(d));
                d++;
            } else {
                list.remove(i);
                list.add(i, listWord.get(w));
                w++;
            }
        }

        return list;
    }

    private static List<String> sortingDigits(List<String> list) {

        for (int i = 0; i < list.size() - 1; ) {
            int dig1 = Integer.parseInt(list.get(i));
            int dig2 = Integer.parseInt(list.get(i + 1));

            if (dig1 > dig2) {
                swap(list, i, i + 1);
                if (i > 0) i--;

            } else i++;
        }
        return list;
    }

    private static List<String> sortingWords(List<String> list) {

        for (int i = 0; i < list.size() - 1; ) {
            if (list.get(i).compareTo(list.get(i + 1)) >= 0) {
                swap(list, i, i + 1);
                if (i > 0) i--;

            } else i++;
        }
        return list;
    }

    private static boolean isDigit(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
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
