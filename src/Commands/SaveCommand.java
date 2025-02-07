package Commands;

import util.CityWriter;

import java.io.IOException;

public class SaveCommand implements Command {
    CollectionManager cm;

    public SaveCommand(CollectionManager cm) {
        this.cm = cm;
    }

    @Override
    public void execute() throws IOException {
        String[] tempShowList = new String[cm.size()];
        if (cm.size() != 0) {
            for (var i = 0; i < cm.size(); i++) {
                tempShowList[i] = cm.show(i);
            }
            try {
                CityWriter.writeFile("finish.txt", tempShowList);
            } catch (IOException e) {
                System.out.println("Невозможно записать в файл");
            }
        }else {
            System.out.println("Коллекция пуста");
        }
    }
    @Override
    public String descr() {
        return "save - Сохранение в файл";
    }
}
