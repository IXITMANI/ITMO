package Commands;

import util.CityReader;
import util.HistoryCollection;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Класс Invoker отвечает за обработку и выполнение команд.
 */
public class Invoker {
    /**
     * Хранилище команд, доступных для выполнения.
     */
    private static Map<String, Command> commands = new HashMap<>();

    /**
     * Параметр, передаваемый в команду.
     */
    public static String parameter;

    /**
     * Инициализирует доступные команды и запускает цикл чтения команд с консоли.
     */
    public static void start() {
        CollectionManager cm = new CollectionManager();
        commands.put("help", new HelpCommand(cm, commands));
        commands.put("add", new AddCommand(cm));
        commands.put("info", new InfoCommand(cm));
        commands.put("show", new ShowCommand(cm));
        commands.put("clear", new ClearCommand(cm));
        commands.put("update", new UpdateCommand(cm));
        commands.put("history", new HistoryCommand());
        commands.put("remove_by_id", new RemoveCommand(cm));
        commands.put("execute_script", new ExecuteScriptCommand(cm));
        commands.put("exit", new ExitCommand());
        commands.put("save", new SaveCommand(cm));
        commands.put("remove_head", new RemoveHead(cm));
        commands.put("add_if_max", new AddIfMaxCommand(cm));
        commands.put("filter_by_telephone_code", new FilterByTelephoneCodeCommand(cm));
        commands.put("print_field_descending_standard_of_living", new PrintFieldDescendingStandardOfLiving(cm));
        commands.put("print_field_ascending_meters_above_sea_level", new PrintFieldAscendingMetersAboveSeaLevel(cm));

        while (CityReader.consoleHasNext()) {
            String text = CityReader.consoleReadLine();
            CityReader.scriptFlag = false;
            if (!text.isEmpty()) {
                executionCommand(text);
            }
        }
    }

    /**
     * Выполняет команду, переданную в виде строки.
     *
     * @param text Введённая команда.
     */
    public static void executionCommand(String text) {
        String[] tokens;
        tokens = text.split(" ");
        if (tokens.length > 1) {
            parameter = tokens[1];
        }
        try {
            Command command = commands.get(tokens[0].trim());
            command.execute();
            HistoryCollection.historyAdd(tokens[0].trim());
        } catch (NullPointerException e) {
            System.out.println("Неизвестная команда");
        } catch (IOException e) {
            System.out.println("Невозможно выполнить команду");
        }
    }

    /**
     * Возвращает параметр команды.
     *
     * @return параметр команды.
     */
    public static String getParameter() {
        return parameter;
    }
}
