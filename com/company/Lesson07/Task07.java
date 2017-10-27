package com.company.Lesson07;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;


import static com.company.Lesson07.Task06.addingArrayList;


/**
 * Created by Toll on 01.07.2017.
 */

/* Измерить сколько времени занимает 10 тысяч вставок для каждого списка
Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getTimeMsOfInsert  должен вернуть время его исполнения в миллисекундах.
*/

public class Task07 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        System.out.println(getTimeMsOfInsert(list1));
       // addingArrayList(list2);
        System.out.println(getTimeMsOfInsert(list2));
    }

    private static long getTimeMsOfInsert (List list) {
        Date startDate = new Date();
        addingArrayList(list);
        Date endDate = new Date();
        return endDate.getTime()-startDate.getTime();
    }

}
