package Object;

import Enums.Effects;
import Enums.Items;
import Enums.Places;


public class CrystalMaiden extends Persons {


    public CrystalMaiden(String name, Places place, int HP) {
        super(name, place);
        super.setHP(HP);
        super.MaxHP = HP;
        super.gold = 2000;
        super.addItem(Items.AghanimScepter);
        super.addItem(Items.GlimmerCape);
        super.addItem(Items.BlackKingBar);
        super.addItem(Items.KayaAndSange);
    }

    public void FreezingField(Persons[] persons) {
        for (var i = 0; i < 5; i++) {
            if (persons[i].getPlace() == this.getPlace()) {
                this.Frostbite(persons[i]);
                persons[i].damage(2500);
                if (persons[i].isDie()) {
                    this.gold += 2578;
                }
            }
        }
    }

    public void Frostbite(Persons person) {
        person.damage(300);
        person.addEffect(Effects.Rooted);
        if (person.isDie()) {
            this.gold += 2578;
        }

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

    public void die() {
        System.out.println(this.name + " was die");
        this.setHP(0);
        this.go(Places.Tavern);
    }

    @Override
    public boolean isDie() {
        return this.HP == 0;
    }

    public void revive() {
        this.setHP(this.MaxHP);
        this.go(Places.Fountain);
    }

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
        if ((this.gold > (int) (25 * 25 * 1.5) + super.getTime() * 15) && (this.getHP() == 0)) {
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
