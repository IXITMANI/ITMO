package AtackPockemons;

import Program.utilik;
import ru.ifmo.se.pokemon.*;

public class Scald extends SpecialMove {
    public Scald(double pow, double acc) {
        super(Type.WATER, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        if (utilik.change(0.3)) {
            Effect.burn(p);
        }
    }

    @Override
    protected String describe() {
        String[] place = this.getClass().toString().split("\\.");
        return "does " + place[place.length - 1];
    }
}
