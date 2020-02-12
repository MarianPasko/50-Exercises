package my.work.Exercises;

public class Exercise14 {
    public static void run() {
        int sum = 1;
        int[] num = {2, 5, 1, 9, 11, 12, 8, 7};
        for (int x : num) {
            sum *= x;
        }
        System.out.println(sum);
    }
}
