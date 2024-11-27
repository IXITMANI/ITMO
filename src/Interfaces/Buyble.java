package Interfaces;

import Enums.Items;
import Object.Persons;
public interface Buyble {
    public void buy(Items item);
    public void buyFor(Items item, Persons person);
    public void buyBack();
}
