package com.company.Lesson07.DZ;

import com.company.Lesson06.DZ.CatSets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.lang.Character.isDigit;

/**
 * Created by Toll on 03.07.2017.
 */

/* Пять наибольших чисел
Создать массив на 10 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/

public class FiveNumbers {
    public static void main(String[] args) throws IOException {
        fiveMax(adding(),5);
    }

    private static Integer[] adding() throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        Integer[] dig;

        while (true) {
            String str = bfr.readLine();
            if (!str.isEmpty()) {
                char[] ch = str.toCharArray();
                for (char c : ch
                        ) {
                    if (!isDigit(c)) {
                        str = null;
                        break;}
                }
                if (!(str==null)) list.add(Integer.parseInt(str));
                else break;

            } else break;

        }
        dig  = list.toArray( new  Integer [list.size()]);


        return dig;

    }

    private static void fiveMax(Integer [] dig, int k){

        for (int i = 0; i < dig.length; i++) {
            for (int j = 0; j < (dig.length - 1) - i; j++) {
                if(dig[j] > dig[j+1]){
                    int tmp = dig[j];
                    dig[j] = dig[j+1];
                    dig[j+1] = tmp;
                }
            }
        }

        for (int i = dig.length-1; (i > dig.length-(k+1) & i>=0); i--) {

            System.out.println(dig[i]);

        }

    }


}

