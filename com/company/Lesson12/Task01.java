package com.company.Lesson12;

/**
 * Created by Toll on 20.07.2017.
 */

// 5544 -> 4455
// -1267 -> -7621

public class Task01 {
    public static void main(String[] args) {
        System.out.println(revers(-985655555));
        System.out.println(revers2(-985655555));
    }

    private static Integer revers(Integer input) {
        int t = 0;
        for (int i = input; i != 0; i /= 10) {
            t = t * 10 + i % 10;
        }
        return t;
    }

    private static Integer revers2(Integer input) {
        StringBuilder str = new StringBuilder(input.toString());
        if (str.charAt(0) == '-') {
            str.deleteCharAt(0);
            return (Integer.parseInt(str.reverse().insert(0, '-').toString()));
        } else return Integer.parseInt(str.reverse().toString());
    }

}
