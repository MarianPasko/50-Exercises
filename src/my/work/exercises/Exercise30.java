package my.work.exercises;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Exercise30 {
    public static void run() throws IOException {
        File file = new File("src/my/work/resources/thermopylae.txt");
        File file2 = new File("src/my/work/resources/thermopylae2.txt");
        Files.copy(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
}
