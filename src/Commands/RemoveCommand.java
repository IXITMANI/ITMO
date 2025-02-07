package Commands;

public class RemoveCommand implements Command{
    CollectionManager cm;
    public RemoveCommand(CollectionManager cm){
        this.cm = cm;
    }
    @Override
    public void execute() {
        int id = Integer.parseInt(Invoker.getParameter());
        int index = cm.searchId(id);
        if (id != -1){
            cm.remove(index);
        }
    }

    @Override
    public String descr() {
        return "remove_by_id (id) - удаление элемента по его id";
    }
}
