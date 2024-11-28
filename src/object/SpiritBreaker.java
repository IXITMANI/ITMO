package object;

import enums.Places;

public class SpiritBreaker extends Hero {
    public SpiritBreaker(String name, Places place, int HP, int damage) {
        super(name, place, HP, damage);
    }

    public void UseCheese(Hero person) {
        System.out.println(this.name + " use cheese on " + person.name);
        person.heal(2500);
    }
}
