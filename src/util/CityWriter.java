package util;

import java.io.FileWriter;
import java.io.IOException;

public class CityWriter {
    public static void writeFile(String fileName, String[] lines) throws IOException {
        FileWriter writer = new FileWriter(fileName, true);
        for (var line = 0; line < lines.length; line++) {
            writer.write(lines[line]);
            writer.write("------------------------------------");
        }
        writer.close();
    }
}
