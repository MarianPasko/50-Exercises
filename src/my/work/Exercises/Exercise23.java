package my.work.Exercises;

import java.util.Scanner;

public class Exercise23 {

    public static void run(){
        code();
    }
    private static void code() {
        String str, rev = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Vloz nejake slovo alebo cislo ci je palindrom:");
        str = in.nextLine();
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.printf("%s je palindrom %n", str);
        } else {
            System.out.printf("%s nie je palindrom %n", str);
        }
    }
}
