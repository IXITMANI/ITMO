package Commands;

import Start.StandardOfLiving;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class PrintFieldDescendingStandardOfLiving implements Command{
    CollectionManager cm;
    public PrintFieldDescendingStandardOfLiving(CollectionManager cm){
        this.cm = cm;
    }

    @Override
    public void execute() throws IOException {
        ArrayList<Integer> standardOfLiving = new ArrayList<>();
        for (var i = 0;i < cm.size(); i++){
            standardOfLiving.add(cm.getAll().get(i).getStandardOfLivingLevel());
        }
        Collections.sort(standardOfLiving);
        for (var i = 0; i < standardOfLiving.size(); i++){
            System.out.print(StandardOfLiving.values()[i] + " ");
        }
        System.out.println();
    }

    @Override
    public String descr() {
        return "print_field_descending_standard_of_living - выводит значения поля standardOfLiving всех элементов в порядке убывания";
    }
}
