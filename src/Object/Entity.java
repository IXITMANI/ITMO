package Object;

import Enums.Action;
import Interfaces.Property;

import java.io.Serializable;

public class Entity extends Obj implements Property {

    @Override
    public String toString() {
        return name;
    }

    final private String name;
    final private String gender;

    public Entity(String name, String gender) {
        super(name);
        this.name = name;
        this.gender = gender;
    }

    public void doSomething(Action act) {
        switch (act) {
            case Action.say:
                System.out.println(super.name + " сказал");
                break;
            case Action.went:
                System.out.println(super.name + " пришел");
                break;
            default:
                System.out.println("Ты даун?");
                break;
        }
    }

    public void doSomething(Action act, Obj obj) {
        doSomething(act);
        System.out.println(obj);
    }

    @Override
    public void propertyes(String property) {
        super.name = " " + property + " " + this.name;
    }

}
