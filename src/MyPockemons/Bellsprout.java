package MyPockemons;

import AtackPockemons.RazorLeaf;
import AtackPockemons.SludgeBomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bellsprout extends Pokemon {
    public Bellsprout(String name, int lvl) {
        super(name,lvl);

        super.setType(Type.GRASS,Type.POISON);
        super.setStats(50,75,35,70,30,40);

        RazorLeaf razorLeaf = new RazorLeaf(55,95);
        SludgeBomb sludgeBomb = new SludgeBomb(90,100);
        super.setMove(razorLeaf, sludgeBomb);



    }
}
