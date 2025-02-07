package util;

import java.util.Arrays;

public class HistoryCollection {
    private static final int historyLength = 15;
    static String[] historyList = new String[historyLength];
    static int id = 0;

    public static void historyAdd(String command) {
        for (var i = historyLength - 1; i > 0; i--) {
            historyList[i] = historyList[i - 1];
        }
        historyList[0] = command;
    }

    public static String[] getHistoryList() {
        return historyList;
    }
}
