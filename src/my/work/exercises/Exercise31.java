package my.work.exercises;

import java.io.File;
import java.io.IOException;

public class Exercise31 {
    public static void run() throws IOException{
        File file = new File("src/my/work/resources/thermopylae.txt");
        double size = file.length();
        double bytes = size;
        double kilobytes = (bytes / 1024);
        System.out.printf("bytes : %f%n", bytes);
        System.out.printf("kilobytes : %f%n", kilobytes);
    }
}
