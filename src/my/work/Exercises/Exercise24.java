package my.work.Exercises;

public class Exercise24 {

    public static void run(){
    code();
}

    private static void code() {
        String msg = "Today is a beautiful day";
        System.out.println("Number of vowels in the string = " + vowels(msg));
    }

    private static int vowels(String msg) {
        int x = 0;
        for (int b = 0; b < msg.length(); b++) {
            if (msg.charAt(b) == 'a' || msg.charAt(b) == 'e' || msg.charAt(b) == 'i' || msg.charAt(b) == 'o' || msg.charAt(b) == 'u' || msg.charAt(b) == 'y') {
                x++;
            }
        }
        return x;
    }

}
