package Commands;

import util.CityReader;
import util.HistoryCollection;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Invoker {
    private static Map<String, Command> commands = new HashMap<>();
    public static String parameter;

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
        while (CityReader.consoleHasNext()) {
            String text = CityReader.consoleReadLine();
            CityReader.scriptFlag = false;
            if (text != "") {
                executionCommand(text);
            }
        }
    }

    public static void executionCommand(String text) {
        String[] tokens = text.split(" ");
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

    public static String getParameter() {
        return parameter;
    }
}