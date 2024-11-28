package object;

import interfaces.Damageble;
import interfaces.Farmable;

public class Creep implements Farmable, Damageble {
    public int HP;
    private final int MaxHP;
    protected int damage;

    public int gold = (int) (Math.random() * 250);

    public Creep(int HP, int damage) {
        this.HP = HP;
        this.MaxHP = HP;
        this.damage = damage;
    }


    @Override
    public void killCreep(Hero hero) {
        if (!this.isDied()) {
            while ((!hero.isDied()) && (!this.isDied())) {
                this.damage(hero.damage);
                hero.damage(this.damage);
            }
            if (this.isDied()){
                hero.gold += this.gold;
            } else {
                System.out.println(hero.name + " was died by Creep");
            }
        }
    }

    @Override
    public void damage(int damage) {
        this.HP -= damage;
        if (this.HP <= 0) {
            this.die();
        }
    }

    @Override
    public void die() {
        this.HP = 0;
    }

    @Override
    public boolean isDied() {
        return (this.HP == 0);
    }

    @Override
    public void revive() {
        this.HP = this.MaxHP;
        this.gold = (int) (Math.random() * 250);
    }

    @Override
    public void heal(int heal) {
        this.HP += heal;
    }
}
