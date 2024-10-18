package MyPockemons;

import AtackPockemons.Growth;
import ru.ifmo.se.pokemon.Type;

public class Weepinbell extends Bellsprout {
    public Weepinbell(String name, int lvl) {
        super(name, lvl);

        super.setType(Type.GRASS, Type.POISON);
        super.setStats(65, 90, 50, 85, 45, 55);

        Growth growth = new Growth();
        super.addMove(growth);


    }
}
