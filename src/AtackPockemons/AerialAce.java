package AtackPockemons;

import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove {
    public AerialAce(double pow, double acc) {
        super(Type.FIGHTING,pow,acc);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def,damage);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect e = new Effect().stat(Stat.DEFENSE,- (int) p.getStat(Stat.DEFENSE)).turns(-1);
        p.addEffect(e);
    }
}
