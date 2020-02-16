package my.work.exercises;

public class Exercise18 {
    public static void run() {
        int number = 0;
        System.out.print("Random numbers : ");
        for (int i = 0; i < 20; i++) {
            int b = (int) (Math.random() * (10 + 1));
            if (b == 7) {
                number += 1;
            } else ;
            System.out.printf("%d ", b);
        }
        System.out.printf("%nNumber 7 was generated : %s", number);
    }
}

