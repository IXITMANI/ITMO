package Commands;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class PrintFieldAscendingMetersAboveSeaLevel implements Command{
    CollectionManager cm;
    ArrayList<Double> seaLevel;
    public PrintFieldAscendingMetersAboveSeaLevel(CollectionManager cm){
        this.cm = cm;
    }

    @Override
    public void execute() throws IOException {
        for (var i = 0;i < cm.size(); i++){
        seaLevel.add(cm.getAll().get(i).getMetersAboveSeaLevel());
        }
        Collections.sort(seaLevel);
        for (var i = 0; i < seaLevel.size(); i++){
            System.out.print(seaLevel.get(i) + " ");
        }
        System.out.println();
    }

    @Override
    public String descr() {
        return "print_field_ascending_meters_above_sea_level - выводит значения поля metersAboveSeaLevel всех элементов в порядке возрастания";
    }
}
