package my.work.Exercises;

import java.util.Scanner;

public class Exercise23 {
    public static void run(){
        String str, rev = "";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a random word or number : ");
        str = in.nextLine();
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.printf("%s is oalindrome %n", str);
        } else {
            System.out.printf("%s isn't palindrome %n", str);
        }
    }
}