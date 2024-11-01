package AtackPockemons;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
    public Bulldoze(double pow, double acc) {
        super(Type.GROUND, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        Effect e = new Effect().stat(Stat.SPEED, -1);
        p.addEffect(e);
    }


    @Override
    protected String describe() {
        String[] place = this.getClass().toString().split("\\.");
        return "does " + place[place.length - 1];
    }

}

