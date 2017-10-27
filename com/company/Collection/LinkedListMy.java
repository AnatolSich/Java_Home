package com.company.Collection;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Toll on 14.06.2017.
 */
public class LinkedListMy {

    public static void main(String[] args) {

        LinkedList<Car> lilist = new LinkedList();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Niva");
        Car car3 = new Car("Nissan");
        Car car4 = new Car("Toyota");

        lilist.add(car1);
        lilist.add(car2);
        lilist.add(car3);
        lilist.add(car4);
        lilist.addFirst(car4);

        Iterator<Car> iter = lilist.descendingIterator();
        Iterator<Car> iter2 = lilist.iterator();
        while (iter.hasNext()) {
            Car car = iter.next();
            System.out.println(car.name);
        }
        System.out.println();
        while (iter2.hasNext()) {
            Car car =  iter2.next();
            System.out.println(car.name);
        }

        for (Car car : lilist) {

        }

    }
}
