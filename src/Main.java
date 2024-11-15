import Enums.Action;
import Object.*;

public class Main {
    public static void main(String[] args) {
        Entity e1 = new Entity("Слуга");
        Entity e2 = new Entity("Принц");
        Entity e3 = new Entity("Незнакомка");
        e3.propertyes("Богатая");
        e1.doSomething(Action.say, e2);
        e2.doSomething(Action.say, e1);
    }
}