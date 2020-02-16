package my.work.exercises;

import java.io.IOException;

public class Exercise7 {
    public static void run() {
        Runtime rs = Runtime.getRuntime();
        try {
            rs.exec("notepad");
            System.out.println("Notepad opened.");
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("Failed to open Notepad.");
        }
    }
}
