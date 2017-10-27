package com.company.Lesson08;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Toll on 06.07.2017.
 */

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

public class Task02 {
    public static void main(String[] args) {
        printPets(removeCats(join(createCats(),createDogs())));


    }
    private static Set<Cat> createCats() {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Set <Cat> set = new HashSet<>();
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        return set;
    }

    private static Set<Dog> createDogs() {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Set <Dog> set = new HashSet<>();
        set.add(dog1);
        set.add(dog2);
        set.add(dog3);
        return set;
    }
    private static Set <Object> join (Set<Cat> set1, Set<Dog> set2){
        Set <Object> set = new HashSet<>();
       set.addAll(set1);
       set.addAll(set2);
       return set;
    }

    private static Set<Object> removeCats (Set <Object> set){
        Set <Object> endSet = new HashSet<>();
        for (Object o : set) {
            if (!(o instanceof Cat)) endSet.add(o);
        }
        return endSet;
    }

    private static void printPets (Set <Object> set){
        for (Object o : set) {
            System.out.println(o);
        }
    }
    static class Cat {

    }
    static class Dog{

    }
}
