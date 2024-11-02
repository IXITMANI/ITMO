package AtackPockemons;

import Program.Utilik;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class SludgeBomb extends SpecialMove {
    public SludgeBomb(double pow, double acc) {
        super(Type.POISON, pow, acc);
    }

    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        if (Utilik.change(0.3)) {
            Effect.poison(p);
        }
    }

    @Override
    protected String describe() {
        String[] place = this.getClass().toString().split("\\.");
        return "does " + place[place.length - 1];
    }
}
