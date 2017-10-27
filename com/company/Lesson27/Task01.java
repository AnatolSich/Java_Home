package com.company.Lesson27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toll on 21.10.2017.
 */

/* Метод в try..catch
Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
Обернуть все тело (весь код внутри readData, кроме объявления списка, где будут храниться числа и BufferedReader-а)
этого метода в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа,
то метод должен перехватить исключение и вывести на экран все введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.
*/

public class Task01 {
    public static void main(String[] args) throws IOException {
        readData();
    }

    private static void readData() throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true){
                String str = bfr.readLine();
                if(str.isEmpty()) break;
                try {
                    list.add(Integer.parseInt(str));
                }catch (NumberFormatException e){
                   throw new Exception(e);
                }
            }
        }catch (Exception e){
            for (Integer i:list
                    ) {
                System.out.print(i+" ");
            }
        }

    }


}
