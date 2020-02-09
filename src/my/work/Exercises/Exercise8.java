package my.work.Exercises;

public class Exercise8 {

    public static void run() {
        int x = 99;
        for (int y = 99, z = 98; y > 0; --y, --z) {
            if (y >= 2) {
                System.out.printf("%s%s%s%s%s", "I have on the wall ", y, " beers.\nOne beer fell down on the ground.\n", z, " glasses stay on the wall.\n");
                System.out.println();
                --x;
            } else if (y == 1) {
                System.out.printf("%s%s%s%s", "I have on the wall ", y, " beer.\nTake one down, pass it around.\n", "There were no beers on the wall.");
                --x;
            } else;
        }
    }
}

