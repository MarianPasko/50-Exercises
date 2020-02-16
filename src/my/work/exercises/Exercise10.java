package my.work.exercises;

import java.util.Random;

public class Exercise10 {
    public static void run() {
        int i = 0;
        System.out.println("Random 10 numbers :");
        while (i < 10) {
            Random x = new Random();
            int y = x.nextInt(101);
            System.out.println(y);
            i++;
        }
    }
}
