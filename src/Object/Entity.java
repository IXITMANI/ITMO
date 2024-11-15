package Object;

import Enums.Action;
import Interfaces.Property;

public class Entity extends Obj implements Property {

    @Override
    public String toString() {
        return name;
    }

    final private String name;

    public Entity(String name) {
        super(name);
        this.name = name;
    }

    public void doSomething(Action act) {
        switch (act) {
            case Action.say:
                System.out.print(super.name + " сказал ");
                break;
            case Action.went:
                System.out.print(super.name + " пришел ");
                break;
            default:
                System.out.println("Ты даун?");
                break;
        }
    }

    public void doSomething(Action act, Obj obj) {
        doSomething(act);
        System.out.println(obj.name);
    }

    @Override
    public void propertyes(String property) {
        super.name = property + " " + this.name;
    }

}
