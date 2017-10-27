package com.company.Lesson11;

import java.io.*;

/**
 * Created by Toll on 15.07.2017.
 */
public class Task03 {

    public static void main(String[] args) throws IOException {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String filePath1 = bfr.readLine();
        String filePath2 = bfr.readLine();

        FileInputStream fileInputStream = new FileInputStream(filePath1);
        FileOutputStream fileOutputStream = new FileOutputStream(filePath2);

        while (fileInputStream.available()>0) {
            int i = fileInputStream.read();
            fileOutputStream.write(i);
        }

    }

}
