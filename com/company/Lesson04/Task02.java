package com.company.Lesson04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toll on 22.06.2017.
 */

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:

лира
лоза
Выходные данные:
лира
лоза
лоза
*/

public class Task02 {
    public static void main(String[] args) throws IOException {
        printList(letters(adding()));

    }

    private static List<String> adding() throws IOException {
        List<String> words = new ArrayList<>();

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 4; i++) {
            words.add(bfr.readLine());
        }
        return words;
    }

    private static List<String> letters(List<String> list) {
        List<String> listTemp = new ArrayList<>();
        for (String str : list) {
            if (!str.contains("р") && str.contains("л")) {
                listTemp.add(str);
                listTemp.add(str);
            } else if (!str.contains("р") || (str.contains("р") && str.contains("л"))) {
                listTemp.add(str);
            }
        }
        return listTemp;
    }

    private static void printList (List <String> list){
        for (String str: list) {
            System.out.println(str);
        }
    }
}
