package my.work.Exercises;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exercise6 {
    public static void run(){
        placeDateTime("Europe/Moscow");
        placeDateTime("Europe/Paris");
        placeDateTime("Europe/Oslo");
    }

    private static String placeDateTime(String x) {
        ZoneId zoneId = ZoneId.of(x);
        ZonedDateTime zdt = ZonedDateTime.now(zoneId);
        System.out.printf("Currently time and date in : %d% %d%n", x, zdt);
        return x;
    }
}
