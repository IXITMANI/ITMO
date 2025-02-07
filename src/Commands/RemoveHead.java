package Commands;

import java.io.IOException;

public class RemoveHead  implements Command{
    CollectionManager cm;
    public RemoveHead(CollectionManager cm){
        this.cm = cm;
    }
    @Override
    public void execute() throws IOException {
        cm.show(0);
        cm.remove(0);
    }

    @Override
    public String descr() {
        return "remove_head - Удаляет первый элемент коллекции и выводит его на экран";
    }
}
