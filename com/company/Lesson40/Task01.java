package com.company.Lesson40;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task01 {
    public static void main(String[] args) {
        List<String> listIn = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            listIn.add("" + i * 5);
        }

        for (String str:reduce(listIn)
             ) {
            System.out.println(str);
        }


    }

    private static List<String> reduce(List<String> list) {
        List<String> listOut = new ArrayList<>();
        ExecutorService service = Executors.newFixedThreadPool(list.size());

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);

            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    listOut.add(map(str));
                }
            };

            service.execute(runnable);
        }

       service.shutdown();
        System.out.println("ExecutorService shutdown");

        while (!service.isTerminated()){

        }
        System.out.println("Treads finished");
        return listOut;
    }

    private static String map(String str) {
        return str + str;
    }


}
