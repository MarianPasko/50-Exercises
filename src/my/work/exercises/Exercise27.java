package my.work.exercises;

public class Exercise27 {
    public static void run(){
        double x = 334;
        double y = 5000;
        double z = x / y;
        System.out.printf("Original number : %s%n", z);
        System.out.printf("Rounding number with 2 decimal : %.2f%n", z);
        System.out.printf("Rounding number with 3 decimal : %.3f", z);
    }
}