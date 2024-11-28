package interfaces;

import enums.Items;
import object.Hero;

public interface Buyble {
    void buy(Items item);

    void buyFor(Items item, Hero person);

    void buyBack();
}
