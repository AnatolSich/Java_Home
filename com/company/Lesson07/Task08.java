package com.company.Lesson07;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import static com.company.Lesson07.Task06.addingArrayList;
import static com.company.Lesson07.Task06.getting;

/**
 * Created by Toll on 01.07.2017.
 */

/* Измерить сколько времени занимает 10 тысяч вызовов get для каждого списка
Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
Метод getTimeMsOfGet  должен вернуть время его исполнения в миллисекундах.
*/

public class Task08 {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        System.out.println(getTimeMsOfGet(addingArrayList(list1)));
        System.out.println(getTimeMsOfGet(addingArrayList(list2)));


    }

    private static long getTimeMsOfGet(List list){
        Date startDate = new Date();
        getting(list);
        Date endDate = new Date();
        return endDate.getTime()-startDate.getTime();
    }
}
