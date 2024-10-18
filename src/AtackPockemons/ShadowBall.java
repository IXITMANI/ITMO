package AtackPockemons;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall(double pow, double acc) {
        super(Type.GHOST, pow, acc);

    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        super.applyOppDamage(def, damage);
        Effect e = new Effect().chance(0.2).turns(6).stat(Stat.SPECIAL_DEFENSE, -1);
        def.addEffect(e);
        System.out.println(def.toString() + " looses 1 special defense");
    }


    @Override
    protected String describe() {
        String[] place = this.getClass().toString().split("\\.");
        return "does " + place[place.length - 1];
    }

}
