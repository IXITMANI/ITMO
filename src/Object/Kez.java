package Object;

import Enums.Effects;
import Enums.Items;
import Enums.Places;

public class Kez extends Persons {
    public Kez(String name, Places place, int HP) {
        super(name, place);
        super.HP = HP;
    }

    @Override
    public void go(Places place) {
        this.setPlace(place);
    }


    @Override
    public void damage(int damage) {
        this.HP -= damage;
        if (this.HP <= 0) {
            this.die();
        }
    }

    public void heal(int heal) {
        this.HP += heal;
        if (this.HP > this.MaxHP) {
            this.HP = this.MaxHP;
        }
    }

    @Override
    public void die() {
        System.out.println(this.name + " was die");
        this.setHP(0);
        this.go(Places.Tavern);
    }

    @Override
    public boolean isDie() {
        return this.HP == 0;
    }


    @Override
    public void revive() {
        this.setHP(this.MaxHP);
        this.go(Places.Fountain);
    }

    @Override
    public void buy(Items item) {
        if (this.gold >= item.getCost()) {
            this.addItem(item);
            gold -= item.getCost();
        }
    }

    @Override
    public void buyFor(Items item, Persons person) {
        if (this.gold >= item.getCost()) {
            person.addItem(item);
            gold -= item.getCost();
        }
    }

    @Override
    public void buyBack() {
        if ((this.gold > (int) (25 * 25 * 1.5) + super.getTime() * 155) && (this.getHP() == 0)) {
            System.out.println(this.name + " жмет байбек");
            this.gold -= (int) ((25 * 25 * 1.5) + super.getTime() * 15);
            this.revive();
        }
    }

    @Override
    public void addEffect(Effects effect) {
        super.effect = effect;
    }

    @Override
    public void miss(Persons person) {
        System.out.println("SS " + person.getName());
    }

    @Override
    public void skipTime(int time) {
        super.setTime(super.getTime() + time);
    }

    @Override
    public void killCreep() {
        this.gold += 120;
    }

    public void brokenItem(Items item) {
        for (var i = 0; i < 6; i++) {
            if (this.getInv()[i] == item) {
                this.inv[i] =  Items.Nothing;
            }
        }
    }

    public void brokenItems() {
        this.cleanInv();
    }

}


