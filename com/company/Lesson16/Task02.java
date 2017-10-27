package com.company.Lesson16;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toll on 03.08.2017.
 */

/*
1. Создать классы Person, RepkaStory и интерфейс RepkaItem
2. В интерфейсе RepkaItem создать метод String getNamePadezh();
3. Реализовать интерфейс RepkaItem в классе Person.
5. В классе Person создать переменные  String name, String namePadezh;
6. В классе Person реализовать метод pull(Person person), который выводит фразу типа '<name> за <person>'. Пример:
Бабка за Дедку
Дедка за Репку
7. Создать метод tell в классе RepkaStory.
8. С помощью цикла реализовать метод tell, который должен выполнять логику вывода на экран с помощью метода pull(Person person)
9. Выполнить метод main
 List<Person> plot = new ArrayList<Person>();
        plot.add(new Person("Репка", "Репку"));
        plot.add(new Person("Дедка", "Дедку"));
        plot.add(new Person("Бабка", "Бабку"));
        plot.add(new Person("Внучка", "Внучку"));
        RepkaStory.tell(plot);
*/

public class Task02 {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<Person>();
        plot.add(new Person("Репка", "Репку"));
        plot.add(new Person("Дедка", "Дедку"));
        plot.add(new Person("Бабка", "Бабку"));
        plot.add(new Person("Внучка", "Внучку"));
        RepkaStory.tell(plot);
    }
}

class Person implements RepkaItem{
    String name;
    String namePadezh;

    public Person(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    @Override
    public String getNamePadezh() {
        return this.namePadezh;
    }
    void pull(Person person){
        System.out.println(this.name+" за "+person.getNamePadezh());
    }
}
class RepkaStory{
    static void tell(List <Person> list){
        for (int i = list.size()-1; i >=1 ; i--) {
            list.get(i).pull(list.get(i-1));
        }
    }
}
interface RepkaItem{
    String getNamePadezh();
}