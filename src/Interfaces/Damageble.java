package Interfaces;

public interface Damageble {
    public void damage(int damage);
    public void heal(int heal);
    public void die();
    public boolean isDie();
    public void revive();
}
