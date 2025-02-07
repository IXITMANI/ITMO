package Commands;

import util.CityReader;
import java.util.HashSet;
import java.util.Set;

public class ExecuteScriptCommand implements Command {
    CollectionManager cm;
    static Set<String> fileName = new HashSet<>();
    public ExecuteScriptCommand(CollectionManager cm) {
        this.cm = cm;
    }

    @Override
    public void execute() {
        CityReader.readFile();
        if (fileName.contains(CityReader.getFileName())){
            System.out.println("Отменено выполнение скрипта " + CityReader.getFileName());
        } else {
        fileName.add(CityReader.getFileName());
        String[] fileText = CityReader.readLines();
        while (CityReader.fileHasNext()) {
            String line = CityReader.readLine();
                Invoker.executionCommand(line);
        }
        fileName.remove(CityReader.getFileName());}
    }

    @Override
    public String descr() {
        return "execute_script (file_name) - считывает скрипт file_name и выполняет все команды оттуда";
    }
}
