package com.company.Lesson18;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Toll on 11.08.2017.
 */

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.
*/

public class Test02 {
    public static void main(String[] args) throws IOException {
       BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
            FileOutputStream fileOutputStream = new FileOutputStream(bfr.readLine());

        while (true){
            String str = bfr.readLine();
            if (str.equals("exit")) break;
            fileOutputStream.write((str + "\n").getBytes());
        }
          fileOutputStream.close();
    }
}
