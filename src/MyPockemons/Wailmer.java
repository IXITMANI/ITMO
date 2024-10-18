package MyPockemons;

import AtackPockemons.Blizzard;
import AtackPockemons.Bulldoze;
import AtackPockemons.Scald;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Wailmer extends Pokemon {
    public Wailmer(String name, int lvl) {
        super(name, lvl);

        super.setType(Type.WATER);
        super.setStats(130,70,35,70,35,60);

        Bulldoze bulldoze = new Bulldoze(60, 100);
        Blizzard blizzard = new Blizzard(110,70);
        Scald scald = new Scald(80,100);
        super.setMove(blizzard, bulldoze,scald);

    }
}
