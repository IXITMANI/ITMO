package Commands;

import util.CityReader;
import util.HistoryCollection;

public class HistoryCommand implements Command{
    @Override
    public void execute() {
        String[] history = HistoryCollection.getHistoryList();
        for (var i = 0;i < history.length; i++){
            if (history[i] != null){
                System.out.println("Последние введенные команды:");
                System.out.print(history[i] + " ");
                System.out.println();
            }
        }
    }

    @Override
    public String descr() {
        return "history - показывает последние 15 команд";
    }
}
