package my.work.Exercises;

import java.io.IOException;

public class Exercise7 {

    public static void run() {
        Runtime rs = Runtime.getRuntime();
        try {
            rs.exec("notepad");
            System.out.println("Notepad sa otvoril.");
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("Nepodarilo sa otvorit Notepad.");
        }
    }
}
