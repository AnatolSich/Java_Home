package com.company.HomeWork;

/**
 * Created by Toll on 15.06.2017.
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(args[0]);
new Def();

    }
}

class Def {
    String name;
    int tnt;

    public Def(String name) {
        this.name = name;
    }

    public Def(String name, int tnt) {
        this.name = name;
        this.tnt = tnt;
    }

    public Def(int tnt) {
        this.tnt = tnt;
    }

    public Def() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }


}