package my.work.Exercises;

import my.work.APP.Function;

public class Exercise13 {
    public static void run() {
        int[] numbs = {2, 5, 1, 9, 11, 12, 8, 7};
        System.out.print("Original numbers: ");
        for (int i = 0; i < numbs.length; i++) {
            System.out.printf("%s%s", numbs[i], " ");
        }
        ascending(numbs);
        descending(numbs);
    }

    private static int ascending(int[] numbs) {
        int ascending = numbs[0];
        int tp = 0;
        for (int i = 0; i < numbs.length; i++) {
            for (int j = i + 1; j < numbs.length; j++) {
                if (numbs[i] > numbs[j]) {
                    tp = numbs[i];
                    numbs[i] = numbs[j];
                    numbs[j] = tp;
                }
            }
        }
        System.out.print("\nElements sorted in ascending order : ");
        for (int i = 0; i < numbs.length; i++) {
            System.out.print(numbs[i] + " ");
        }
    return ascending;
    }

    private static int descending(int[] numbs) {
        int descending = numbs[0];
        int tp1 = 0;
        for (int t = 0; t < numbs.length; t++) {
            for (int k = t + 1; k < numbs.length; k++) {
                if (numbs[t] < numbs[k]) {
                    tp1 = numbs[t];
                    numbs[t] = numbs[k];
                    numbs[k] = tp1;
                }
            }
        }
        System.out.print("\nElements sorted in descending order : ");
        for (int t = 0; t < numbs.length; t++) {
            System.out.print(numbs[t] + " ");
        }
    return descending;
    }
}