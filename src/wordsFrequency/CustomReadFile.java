package wordsFrequency;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CustomReadFile {
    public static String[] readFile (String path) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(path))).toLowerCase();

        return content.split("\\W+");
    }
}
