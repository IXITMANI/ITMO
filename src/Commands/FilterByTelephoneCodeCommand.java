package Commands;

import java.io.IOException;

public class FilterByTelephoneCodeCommand implements Command {
    CollectionManager cm;

    public FilterByTelephoneCodeCommand(CollectionManager cm) {
        this.cm = cm;
    }

    @Override
    public void execute() throws IOException {
        Integer parameter = null;
        String tparameter = Invoker.getParameter();
        if (!(tparameter == null || tparameter == "")) {
            parameter = Integer.parseInt(tparameter);
        }

        for (var i = 0; i < cm.size(); i++) {
            if (cm.getAll().get(i).getTelephoneCode() == parameter) {
                cm.show(i);
            }
        }
    }


    @Override
    public String descr() {
        return "filter_by_telephone_code (telephoneCode) - выводит элементы, значение поля telephoneCode которых равно telephoneCode";
    }
}
