package AtackPockemons;

import ru.ifmo.se.pokemon.*;

public class NobleRoar extends StatusMove {
    public NobleRoar(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, -1).stat(Stat.ATTACK, -1).turns(6);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        String[] place = this.getClass().toString().split("\\.");
        return "does " + place[place.length - 1];
    }
}
