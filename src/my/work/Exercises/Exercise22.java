package my.work.Exercises;

import my.work.APP.Function;

import java.util.Scanner;

public class Exercise22 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the First String : ");
        String word1 = scanner.nextLine();
        System.out.print("Enter the second String : ");
        String word2 = scanner.nextLine();

        if (Function.checkAnagram(word1, word2))
            System.out.println(word1 + " and " + word2 + " are Anagrams");
        else
            System.out.println(word1 + " and " + word2 + " are NOT Anagrams");

        scanner.close();
    }
}
