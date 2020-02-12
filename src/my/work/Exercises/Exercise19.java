package my.work.Exercises;

import java.util.Scanner;

public class Exercise19 {
    public static void run(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the word you want to reverse : ");
        String word = in.nextLine();
        word = word.trim();
        String result = "";
        char[] ch = word.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            result += ch[i];
        }
        System.out.printf("Reversed input word : %s", result.trim());
    }
}