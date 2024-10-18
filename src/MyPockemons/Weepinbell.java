package MyPockemons;

import AtackPockemons.Growth;
import AtackPockemons.RazorLeaf;
import AtackPockemons.SludgeBomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Weepinbell extends Bellsprout {
    public Weepinbell(String name, int lvl) {
        super(name, lvl);

        super.setType(Type.GRASS, Type.POISON);
        super.setStats(65, 90, 50, 85, 45, 55);

        RazorLeaf razorLeaf = new RazorLeaf(55, 95);
        SludgeBomb sludgeBomb = new SludgeBomb(90, 100);
        Growth growth = new Growth(0, 0);
        super.setMove(razorLeaf, sludgeBomb, growth);


    }
}
