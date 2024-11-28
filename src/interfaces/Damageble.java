package interfaces;

public interface Damageble {
    void damage(int damage);

    void heal(int heal);

    void die();

    boolean isDied();

    void revive();
}
