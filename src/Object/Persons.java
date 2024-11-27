package Object;

import Enums.Effects;
import Enums.Items;
import Enums.Places;
import Interfaces.*;

public abstract class Persons implements Damageble, Buyble, Moveble, Effectable, Missble, Timeble, Farmble, Brokenble {
    protected final String name;
    protected Places place;
    protected int HP;
    protected int MaxHP;
    protected int gold = 0;
    public Items[] inv = new Items[6];
    private int time = 30;
    protected Effects effect;

    private int i = 0;

    public Persons(String name, Places place) {
        this.name = name;
        this.place = place;
    }

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

    public int getTime() {
        return time;
    }

    protected void setTime(int time) {
        this.time = time;
    }

    public void addItem(Items item) {
        inv[i] = item;
        i++;
        i = i % 6;
    }

    public Items[] getInv() {
        return inv;
    }

    public void cleanInv() {
        inv = new Items[6];
    }
}
