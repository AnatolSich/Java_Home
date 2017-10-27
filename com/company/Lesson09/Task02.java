package com.company.Lesson09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Toll on 08.07.2017.
 */

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.

Имя: ded Ivan, пол: мужской, возраст: 70, дети: papa Fedya
Имя: baba Masha, пол: женский, возраст: 65, дети: papa Fedya
Имя: papa Fedya, пол: мужской, возраст: 40, дети: son Lesha, son Misha, daughter Masha
*/

public class Task02 {
    public static void main(String[] args) {
        Human child1 = new Human("child1", true, 8);
        Human child2 = new Human("child2", false, 10);
        Human child3 = new Human("child3", true, 5);
        Human daddy = new Human("daddy", true, 35, child1, child2, child3);
        Human mummy = new Human("mummy", false, 30, child1, child2, child3);
        Human ded1 = new Human("ded1", true, 80, daddy);
        Human bab1 = new Human("bab1", false, 75, daddy);
        Human ded2 = new Human("ded2", true, 78, mummy);
        Human bab2 = new Human("bab2", false, 72, mummy);

        List<Human> list = new ArrayList<>();
        list.add(ded1);
        list.add(ded2);
        list.add(bab1);
        list.add(bab2);
        list.add(daddy);
        list.add(mummy);
        list.add(child1);
        list.add(child2);
        list.add(child3);
        for (Human human : list) {
            System.out.println(human);
        }
    }
}

class Human {
    String name;
    boolean sex;
    int age;
    ArrayList<Human> children;

    public Human(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.children = new ArrayList<>();
    }

    public Human(String name, boolean sex, int age, Human... childs) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.children = new ArrayList<>();
        this.children.addAll(Arrays.asList(childs));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String isSex() {
        if (this.sex == true)
            return "man";
        else return "woman";
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getChildren() {
        String str = "";
        int i =0;
        if (!this.children.isEmpty()) {
            for (Human child : this.children) {
                if (i!=this.children.size()-1){
                    str = str + child.getName() + ", ";
                i++;}
                else str = str + child.getName();
            }
        }

        return str;
    }

    public void setChildren(ArrayList<Human> children) {
        this.children = children;
    }

    @Override
    public String toString() {

        if (!this.children.isEmpty()) {

            return "Имя: " + this.getName() + ", пол: " + this.isSex() + ", возраст: " + this.getAge() + ", дети: " + this.getChildren();
        }
        else
            return "Имя: " + this.getName() + ", пол: " + this.isSex() + ", возраст: " + this.getAge();
    }
}
