import Enums.Action;
import Object.*;

public class Main {
    public static void main(String[] args) {
        Entity e1 = new Entity("Слуга","female");
        Entity e2 = new Entity("Принц", "male");
        e1.doSomething(Action.say, e2);
    }
}