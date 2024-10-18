package MyPockemons;

import AtackPockemons.Growth;
import AtackPockemons.RazorLeaf;
import AtackPockemons.Rest;
import AtackPockemons.SludgeBomb;
import ru.ifmo.se.pokemon.Type;

public class Victreebel extends Weepinbell {
    public Victreebel(String name, int lvl) {
        super(name, lvl);

        super.setType(Type.GRASS, Type.POISON);
        super.setStats(80,105,65,100,70,70);

        RazorLeaf razorLeaf = new RazorLeaf(55, 95);
        SludgeBomb sludgeBomb = new SludgeBomb(90, 100);
        Growth growth = new Growth();
        Rest rest = new Rest();
        super.setMove(razorLeaf,sludgeBomb,growth,rest);

    }

}
