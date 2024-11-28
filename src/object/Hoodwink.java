package object;

import enums.Items;
import enums.Places;

public class Hoodwink extends Hero {
    public Hoodwink(String name, Places place, int HP, int damage) {
        super(name, place, HP, damage);
        super.addItem(Items.ARMLET_OF_MORDIGGIAN);
        super.addItem(Items.ARMLET_OF_MORDIGGIAN);
        super.addItem(Items.ARMLET_OF_MORDIGGIAN);
        super.addItem(Items.ARMLET_OF_MORDIGGIAN);
        super.addItem(Items.ARMLET_OF_MORDIGGIAN);
        super.addItem(Items.ARMLET_OF_MORDIGGIAN);
    }
}



