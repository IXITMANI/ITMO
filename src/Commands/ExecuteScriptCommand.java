package Commands;

import util.CityReader;

public class ExecuteScriptCommand implements Command {
    CollectionManager cm;

    public ExecuteScriptCommand(CollectionManager cm) {
        this.cm = cm;
    }

    @Override
    public void execute() {
        CityReader.readFile();
        String[] fileText = CityReader.readLines();
        for (var index = 0; index < fileText.length; index++) {
            if (!fileText[index].contains("execute_script "+ CityReader.getFileName())){
                Invoker.executionCommand(fileText[index].replace("\r", "   ").trim());
            }
        }
    }

    @Override
    public String descr() {
        return "execute_script (file_name) - считывает скрипт file_name и выполняет все команды оттуда";
    }
}
