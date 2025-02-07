package Commands;

import java.util.Map;

public class HelpCommand implements Command {
    CollectionManager cm;
    Map<String, Command> commands;

    public  HelpCommand(CollectionManager cm, Map<String, Command> commands){
        this.cm = cm;
        this.commands = commands;
    }
    @Override
    public String descr() {
        return "help - Помощь";
    }

    @Override
    public void execute() {
        for (Command c : commands.values()) {
            System.out.println(c.descr());
        }
    }
}
