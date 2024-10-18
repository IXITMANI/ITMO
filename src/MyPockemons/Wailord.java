package MyPockemons;

import AtackPockemons.Blizzard;
import AtackPockemons.Bulldoze;
import AtackPockemons.NobleRoar;
import AtackPockemons.Scald;
import ru.ifmo.se.pokemon.Type;

public class Wailord extends Wailmer {
    public Wailord(String name, int lvl) {
        super(name, lvl);

        super.setType(Type.WATER);
        super.setStats(170,90,45,90,45,60);

        Bulldoze bulldoze = new Bulldoze(60, 100);
        Blizzard blizzard = new Blizzard(110, 70);
        Scald scald = new Scald(80, 100);
        NobleRoar nobleRoar = new NobleRoar(0,100);
        super.setMove(blizzard, bulldoze, scald);


    }
}
