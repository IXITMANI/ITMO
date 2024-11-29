package object;

import enums.Effects;
import enums.Items;
import enums.Places;
import interfaces.*;
import util.Maps;

import java.util.Arrays;
import java.util.Objects;

public abstract class Hero implements Damageable, Buyable, Moveable, Effectable, Missable, Brokenable, CanFarm {
    protected int damage;
    protected final String name;
    protected Places place;
    protected int HP;
    protected final int MaxHP;
    protected int gold = 0;
    public Items[] inv = new Items[6];
    protected Effects effect;

    private int itemIndex = 0;



    public Hero(String name, Places place, int HP, int damage) {
        this.name = name;
        this.place = place;
        this.MaxHP = HP;
        this.HP = this.MaxHP;
        this.damage = damage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return damage == hero.damage && HP == hero.HP && MaxHP == hero.MaxHP && gold == hero.gold && itemIndex == hero.itemIndex && Objects.equals(name, hero.name) && place == hero.place && Objects.deepEquals(inv, hero.inv) && effect == hero.effect;
    }

    @Override
    public int hashCode() {
        return Objects.hash(damage, name, place, HP, MaxHP, gold, Arrays.hashCode(inv), effect, itemIndex);
    }

    @Override
    public String toString(){
        return this.name + " in " + this.getPlace() + " have HP = " + this.getHP() + " have gold = " + this.getGold();
    }


    public abstract int goldCost();

    public Places getPlace() {
        return place;
    }

    public void setPlace(Places place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getGold() {
        return gold;
    }

    public void addItem(Items item) {
        inv[itemIndex] = item;
        itemIndex++;
        itemIndex = itemIndex % 6;
    }

    public Items[] getInv() {
        return inv;
    }

    public void cleanInv() {
        inv = new Items[6];
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
        this.go(Places.TAVERN);
    }

    @Override
    public boolean isDied() {
        return this.HP == 0;
    }


    @Override
    public void revive() {
        this.setHP(this.MaxHP);
        this.go(Places.FOUNTAIN);
    }

    @Override
    public void buy(Items item) {
        if (this.gold >= item.getCost()) {
            this.addItem(item);
            gold -= item.getCost();
        }
    }

    @Override
    public void buyFor(Items item, Hero person) {
        if (this.gold >= item.getCost()) {
            person.addItem(item);
            gold -= item.getCost();
        }
    }

    @Override
    public void buyBack() {
        if ((this.gold > (int) (25 * 25 * 1.5) + Maps.getTime() * 155) && (this.getHP() == 0)) {
            System.out.println(this.name + " жмет байбек");
            this.gold -= (int) ((25 * 25 * 1.5) + Maps.getTime() * 15);
            this.revive();
        }
    }

    @Override
    public void addEffect(Effects effect) {
        this.effect = effect;
    }

    @Override
    public void miss(Hero person) {
        System.out.println("SS " + person.getName());
        this.go(person.getPlace());
    }


    public void brokenItem(Items item) {
        for (var i = 0; i < 6; i++) {
            if (this.getInv()[i] == item) {
                this.inv[i] = Items.Nothing;
            }
        }
    }

    public void brokenItems() {
        this.cleanInv();
    }

    @Override
    public void farm(Farmable creep){
        creep.fightCreep(this);
    }

}
