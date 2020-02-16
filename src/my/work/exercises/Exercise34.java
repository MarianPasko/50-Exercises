package my.work.exercises;

import java.util.Scanner;

public class Exercise34 {
    public static void run(){
        Scanner src = new Scanner(System.in);
        System.out.print("Write the size of the circle radius : ");
        double sc = src.nextDouble();
        double content = Math.PI * (sc * sc);
        System.out.printf("The content of circle is: %f%n", content);
        double circumference = Math.PI * 2*sc;
        System.out.printf( "The circumference of the circle is: %f%n", circumference) ;
    }
}
