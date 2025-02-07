package util;

import Commands.Invoker;

import java.io.*;
import java.util.Scanner;

public class CityReader {
    private static final byte[] buffer = new byte[2048];
    private static final Scanner scanner = new Scanner(System.in);
    private static String[] fileText;
    private static String fileName;
    private static int index;

    public static String ConsoleReadLine() {
        return scanner.nextLine();
    }

    public static void ReadFile() {
        index = 0;
        fileName = Invoker.getParameter();
        try {
            BufferedInputStream file = new BufferedInputStream(new FileInputStream(System.getProperty("user.dir") +"\\src\\" + fileName));
            fileText = new String(buffer, 0, file.read(buffer)).split("\n");
        } catch (FileNotFoundException e) {
            System.out.println("Такого файла не существует");
        } catch (IOException e) {
            System.out.println("Не удалось считать файл");
        }
    }

    public static String[] FileReadLines() {
        return fileText;
    }

    public static boolean ConsoleHasNext() {
        return scanner.hasNext();
    }

    public static String getFileName() {
        return fileName;
    }
}
