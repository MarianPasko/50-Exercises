package my.work.Exercises;

import java.util.ArrayList;
import java.util.List;

public class Exercise28 {

    public static void run() {
        code();
    }
    private static void code(){
        int[] arabic = {23, 168, 997, 1455, 3999};
        int y = 0;
        List<String> numb = new ArrayList<String>();

        for (int x : arabic) {
            y = x;
            while (y >= 1000) {
                numb.add("M");
                y -= 1000;
            }
            while (y >= 900) {
                numb.add("CM");
                y -= 900;
            }
            while (y >= 500) {
                numb.add("D");
                y -= 500;
            }
            while (y >= 400) {
                numb.add("CD");
                y -= 400;
            }
            while (y >= 100) {
                numb.add("C");
                y -= 100;
            }
            while (y >= 90) {
                numb.add("XC");
                y -= 90;
            }
            while (y >= 50) {
                numb.add("L");
                y -= 50;
            }
            while (y >= 40) {
                numb.add("XL");
                y -= 40;
            }
            while (y >= 10) {
                numb.add("X");
                y -= 10;
            }
            while (y >= 9) {
                numb.add("IX");
                y -= 9;
            }
            while (y >= 5) {
                numb.add("V");
                y -= 5;
            }
            while (y >= 4) {
                numb.add("IV");
                y -= 4;
            }
            while (y >= 1) {
                numb.add("I");
                y -= 1;
            }
            System.out.println(numb);
            numb.clear();
        }
    }
}
