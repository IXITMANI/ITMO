package Commands;

public class InfoCommand implements Command {
    CollectionManager cm;

    public InfoCommand(CollectionManager cm){
        this.cm = cm;
    }
    @Override
    public void execute() {
        System.out.println("Размер коллекции: " + cm.size() + "\n"
                + "Дата инициализации: " + cm.initializationTime().toString());
    }

    public String descr() {
        return "info - команда, выводящая информацию о коллекции";
    }
}
