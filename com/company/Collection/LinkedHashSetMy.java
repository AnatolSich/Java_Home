package com.company.Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Toll on 14.06.2017.
 */
public class LinkedHashSetMy {
    public static void main(String[] args) {
        Set lhs = new LinkedHashSet();
        lhs.add(3);
        lhs.add(9);
        lhs.add(5);
        lhs.add(1);
        lhs.add(99);

        Iterator iter = lhs.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }

}
