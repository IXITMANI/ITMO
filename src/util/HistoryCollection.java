package util;

import java.util.Arrays;

/**
 * Класс HistoryCollection хранит историю выполненных команд.
 */
public class HistoryCollection {
    /** Максимальная длина истории команд. */
    private static final int historyLength = 15;
    /** Массив для хранения истории команд. */
    static String[] historyList = new String[historyLength];


    /**
     * Добавляет команду в историю.
     *
     * @param command строка, содержащая команду
     */
    public static void historyAdd(String command) {
        for (var i = historyLength - 1; i > 0; i--) {
            historyList[i] = historyList[i - 1];
        }
        historyList[0] = command;
    }

    /**
     * Возвращает массив с историей команд.
     *
     * @return массив строк с историей команд
     */
    public static String[] getHistoryList() {
        return historyList;
    }
}
