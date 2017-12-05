package com.company.Lesson38;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toll on 30.11.2017.
 */
public class Task02 {
    public static void main(String[] args) {
        //  System.out.println(isInt("2"));
        List<String> listIn = new ArrayList<>();
        listIn.add("g");
        listIn.add("9");
        listIn.add("b");
        listIn.add("5");
        listIn.add("1");
        listIn.add("a");
        listIn.add("e");
        listIn.add("y");
        listIn.add("j");
        listIn.add("1");
        listIn.add("l");
        listIn.add("c");
        listIn.add("5");
        listIn.add("a");
        listIn.add("2");

       /* System.out.println(findNextToEnd(listIn, 1));
        System.out.println(findNextToStart(listIn, 5));*/


        for (int i = 0; i < listIn.size(); i++) {
            System.out.print(listIn.get(i) + " ");
        }

        List<String> listOut = sorting(listIn);


        System.out.println();
        for (int i = 0; i < listOut.size(); i++) {
            System.out.print(listOut.get(i) + " ");
        }
    }

    private static List<String> sorting(List<String> list) {
        for (int i = 0; i < list.size() - 1; ) {
            String str = list.get(i);
            String str2;


            if (!isInt(str)) {
                int next = findNextToEnd(list, i);
                if (next != -100) {
                    str2 = list.get(next);

                    if (str.compareTo(str2) > 0) {
                        list.set(i, str2);
                        list.set(next, str);
                        if (i > 0) {
                            int temp2 = findNextToStart(list, i);
                            if (temp2 != -100) {
                                i = temp2;
                                continue;
                            }

                        }
                    } else {
                        i++;
                        continue;
                    }

                }
            }
            if (isInt(str)) {
                int next = findNextToEnd(list, i);
                if (next != -100) {
                    str2 = list.get(next);
                    int n1 = Integer.valueOf(str);
                    int n2 = Integer.valueOf(str2);
                    if (n1 > n2) {
                        list.set(i, str2);
                        list.set(next, str);
                        if (i > 0) {
                            int temp2 = findNextToStart(list, i);
                            if (temp2 != -100) {
                                i = temp2;
                                continue;
                            }

                        }
                    } else {
                        i++;
                        continue;
                    }
                }
            }
            i++;
        }


        return list;
    }

    private static int findNextToStart(List<String> list, int i) {
        String str = list.get(i);
        String str2;
        int k = -100;
        if (!isInt(str)) {
            for (int j = i - 1; j >= 0; j--) {
                str2 = list.get(j);
                if (!isInt(str2)) {
                    k = j;
                    break;
                }
            }
        } else if (isInt(str)) {
            for (int j = i - 1; j >= 0; j--) {
                str2 = list.get(j);
                if (isInt(str2)) {
                    k = j;
                    break;
                }
            }
        }
        return k;
    }


    private static int findNextToEnd(List<String> list, int i) {
        String str = list.get(i);
        String str2;
        int k = -100;
        if (!isInt(str)) {
            for (int j = i + 1; j < list.size(); j++) {
                str2 = list.get(j);
                if (!isInt(str2)) {
                    k = j;
                    break;
                }
            }
        } else if (isInt(str)) {
            for (int j = i + 1; j < list.size(); j++) {
                str2 = list.get(j);
                if (isInt(str2)) {
                    k = j;
                    break;
                }
            }
        }
        return k;
    }

    private static boolean isInt(String str) {
        try {
            Integer.valueOf(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

   /* private static boolean isDigital(String str) {
        boolean i;
        boolean d;
        try {
            Integer.valueOf(str);
            i = true;
        } catch (NumberFormatException e) {
            i = false;
        }
        try {
            Double.valueOf(str);

            d = true;
        } catch (NumberFormatException e) {
            d = false;
        }
        if (i || d) return true;
        else return false;


    }*/
}
