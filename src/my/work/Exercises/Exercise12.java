package my.work.Exercises;

public class Exercise12 {

    public static void run() {
        String numb = "3-5-7-8-19";
        String[] x = numb.split("-");
        int sum = 1;
        int[] y = new int[x.length];
        for (int i = 0; i < y.length; i++) {
            y[i] = Integer.parseInt(x[i]);
        }
        for (int z : y) {
            sum += z;
        }
        System.out.printf("The sum of numbers is : %s", sum);
    }
}

