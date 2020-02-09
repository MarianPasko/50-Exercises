package my.work.Exercises;

public class Exercise15 {

    public static void run() {
        code();
    }
    private static void code() {
        int[] numbs = {2, 5, 1, 9, 11, 12, 8, 7};
        for (int x : numbs) {
            int y = x * 3;
            System.out.printf("%s%s", y, " ");
            y++;
        }
    }
}

