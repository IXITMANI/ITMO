package util;

import Commands.Invoker;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CityReader {
    public static boolean scriptFlag = false;
    private static final byte[] buffer = new byte[2048];
    private static final Scanner scanner = new Scanner(System.in);
    private static String[] fileText;
    private static String fileName;
    private static int counter = 0;
    private static boolean hasNext = true;

    public static String consoleReadLine() {
        return scanner.nextLine();
    }

    public static void readFile() {
        scriptFlag = true;
        fileName = Invoker.getParameter();
        try {
            BufferedInputStream file = new BufferedInputStream(new FileInputStream(System.getProperty("user.dir") + "\\src\\" + fileName));
            fileText = new String(buffer, 0, file.read(buffer)).split("\n");
        } catch (FileNotFoundException e) {
            System.out.println("Такого файла не существует");
        } catch (IOException e) {
            System.out.println("Не удалось считать файл");
        }
    }

    public static String readLine() {
        if (counter + 2 > fileText.length){
            hasNext = false;
        }
        String line = fileText[counter].trim().replace("\r", "").replace("\n", "");
        counter += 1;
        return line;
    }

    public static String[] readLines() {
        return fileText;
    }

    public static boolean fileHasNext() {
        return hasNext;
    }

    public static boolean consoleHasNext() {
        return scanner.hasNext();
    }

    public static String getFileName() {
        return fileName;
    }
}
