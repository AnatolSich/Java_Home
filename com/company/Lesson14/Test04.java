package com.company.Lesson14;

/**
 * Created by Toll on 26.07.2017.
 */
public class Test04 {
}
class Top{}
class Sub extends Top{}
 class Test{
    public static void main(String[] args){
        Top t = new Top();
        Sub s = (Sub) t;
    }
}