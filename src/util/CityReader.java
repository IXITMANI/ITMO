package util;

import Commands.Invoker;

import java.io.*;
import java.util.Scanner;

/**
 * Класс CityReader отвечает за чтение ввода с консоли или из файла.
 */
public class CityReader {
    /**
     * Флаг, указывающий, выполняется ли скрипт.
     */
    public static boolean scriptFlag = false;
    private static final byte[] buffer = new byte[2048];
    private static final Scanner scanner = new Scanner(System.in);
    private static String[] fileText;
    private static String fileName;
    private static int counter = 0;
    private static boolean hasNext = true;

    /**
     * Считывает строку с консоли.
     *
     * @return введённая строка
     */
    public static String consoleReadLine() {
        return scanner.nextLine();
    }

    /**
     * Читает содержимое файла и загружает его в память.
     */
    public static void readFile() {
        scriptFlag = true;
        fileName = Invoker.getParameter();
        try {
            BufferedInputStream file = new BufferedInputStream(new FileInputStream(System.getProperty("user.dir") + fileName));
            fileText = new String(buffer, 0, file.read(buffer)).split("\n");
        } catch (FileNotFoundException e) {
            System.out.println("Такого файла не существует");
        } catch (IOException e) {
            System.out.println("Не удалось считать файл");
        }
    }

    /**
     * Читает одну строку из файла.
     *
     * @return строка из файла
     */
    public static String readLine() {
        if (counter + 1 > fileText.length) {
            hasNext = false;
        }
        if (hasNext) {
            String line = fileText[counter].trim().replace("\r", "").replace("\n", "");
            counter += 1;

            return line;
        }
        return null;
    }

    /**
     * Возвращает все строки из файла.
     *
     * @return массив строк из файла
     */
    public static String[] readLines() {
        return fileText;
    }

    /**
     * Проверяет, есть ли ещё строки в файле.
     *
     * @return true, если есть ещё строки, иначе false
     */
    public static boolean fileHasNext() {
        return hasNext;
    }

    /**
     * Проверяет, есть ли ещё ввод в консоли.
     *
     * @return true, если есть ввод, иначе false
     */
    public static boolean consoleHasNext() {
        return scanner.hasNext();
    }

    /**
     * Возвращает имя текущего файла.
     *
     * @return имя файла
     */
    public static String getFileName() {
        return fileName;
    }
}
