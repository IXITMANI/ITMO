package Commands;

import Start.City;
import util.IdGenerator;

import java.io.IOException;

public class AddIfMaxCommand implements Command{
    CollectionManager cm;
    public AddIfMaxCommand(CollectionManager cm){
        this.cm = cm;
    }
    @Override
    public void execute() throws IOException {
        City city = ObjCreator.create(IdGenerator.generateId());
        boolean flag = true;
        for (var i = 0; i < cm.size(); i++){
            if (city.getGovernorHeight() < cm.getAll().get(i).getGovernorHeight()){
                flag = false;
            }
        }
        if (flag){
            cm.add(city);
        }
    }

    @Override
    public String descr() {
        return "add_if_max - добавляет новый элемент в коллекцию, если его значение превышает значение наибольшего элемента этой коллекции";
    }
}
