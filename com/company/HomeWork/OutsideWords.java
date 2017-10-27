package com.company.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Toll on 21.06.2017.
 */

/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк.
Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

public class OutsideWords {
    public static void main(String[] args) throws IOException {
        ArrayList <String> words = new ArrayList<String>();
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            words.add(bfr.readLine());
        }
        words.remove(2);
        for (int i = words.size()-1 ; i > -1 ; i--) {
            System.out.println(words.get(i));
        }

    }
}
