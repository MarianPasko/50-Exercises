package my.work.exercises;

public class Exercise15 {
    public static void run() {
        int[] numbs = {2, 5, 1, 9, 11, 12, 8, 7};
        System.out.print("Original numbers : ");
        for ( int a : numbs){
            System.out.printf("%d ", a);
        }
        System.out.print("\nMultiplied by numbers : ");
        for (int x : numbs) {
            int y = x * 3;
            System.out.printf("%d ", y);
            y++;
        }
    }
}