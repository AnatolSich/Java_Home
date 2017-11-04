package com.company.Lesson26;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toll on 21.10.2017.
 */
public class Test03
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }
// сортировка смешанного массива(строки и цифры) без создания отдельных подмассивов
    //при проходе по массиву отдельно сравниваются цифры и отдельно - строки (но внешний for - один)

    public static void sort(String[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (isNumber(array[i]))
            {
                for (int j = 0; j < array.length; j++)
                {
                    if (isNumber(array[j]))
                    {
                        int a = Integer.parseInt(array[i]);//напишите тут ваш код
                        int b = Integer.parseInt(array[j]);
                        if (a > b)
                        {
                            String s = array[i];
                            array[i] = array[j];
                            array[j] = s;//напишите тут ваш код
                        }
                    }
                }
            } else
            {
                for (int j = 0; j < array.length; j++)
                {
                    if (!isNumber(array[j]))
                    {
                        if (!isGreaterThan(array[i], array[j]))
                        { // k a
                            String s = array[i];
                            array[i] = array[j];
                            array[j] = s;
                        }
                    }
                }
            }
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    private static boolean isGreaterThan(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    private static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
