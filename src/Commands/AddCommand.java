package Commands;

import Start.*;
import util.IdGenerator;
public class AddCommand implements Command {
    CollectionManager cm;

    public AddCommand(CollectionManager cm) {
        this.cm = cm;
    }

    @Override
    public void execute() {
        long id = IdGenerator.generateId();
        City city = ObjCreator.create(id);
        if (city != null){
            cm.add(city);
            System.out.println("Объект успешно добавлен!");
        }
    }

    @Override
    public String descr() {
        return "add - Добавление нового элемента";
    }
}
