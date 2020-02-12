package my.work.Exercises;

public class Exercise24 {
    public static void run() {
        String msg = "Today is a beautiful day.";
        System.out.printf("Message is : %s", msg);
        System.out.printf("Number of vowels in the message = %s", vowels(msg));
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