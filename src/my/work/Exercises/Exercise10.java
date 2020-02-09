package my.work.Exercises;

import java.util.Random;

public class Exercise10 {

    public static void run() {
        int i = 0;
        System.out.println("Nahodne cisla:");
        while (i < 10) {
            Random x = new Random();
            int y = x.nextInt(101);
            System.out.println(y);
            i++;
        }
    }
}
