package util;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Класс CityWriter отвечает за запись данных в файл.
 */
public class CityWriter {
    /**
     * Записывает массив строк в указанный файл.
     *
     * @param fileName имя файла, в который нужно записать данные
     * @param lines массив строк для записи
     * @throws IOException если произошла ошибка при записи в файл
     */
    public static void writeFile(String fileName, String[] lines) throws IOException {
        FileWriter tempFile = new FileWriter(fileName);
        tempFile.close();
        FileWriter writer = new FileWriter(fileName, true);
        try {
        for (var line = 0; line < lines.length; line++) {
            writer.write(lines[line]);
            writer.write("\n------------------------------------\n");
        }} catch (IOException e) {
            System.out.println("Произошла ошибка записи в файл");
        }
        writer.close();
    }
}
