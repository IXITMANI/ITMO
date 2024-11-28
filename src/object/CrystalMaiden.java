package object;

import enums.Effects;
import enums.Items;
import enums.Places;


public class CrystalMaiden extends Hero {


    public CrystalMaiden(String name, Places place, int HP, int damage) {
        super(name, place, HP, damage);
        super.gold = 2000;
        super.addItem(Items.AGHANIM_SCEPTER);
        super.addItem(Items.GLIMMER_CAPE);
        super.addItem(Items.BLACK_KING_BAR);
        super.addItem(Items.KAYA_AND_SANGE);
    }

    public void FreezingField(Hero[] hero) {
        for (var i = 0; i < 5; i++) {
            if (hero[i].getPlace() == this.getPlace()) {
                this.Frostbite(hero[i]);
                hero[i].damage(2500);
                if (hero[i].isDied()) {
                    this.gold += 2578;
                }
            }
        }
    }

    public void Frostbite(Hero person) {
        person.damage(300);
        person.addEffect(Effects.ROOTED);
        if (person.isDied()) {
            this.gold += 2578;
        }

    }
}
