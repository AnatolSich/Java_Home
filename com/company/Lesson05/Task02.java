package com.company.Lesson05;

import java.util.List;

/**
 * Created by Toll on 24.06.2017.
 */


/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
 Создай объекты и заполни их так, чтобы получилось:
 Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human,
то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Task02 {
    public static void main(String[] args) {

        Human Ded1 = new Human("Ded1", true, 80);
        Human Ded2 = new Human("Ded2", true, 70);
        Human Bab1 = new Human("Bab1", false, 65);
        Human Bab2 = new Human("Bab2", false, 75);
        Human Otec = new Human("Otec", true, 40, Ded1, Bab1);
        Human Mum = new Human("Mum", false, 35, Ded2, Bab2);
        Human Reb1 = new Human("Reb1", false, 15, Otec, Mum);
        Human Reb2 = new Human("Reb2", true, 10, Otec, Mum);
        Human Reb3 = new Human("Reb3", true, 8, Otec, Mum);

        printing(Ded1);
        printing(Ded2);
        printing(Bab1);
        printing(Bab2);
        printing(Otec);
        printing(Mum);
        printing(Reb1);
        printing(Reb2);
        printing(Reb3);

    }

    private static void printing(Human human) {
        System.out.println(human.toString());
    }

    private static class Human {
        String name;
        boolean sex;
        int age;
        Human dady;
        Human mumy;

        public Human(String name, boolean sex, int age, Human dady, Human mumy) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.dady = dady;
            this.mumy = mumy;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String getName() {
            return this.name;
        }

        @Override
        public String toString() {
            StringBuilder str = new StringBuilder();
            str.append("Имя: ").append(this.name).append(", пол: ");
            if (this.sex) str.append("man");
            else str.append("woman");
            str.append(", возраст: ").append(this.age).append(", отец: ");
            if (this.dady != null)
                str.append(this.dady.getName());
            else str.append("no");
            str.append(", мать: ");
            if (this.mumy != null) str.append(this.mumy.getName());
            else str.append("no");
            return str.toString();
        }
    }
}
