package com.company.Lesson06.DZ;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Toll on 01.07.2017.
 */

/* Set из котов
1. Внутри класса создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
Каждый кот с новой строки.
*/

public class CatSets {
    public static void main(String[] args) {
        Set<Cat> catSet = new HashSet<>();
        catSet = createCats();
        printingMap(catSet);
        catSet = deleting(catSet);
        printingMap(catSet);

    }

    private static Set<Cat> createCats() {
        Set<Cat> catSet = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            int j = (int) (Math.random() * 10);
            Cat cat = new Cat(j + "Котяра" + (i + 1));
            catSet.add(cat);
        }
        return catSet;
    }

    private static Set<Cat> deleting(Set<Cat> set) {
        Set<Cat> delCatSet = new HashSet<>();
        Iterator<Cat> iter = set.iterator();
        while (iter.hasNext()) {
            Cat cat = iter.next();
            if (cat.name.contains("Котяра2"))
                delCatSet.add(cat);
        }
        set.removeAll(delCatSet);
        return set;
    }

    private static void printingMap(Set<Cat> set) {

        Iterator<Cat> iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println("Кот по имени - " + iter.next());
        }
        System.out.println("--------------------");
    }

    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Cat)) return false;

            Cat cat = (Cat) o;

            return name.equals(cat.name);
        }

        @Override
        public int hashCode() {
            return name.hashCode();
        }

        @Override
        public String toString() {
            return this.name;

        }
    }
}

