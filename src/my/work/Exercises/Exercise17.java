package my.work.Exercises;

public class Exercise17 {
    public static void run() {
        int[] numbs = {3, 5, 10, 20};
        factorials(numbs);
    }

    private static int[] factorials(int[] numbs) {
        for (int x : numbs) {
            long z = 1;
            for (int y = 1; y <= x; ++y) {
                z *= y;
            }
            System.out.printf("Faktorial number %d is %d%n", x, z);
        }
        return numbs;
    }
}