package util;

import Commands.Invoker;

import java.io.*;
import java.util.Scanner;

public class CityReader {
    public static boolean scriptFlag = false;
    private static final byte[] buffer = new byte[2048];
    private static final Scanner scanner = new Scanner(System.in);
    private static String[] fileText;
    private static String fileName;
    private static int index = -1;

    public static String consoleReadLine() {
        return scanner.nextLine();
    }

    public static void readFile() {
        scriptFlag = true;
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
    public static String readLine(){
        index += 1;
        return fileText[index];
    }
    public static String[] readLines(){
        return fileText;
    }

    public static boolean consoleHasNext() {
        return scanner.hasNext();
    }

    public static String getFileName() {
        return fileName;
    }
}
