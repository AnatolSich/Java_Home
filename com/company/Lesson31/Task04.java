package com.company.Lesson31;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toll on 04.11.2017.
 */

/* join
1. Создать класс PrintListThread, унаследовать его от Thread
2. В классе PrintListThread создать конструктор с параметром String name и передавать этот параметр в конструктор суперкласса
3. В выполняющем классе создать метод  getList(int n), который должен:
- создавать список из n строк, в виде String %d, где %d - число от 1 до n(включительно)
4. В выполняющем классе создать метод printList(List<String> list, String threadName), который должен:
- Проходиться по списку и выводить на экран строки в виде %s : %s , где %s - имя нити,%s - значение на определенном индексе в списке
5. В классе PrintListThread реализовать метод run() - вызвать в нём метод printList.
6. В выполняющем классе создат метод main
7. В выполняющем методе создать 2 (firstThread, secondThread) нити и запустить их
Подумайте, в каком месте и для какого объекта нужно вызвать метод join, чтобы результат выводился по-порядку
сначала для firstThread, а потом для secondThread.
Вызовите метод join в нужном месте.
Пример вывода:
firstThread : String 1
firstThread : String 2
...
firstThread : String 19
firstThread : String 20
secondThread : String 1
...
secondThread : String 20
*/

public class Task04 {
    static List <String> list = getList(20);

    public static void main(String[] args) {

        PrintListThread firstThread =new PrintListThread("firstThread");
        PrintListThread secondThread =new PrintListThread("secondThread");
        firstThread.start();

        try {
            firstThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        secondThread.start();

    }

    static List<String> getList(int n){
        List <String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(String.format("String %d",i));
        }
        return list;
    }
    static void printList(List<String> list, String threadName){
        for (String str:list
             ) {
            System.out.println(String.format("%s : %s",threadName,str));
        }
    }

}
class PrintListThread extends Thread{
    public PrintListThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        Task04.printList(Task04.list,this.getName());
    }
}