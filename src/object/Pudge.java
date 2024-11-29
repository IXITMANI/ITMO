package object;

import enums.Items;
import enums.Places;


public class Pudge extends Hero {

    public Pudge(String name, Places place, int HP, int damage) {
        super(name, place, HP, damage);
        super.addItem(Items.MASK_OF_MADNESS);
        super.addItem(Items.ARMLET_OF_MORDIGGIAN);
        super.addItem(Items.AGHANIM_SCEPTER);
        super.addItem(Items.BATTLE_FURY);
    }

    public void meatHook(Hero person) {
        person.setPlace(this.getPlace());
        person.damage(650);
        if (person.isDied()) {
            this.gold += person.goldCost();
        }
    }

    public void dismember(Hero person) {
        person.damage(600);
        this.heal((int) (0.25 * super.MaxHP));
        if (person.isDied()) {
            this.gold += person.goldCost();
        }
    }
    public int goldCost() {
        return (500 + (int) (Math.random() * this.getHP()));
    }
}
