package my.work.Exercises;

import javax.swing.*;

public class Exercise16 {

    public static void run() {
        code();
    }

    private static void code() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
