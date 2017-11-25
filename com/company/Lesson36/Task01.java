package com.company.Lesson36;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Toll on 23.11.2017.
 */

/* Считаем секунды
1. Создать класс Stopwatch, унаследовать его от Thread.
2. В выполняющем классе ввести с клавиатуры строку
3. Напиши реализацию метода run в нити Stopwatch (секундомер).
4. Stopwatch должен посчитать количество секунд, которое прошло от создания нити до ввода строки.
5. Выведи количество секунд в консоль.
*/

public class Task01 {
    public static void main(String[] args) throws IOException {
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String str = bfr.readLine();
            if (!str.isEmpty()) {
                stopwatch.interrupt();
                break;
            }
        }
    }

}

class Stopwatch extends Thread {
    int count = 0;

    @Override
    public void run() {
        try {
            while (!this.isInterrupted()) {

                Thread.sleep(1000);

                count++;
            }
        } catch (InterruptedException e) {
            System.out.println(count);
        }
    }
}
