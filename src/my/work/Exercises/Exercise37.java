package my.work.Exercises;

import java.util.ArrayList;

public class Exercise37 {
    public static void run() {
        int[][] numbs = {{1, 2}, {3, 4}, {5, 6}, {7}};
        ArrayList<Integer> numb = new ArrayList<Integer>();
        for (int i = 0; i < numbs.length; i++) {
            for (int x = 0; x < numbs[i].length; x++) {
                numb.add(numbs[i][x]);
            }
        }
        System.out.printf("New list of numbers : %s", numb);
    }
}