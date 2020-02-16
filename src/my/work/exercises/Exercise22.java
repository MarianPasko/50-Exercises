package my.work.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise22 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the First String : ");
        String word1 = scanner.nextLine();
        System.out.print("Enter the second String : ");
        String word2 = scanner.nextLine();
        if (checkAnagram(word1, word2))
            System.out.printf("%s and %s are Anagrams", word1, word2);
        else
            System.out.printf("%s and %s are NOT Anagrams", word1, word2);
        scanner.close();
    }

    private static boolean checkAnagram(String word1, String word2) {
        word1 = word1.replaceAll("s", "");
        word2 = word2.replaceAll("s", "");

        if (word1.length() != word2.length())
            return false;

        else {
            char[] arr1 = word1.toLowerCase().toCharArray();
            char[] arr2 = word2.toLowerCase().toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return (Arrays.equals(arr1, arr2));
        }
    }
}
