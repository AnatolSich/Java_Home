package com.company.Lesson15;

/**
 * Created by Toll on 28.07.2017.
 */
public class Test05 {
    public static void main(String[] args) {

    }
}

class animal {
    public void say(){
        //
    }
}

class dog extends animal{
    public void say() {
        super.say();
    }
}

class cat {
    animal a;
    public void say() {
        a.say();
    }

    public void setA(animal a) {
        this.a = a;
    }
}