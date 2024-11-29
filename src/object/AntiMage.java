package object;

import enums.Items;
import enums.Places;

public class AntiMage extends Hero {

    public AntiMage(String name, Places place, int HP, int damage) {
        super(name, place, HP, damage);
        super.addItem(Items.POWER_TREADS);
        this.gold = 5000;
    }

    public int goldCost() {
        return (500 + (int) (Math.random() * this.getHP()));
    }

}


