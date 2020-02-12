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
            System.out.printf("%s and %s are Anagrams", word1, word2);
        else
            System.out.printf("%s and %s are NOT Anagrams", word1, word2);
        scanner.close();
    }
}
