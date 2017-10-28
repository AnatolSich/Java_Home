package com.company.Interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Toll on 28.10.2017.
 */

//Наибольший общий делитель 2 чисел
public class Nod {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bfr.readLine());
        int b = Integer.parseInt(bfr.readLine());
        if (b > a) {
            int i = a;
            a = b;
            b = i;
        }
        System.out.println(nod(a,b));

    }

    private static int nod(int a, int b) {
        if (a % b == 0) return b;
        else {
            while (true){
                int k= a%b;
                if (k!=0) {
                    a=b;
                    b=k;
                }
                else return b;
            }
        }
    }


}
