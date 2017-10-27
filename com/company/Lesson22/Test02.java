package com.company.Lesson22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toll on 31.08.2017.
 */

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

public class Test02 {
    public static void main(String[] args) throws IOException {
        nod(creating());
    }

    private static void nod(List<Integer> list) {
        Integer min;
        Integer max;
        Integer temp = 1;
        if (list.get(0) <= list.get(1)) {
            min = list.get(0);
            max = list.get(1);
        } else {
            min = list.get(1);
            max = list.get(0);
        }

        temp = min;
        while (true) {

            if (check(min, temp) && check(max, temp)) {
                System.out.println(temp);
                break;
            } else temp--;
        }


    }

    private static boolean check(Integer a, Integer b) {
        if (a % b == 0) return true;
        else return false;
    }


    private static List<Integer> creating() throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            list.add(Integer.parseInt(bfr.readLine()));
        }
        return list;
    }
}
