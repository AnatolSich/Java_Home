package com.company.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Toll on 13.06.2017.
 */
public class HashsetMy {

    public static void main(String[] args) {
      /*  String vh1 = new String("34342");
        Integer vh2 = new Integer(6546);*/

        Set  cars = new HashSet ();

        Car car1 = new Car("BMW");
        Car car2 = new Car("Niva");
        Car car3 = new Car("Nissan");
        Car car4 = new Car("Nissan");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        Iterator <Car> iter = cars.iterator();

        while (iter.hasNext()) {
            Car car = (Car) iter.next();
            System.out.println(car.name+ " "+ car.hashCode());
        }


    }
}

class Car {
    String name;

    Car(String name) {
        this.name = name;
    }



    @Override
    public int hashCode() {
        return name.hashCode();
    }
}