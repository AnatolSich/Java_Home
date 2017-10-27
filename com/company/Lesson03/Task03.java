package com.company.Lesson03;

/**
 * Created by Toll on 10.06.2017.
 */

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
8888888888
8
8
8
8
8
8
8
8
8
8
*/

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Task03 {
    public static void main(String[] args) {
       /* for (int i = 0; i < 10; i++) {
            System.out.print(8);

        }
        System.out.println();
          for (int i = 0; i < 10; i++) {
            System.out.println(8);
        }*/

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(8);
            }
            System.out.println();
        }

    }
}
