package my.work.Exercises;

import java.util.Scanner;

public class Exercise20 {
    public static void run() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse : ");
        long num = in.nextInt();
        long reverse = 0;
        while (num != 0) {
            reverse = reverse * 10;
            reverse = reverse + num % 10;
            num = num / 10;
        }
        System.out.printf("Reversed input number : %s", reverse);
    }
}
