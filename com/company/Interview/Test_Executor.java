package com.company.Interview;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Toll on 25.11.2017.
 */
public class Test_Executor {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            strings.add("" + i);
        }

        strings = reduce(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static String map(String s){
        return s + ".";
    }

    public static List<String> reduce(List<String> strings){
        List<String> result = new ArrayList<>();

        ExecutorService executorService = Executors.newFixedThreadPool(100);

        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " Start");
                    result.add(map(s));
                    System.out.println(Thread.currentThread().getName() + " End");
                }
            };
            executorService.execute(runnable);
        }
        executorService.shutdown();
        while (!executorService.isTerminated()){}
        System.out.println("Finished all threads");
        return result;
    }


}
