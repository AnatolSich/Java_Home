package com.company.Lesson18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Toll on 11.08.2017.
 */

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Если файла по заданному пути не существует, запросить ввод имени файла еще раз.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

public class Test01 {
    public static void main(String[] args) {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                FileInputStream fileInputStream = new FileInputStream(bfr.readLine());
                while (fileInputStream.available()!=0)
                    System.out.print((char)fileInputStream.read()+" ");
                fileInputStream.close();
                bfr.close();

                break;
            } catch (IOException e) {
                System.out.println("New file?");
            }
        }
    }
}
