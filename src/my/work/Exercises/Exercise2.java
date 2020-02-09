package my.work.Exercises;

import java.util.Properties;

public class Exercise2 {

    public static void run() {
        System.out.println("os.name: " + System.getProperty("os.name"));
        System.out.println("os.version: " + System.getProperty("os.version"));
        System.out.println("os.arch: " + System.getProperty("os.arch"));
    }
}
