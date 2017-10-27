package com.company.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Toll on 14.06.2017.
 */
public class ArrayListMy {

    public static void main(String[] args) {
        List <Car> arli = new ArrayList();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Niva");
        Car car3 = new Car("Nissan");
        Car car4 = new Car("Nissan");

        arli.add(car1);
        arli.add(car2);
        arli.add(car3);
        arli.add(car4);
        arli.add(new Car("Toyota"));

        System.out.println("размер списка = " +arli.size());
        System.out.println("список содержит Niva = "+arli.contains(car2));
        System.out.println("индекс объекта Нива = "+ arli.indexOf(car2));
        Car cart = arli.get(4);
        System.out.println("объект под индексом 4 = "+ cart.name);

        Iterator <Car> iter = arli.iterator();
        while (iter.hasNext()) {
            Car car = iter.next();
            System.out.println(car.name);
        }

        arli.clear();
        System.out.println("пустой ли список после очистки = "+ arli.isEmpty());



    }
}
