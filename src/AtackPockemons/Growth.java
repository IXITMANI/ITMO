package AtackPockemons;

import ru.ifmo.se.pokemon.*;

public class Growth extends StatusMove {
    public Growth(double pow, double acc) {
        super(Type.NORMAL, pow, acc);

    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, 1).stat(Stat.ATTACK, 1);
        p.addEffect(e);
    }


    @Override
    protected String describe() {
        String[] place = this.getClass().toString().split("\\.");
        return "does " + place[place.length - 1];
    }
}
