package AtackPockemons;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super.type = Type.PSYCHIC;

    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);
        Effect e = new Effect().condition(Status.SLEEP).turns(2);
        p.addEffect(e);
        if (e.turn()) {
            e.stat(Stat.HP, (int) p.getStat(Stat.HP));
            System.out.println(p.getStat(Stat.HP));
            p.addEffect(e);
        }

    }

    @Override
    protected String describe() {
        String[] place = this.getClass().toString().split("\\.");
        return "does " + place[place.length - 1];
    }
}
