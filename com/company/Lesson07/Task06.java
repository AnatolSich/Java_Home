package com.company.Lesson07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Toll on 01.07.2017.
 */
 /* Провести 10 тысяч вставок, удалений
Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.

0[] 1[e] 2[] 3[] 4[] 5[] 6[] AL
[] - [] - [] - [] - [] - [] - [] LL
*/

public class Task06 {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        getting(setting(deleting(addingArrayList(list1))));
        getting(setting(deleting(addingArrayList(list2))));

    }

    static List addingArrayList(List list) {
   //     int x = list.size() / 2;
        for (int i = 0; i < 10000; i++) {
            list.add( new Integer(i));
        }
        return list;
    }


    static List deleting(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
        return list;
    }

    static List setting(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, new Integer(i));
        }
        return list;
    }

    static void getting(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
    }
}
