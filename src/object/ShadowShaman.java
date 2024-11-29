package object;

import enums.Places;

public class ShadowShaman extends Hero {
    public ShadowShaman(String name, Places place, int HP, int damage) {
        super(name, place, HP, damage);
    }

    public int goldCost() {
        return (500 + (int) (Math.random() * this.getHP()));
    }
}


