package interfaces;

import enums.Items;
import exceptions.IsNotDeadException;
import object.Hero;

public interface Buyable {
    void buy(Items item);

    void buyFor(Items item, Hero person);

    void buyBack() throws IsNotDeadException;
}
