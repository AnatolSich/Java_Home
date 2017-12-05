package com.company.Lesson39;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 5; i < 100; i += 3) {
            list.add(3 * i - 1);
        }
        List<Integer> listOut = new ArrayList<>();

        listOut = reduce(list);
        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i) + "  " + listOut.get(i));
        }

    }

    private static Integer map(Integer num) {
        return num * 2;
    }

    private static List<Integer> reduce(List<Integer> list) {

        List<Integer> res = new ArrayList<>();

        ExecutorService executorService = Executors.newFixedThreadPool(100);

        for (Integer i : list
                ) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " Start");
                    res.add(map(i));
                    System.out.println(Thread.currentThread().getName() + " End");
                }
            };

            executorService.execute(runnable);
        }

        executorService.shutdown();
        while (!executorService.isTerminated()) {
        }
        System.out.println("Finished all threads");
        return res;


    }
}
