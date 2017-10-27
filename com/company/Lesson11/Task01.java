package com.company.Lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Toll on 15.07.2017.
 */

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/08/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Task01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        Date date = new Date(bfr.readLine());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, yyyy");

        System.out.println(simpleDateFormat.format(date).toUpperCase());
    }
}
