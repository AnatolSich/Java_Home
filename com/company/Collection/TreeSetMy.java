package com.company.Collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Toll on 14.06.2017.
 */
public class TreeSetMy {
    public static void main(String[] args) {

        Set tree = new TreeSet();
        tree.add(6);
        tree.add(8);
        tree.add(2);
        tree.add(9);
        tree.add(5);

        Iterator iter = tree.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }

}
