package Program;

import MyPockemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Lab2 {
    public static void main(String[] args) {

        Battle b = new Battle();
        Passimian p1 = new Passimian("coconat", 1);
        Wailmer p2 = new Wailmer("poka", 1);
        Wailord p3 = new Wailord("tomato", 1);
        Bellsprout p4 = new Bellsprout("apple", 1);
        Weepinbell p5 = new Weepinbell("potato", 1);
        Victreebel p6 = new Victreebel("pumkin", 1);

        b.addAlly(p4);
        b.addAlly(p5);
        b.addAlly(p6);
        b.addFoe(p1);
        b.addFoe(p2);
        b.addFoe(p3);
        b.go();
    }

    public static boolean change(double d) {
        return d > Math.random();
    }
}