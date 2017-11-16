package com.company.Lesson33;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Toll on 11.11.2017.
 */
public class Task01 {
    public static void main(String[] args) {
        Set<Gg> map = new HashSet<>();
        map.add(new Gg("001",1,1));
        map.add(new Gg("001",1,2));
        map.add(new Gg("001",1,3));

        System.out.println(new Gg("001",1,1).equals(new Gg("001",1,2)));

        System.out.println(map.size());
    }
}
class Gg{
    String name;
    int i;
    int j;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gg)) return false;

        Gg gg = (Gg) o;

        if (i != gg.i) return false;
        return name != null ? name.equals(gg.name) : gg.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + i;
        result = 31 * result + j;
        return result;
    }



    public Gg(String name, int i, int j) {
        this.name = name;
        this.i = i;
        this.j = j;
    }
}