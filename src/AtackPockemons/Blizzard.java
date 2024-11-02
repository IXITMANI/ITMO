package AtackPockemons;

import ru.ifmo.se.pokemon.*;
import Program.Utilik;

public class Blizzard extends SpecialMove {
    public Blizzard(double pow, double acc) {
        super(Type.ICE, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        if (Utilik.change(0.1)) {
            Effect.freeze(p);
        }
    }


    @Override
    protected String describe() {
        String[] place = this.getClass().toString().split("\\.");
        return "does " + place[place.length - 1];
    }
}

