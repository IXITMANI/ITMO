package Commands;

public class ClearCommand implements Command {
    CollectionManager cm;
    public ClearCommand(CollectionManager cm){
        this.cm = cm;
    }

    @Override
    public void execute() {
        cm.clear();
    }

    @Override
    public String descr() {
        return "clear - Отчищает коллекцию";
    }
}
