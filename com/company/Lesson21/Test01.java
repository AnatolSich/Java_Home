package com.company.Lesson21;

/**
 * Created by Toll on 26.08.2017.
 */

/* Мосты
1. Создать интерфейс Bridge с методом int getCarsCount().
2. Создать классы WaterBridge и SuspensionBridge, которые реализуют интерфейс Bridge.
3. Метод getCarsCount() должен возвращать любое захардкоженое значение типа int
4. Метод getCarsCount() должен возвращать различные значения для различных классов
5. В классе Solution создать публичный метод println(Bridge bridge).
6. В методе println вывести на консоль значение getCarsCount() для объекта bridge.
7. Каждый класс и интерфейс должны быть в отдельных файлах.
*/

public class Test01 {
    public static void main(String[] args) {
        Bridge wb = new WaterBridge();
        Bridge sb = new SuspensionBridge();
        new Test01().println(wb);
        new Test01().println(sb);

    }
    public void  println(Bridge bridge){
        System.out.println(bridge.getCarsCount());
    }
}
interface Bridge{
    int getCarsCount();
}

class WaterBridge implements Bridge{
    @Override
    public int getCarsCount() {
        return 0;
    }
}
class SuspensionBridge implements Bridge{
    @Override
    public int getCarsCount() {
        return 1;
    }
}

