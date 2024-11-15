import Enums.Action;
import Enums.Places;
import Object.*;

public class Main {
    public static void main(String[] args) {
        Entity servant = new Entity("Слуга",Places.castle);
        Entity Prince = new Entity("Принц",Places.castle);
        Entity Stranger = new Entity("Незнакомка", Places.street);
        Stranger.propertyes("Богатая");
        servant.doSomething(Action.say, Prince);
        Stranger.goSomewhere(Places.nearCastle);
        Stranger.getPlace();
        Prince.goSomewhere(Places.street);
        Prince.getPlace();
        Prince.goSomewhere(Places.castle, Stranger);

    }
}