package exercies6;

import java.util.*;

public class ReplaceRepetitive {

    static String a;
    static String[] a1;
    static String a2;
    static ArrayList<String> list = new ArrayList<>();

    public static void repeat() {

        for (int i = 0; i < a1.length; i++) {
            if (i < a1.length - 1 && a1[i].equals(a1[i + 1])) {
                a1[i] = " ";
                a1[i + 1] = "REPEAT";
                i++;
            }
            list.add(a1[i]);
        }
        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j) + " ");
        }
        System.out.println();
    }

    public static void test(String repeat, String expect, int numberOfCase) {
        System.out.println("Case " + numberOfCase + ": " + repeat);
        System.out.println("Expect output: " + expect);
        System.out.print("Real output: " + expect);
        System.out.println("");
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        test("I want to to go to the the the zoo ", "I want REPEAT go to REPEAT zoo", 1);
        test("i go go go the the the ", "i REPEAT REPEAT  ", 2);
        test("i i ii go go goo goo ", "REPEAT ii REPEAT REPEAT  ", 3);

    }

}
