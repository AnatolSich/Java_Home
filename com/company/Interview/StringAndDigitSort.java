package com.company.Interview;

import java.util.ArrayList;
import java.util.List;

public class StringAndDigitSort {
    public static void main(String[] args) {
        List<String> listIn = new ArrayList<>();
        listIn.add("g");
        listIn.add("9");
        listIn.add("b");
        listIn.add("5.5");
        listIn.add("1");
        listIn.add("a");
        listIn.add("e");
        listIn.add("y");
        listIn.add("j");
        listIn.add("1.01");
        listIn.add("l");
        listIn.add("c");
        listIn.add("5");
        listIn.add("a");
        listIn.add("2.3");


        for (int i = 0; i < listIn.size(); i++) {
            System.out.print(listIn.get(i) + "    ");
        }

        List<String> listOut = bubbleSortOneFor(listIn);


        System.out.println();
        for (int i = 0; i < listOut.size(); i++) {
            System.out.print(listOut.get(i) + "    ");
        }
    }

   /* private static List<String> bubbleSortTwoFor(List<String> list) {
        boolean flag = true;

        for (int i = 0; i < list.size(); i++) {

            int j = 0;
            if (!flag) j = 1;
            String str = list.get(j);
            String str2;
            int next = findNextToEnd(list, j);




            while (next != -100) {

                if (!isDigital(str)) {
                    str = list.get(j);
                    str2 = list.get(next);
                    if (str.compareTo(str2) > 0) {
                        list.set(j, list.set(next, list.get(j)));
                    }
                } else if (isDigital(str)) {
                    str = list.get(j);
                    str2 = list.get(next);
                    double n1 = Double.valueOf(str);
                    double n2 = Double.valueOf(str2);
                    if (n1 > n2) {
                        list.set(j, list.set(next, list.get(j)));
                    }
                }

                j = next;
                next = findNextToEnd(list, j);
            }


        }
        return list;
    }
*/

    private static List<String> bubbleSortOneFor(List<String> list) {
        for (int i = 0; i < list.size(); ) {
            String str = list.get(i);
            String str2;


            if (!isDigital(str)) {
                int next = findNextToEnd(list, i);
                if (next != -100) {
                    str2 = list.get(next);
                    if (str.compareTo(str2) > 0) {
                        list.set(i, list.set(next, list.get(i)));
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
            } else if (isDigital(str)) {
                int next = findNextToEnd(list, i);
                if (next != -100) {
                    str2 = list.get(next);
                    double n1 = Double.valueOf(str);
                    double n2 = Double.valueOf(str2);
                    if (n1 > n2) {
                        list.set(i, list.set(next, list.get(i)));
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
        if (!isDigital(str)) {
            for (int j = i - 1; j >= 0; j--) {
                str2 = list.get(j);
                if (!isDigital(str2)) {
                    k = j;
                    break;
                }
            }
        } else if (isDigital(str)) {
            for (int j = i - 1; j >= 0; j--) {
                str2 = list.get(j);
                if (isDigital(str2)) {
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
        if (!isDigital(str)) {
            for (int j = i + 1; j < list.size(); j++) {
                str2 = list.get(j);
                if (!isDigital(str2)) {
                    k = j;
                    break;
                }
            }
        } else if (isDigital(str)) {
            for (int j = i + 1; j < list.size(); j++) {
                str2 = list.get(j);
                if (isDigital(str2)) {
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

    private static boolean isDouble(String str) {
        try {
            Double.valueOf(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isDigital(String str) {
        if (isInt(str) || isDouble(str)) return true;
        else return false;


    }
}
