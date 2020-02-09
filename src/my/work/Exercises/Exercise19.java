package my.work.Exercises;

import java.util.Scanner;

public class Exercise19 {

    public static void run() {
        code();
    }

    private static void code() {
        Scanner in = new Scanner(System.in);
        System.out.print("Vloz slovo: ");
        String word = in.nextLine();
        word = word.trim();
        String result = "";
        char[] ch = word.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            result += ch[i];
        }
        System.out.printf("Obratene vstupne slovo: %s", result.trim());
    }
}
