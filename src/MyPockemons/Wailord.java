package MyPockemons;

import AtackPockemons.NobleRoar;
import ru.ifmo.se.pokemon.Type;

public class Wailord extends Wailmer {
    public Wailord(String name, int lvl) {
        super(name, lvl);

        super.setType(Type.WATER);
        super.setStats(170, 90, 45, 90, 45, 60);

        NobleRoar nobleRoar = new NobleRoar(0, 100);
        super.addMove(nobleRoar);
    }
}
