package Commands;

public class ShowCommand implements Command {
    CollectionManager cm;

    public ShowCommand(CollectionManager cm) {
        this.cm = cm;
    }

    public void execute() {
        if (cm.size() == 0) {
            System.out.println("Список пуст");
        } else {
            System.out.println("---------------------------");
            for (int i = 0; i < cm.size(); ++i) {
                cm.show(i);
                System.out.println("---------------------------");
            }
        }
    }

    public String descr() {
        return "show - команда, показывающая список объектов в коллекции";
    }
}
