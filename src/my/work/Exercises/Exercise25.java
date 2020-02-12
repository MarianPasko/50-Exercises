package my.work.Exercises;

public class Exercise25 {
    public static void run() {
        int[] numbs = {3, 5, 2, 1, 8, 9, 12, 11, 7, 6};
        System.out.printf("Minimum = %s%n", minimum(numbs));
        System.out.printf("Maximum = %s%n", maximum(numbs));
        System.out.printf("Sum = %s%n", sum(numbs));
        System.out.printf("Number of elements = %s%n", numbs.length);
    }

    private static int minimum(int[] numbs) {
        int min = numbs[0];
        for (int y = 1; y < numbs.length; y++) {
            if (numbs[y] < min) {
                min = numbs[y];
            }
        }
        return min;
    }

    private static int maximum(int[] numbs) {
        int max = numbs[0];
        for (int y = 1; y < numbs.length; y++) {
            if (numbs[y] > max) {
                max = numbs[y];
            }
        }
        return max;
    }

    private static int sum(int[] numbs) {
        int sum = 0;
        for (int y : numbs) {
            sum += y;
        }
        System.out.print(sum);
        return sum;
    }
}