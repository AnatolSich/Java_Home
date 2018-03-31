package com.company.Interview;

public class Nod220318 {
    public static void main(String[] args) {
        System.out.println(nod(15,35));
    }

    public static int nod(int a, int b) {
        if (b > a) {
            int t = a;
            a = b;
            b = t;
        }
        while (b!=0){
            int t =a/b;
            int h=a;
            a=b;
            b=h-b*t;
        }
        return a;
    }
}
