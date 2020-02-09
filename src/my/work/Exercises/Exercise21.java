package my.work.Exercises;

public class Exercise21 {

    public static void run() {
        code();
    }

    private static void code() {
        String[] words = {"forest ", "Wood ", "sky "};
        String UP = " ";
        for (int i = 0; i < words.length; i++) {
            UP = UP + words[i];
        }
        System.out.println(UP.toUpperCase());
    }
}
