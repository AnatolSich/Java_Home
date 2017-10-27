package com.company.Lesson11;

import java.io.*;

/**
 * Created by Toll on 15.07.2017.
 */

/*
Новая задача: Программа вводит два имени файла. И копирует первый файл на место, заданное вторым именем.
Если файла (который нужно копировать) с указанным именем не существует, то
программа должна вывести надпись «Файл не существует.» и еще раз прочитать имя файла с консоли,
 а уже потом считывать файл для записи.
*/

public class Task04 {
    public static void main(String[] args) throws IOException {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream;
        while (true) {
            String path1 = bfr.readLine();


            try {
                fileInputStream = new FileInputStream(path1);

                break;
            } catch (FileNotFoundException e) {
                System.out.println("Файл не существует.");

            }

        }

        String path2 = bfr.readLine();
        FileOutputStream fileOutputStream = new FileOutputStream(path2);

        while (fileInputStream.available() > 0) {
            int i = fileInputStream.read();
            fileOutputStream.write(i);
        }


    }

}
