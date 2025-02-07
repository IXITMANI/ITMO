package Commands;

import Start.City;

public class UpdateCommand implements Command {
    CollectionManager cm;

    public UpdateCommand(CollectionManager cm) {
        this.cm = cm;
    }

    @Override
    public void execute() {
        int id = Integer.parseInt(Invoker.getParameter());
        int index = cm.searchId(id);
        if (index == -1) {
            System.out.println("элемент с таким id не найден");
        } else {
            City city = ObjCreator.create(id);
            if (city != null) {
                cm.update(index, city);
            }
        }
    }

    @Override
    public String descr() {
        return "update - Обновляет информацию о существуем ом объекте";
    }
}
