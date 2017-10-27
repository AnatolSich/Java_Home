package com.company.Lesson28;

import java.io.*;

/**
 * Created by Toll on 26.10.2017.
 */

/*
Новая задача: Программа вводит два имени файла.
И копирует первый файл на место, заданное вторым именем.
Если файла (который нужно копировать) с указанным именем не существует, то
программа должна вывести надпись «Файл не существует.» и еще раз
прочитать имя файла с консоли, а уже потом считывать файл для записи.
*/

public class Task02 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String name1 = bfr.readLine();

        InputStream fileInput = null;
        OutputStream fileOutput = null;

        while (true) {
            try {
                fileInput = new FileInputStream(name1);
                break;
            } catch (FileNotFoundException e) {
                System.out.println("«Файл не существует.»");
                System.out.println("Введите имя файла еще раз:");
                name1 = bfr.readLine();
            }
        }

        fileOutput = new FileOutputStream(bfr.readLine());
        while (fileInput.available() > 0) {
            fileOutput.write(fileInput.read());
        }
    }

}
