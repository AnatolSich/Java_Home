package com.company.Lesson11;

import java.io.*;

/**
 * Created by Toll on 15.07.2017.
 */

/*
Задача: Программа вводит два имени файла. И копирует первый файл на место заданное вторым именем.
*/

public class Task02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bfr.readLine();
        String fileName2 = bfr.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream = new FileOutputStream(fileName2);

        int count = 0;

        while(fileInputStream.available() > 0){
            int data = fileInputStream.read();
            fileOutputStream.write(data);
            count++;
        }

        System.out.println(count);
    }
}
