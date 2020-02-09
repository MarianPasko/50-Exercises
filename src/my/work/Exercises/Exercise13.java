package my.work.Exercises;

import my.work.APP.Function;

public class Exercise13 {

    public static void run() {
        int[] numbs = {2, 5, 1, 9, 11, 12, 8, 7};
        System.out.println("Originalne cisla : ");
        for (int i = 0; i < numbs.length; i++) {
            System.out.printf("%s%s", numbs[i], " ");
        }
        Function.ascending(numbs);
        Function.descending(numbs);
    }
}
