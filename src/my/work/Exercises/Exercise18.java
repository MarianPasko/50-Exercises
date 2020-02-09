package my.work.Exercises;

public class Exercise18 {

    public static void run() {
        code();
    }
    private static void code() {
        int number = 0;
        for (int i = 0; i < 20; i++) {
            int b = (int) (Math.random() * (10 + 1));
            if (b == 7) {
                number += 1;
            } else {
                System.out.print(b + " ");
            }
        }
        System.out.println();
        System.out.printf("Cislo 7 sa vygenerovalo: %S", number);
    }
}
