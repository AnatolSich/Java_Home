package com.company.Lesson28;

import java.io.*;

/**
 * Created by Toll on 26.10.2017.
 */

/*
Задача: Программа вводит два имени файла. И копирует первый файл на место заданное вторым именем.
*/

public class Task01 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String name1 = bfr.readLine();
        String name2 = bfr.readLine();

        FileInputStream fileInput = new FileInputStream(name1);
        FileOutputStream fileOutput = new FileOutputStream(name2);
        while (fileInput.available()>0){
            fileOutput.write(fileInput.read());
        }

    }

}
