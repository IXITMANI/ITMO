package MyPockemons;

import AtackPockemons.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Passimian extends Pokemon {
    public Passimian(String name, int lvl) {
        super(name, lvl);

        super.setType(Type.FIGHTING);
        super.setStats(100, 120, 90, 40, 60, 80);

        Bulldoze bulldoze = new Bulldoze(60, 100);
        ShadowBall shadowBall = new ShadowBall(80, 100);
        FocusBlast focusBlast = new FocusBlast(120, 70);
        AerialAce aerialAce = new AerialAce(60, 100);

        super.setMove(bulldoze, shadowBall, focusBlast, aerialAce);
    }
}
