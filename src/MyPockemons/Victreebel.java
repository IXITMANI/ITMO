package MyPockemons;


import AtackPockemons.Rest;
import ru.ifmo.se.pokemon.Type;

public class Victreebel extends Weepinbell {
    public Victreebel(String name, int lvl) {
        super(name, lvl);

        super.setType(Type.GRASS, Type.POISON);
        super.setStats(80, 105, 65, 100, 70, 70);

        Rest rest = new Rest();
        super.addMove(rest);

    }

}
