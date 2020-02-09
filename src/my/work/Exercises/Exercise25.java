package my.work.Exercises;

import my.work.APP.Function;

public class Exercise25 {

    public static void run(){
        code();
    }

    private static void code() {
        int[] numbs = {3, 5, 2, 1, 8, 9, 12, 11, 7, 6};
        System.out.printf("Minimum = %s%n", Function.min(numbs));
        System.out.printf("Maximum = %s%n", Function.max(numbs));
        System.out.printf("Sumar = %s%n", Function.sum(numbs));
        System.out.printf("Pocet prvkov = %s%n", numbs.length);
    }
}
