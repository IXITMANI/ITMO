package interfaces;

public interface Damageable {
    void damage(int damage);

    void heal(int heal);

    void die();

    boolean isDied();

    void revive();
}
