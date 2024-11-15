package Object;

import Enums.Action;
import Enums.Places;
import Interfaces.Property;

import java.util.Objects;

public class Entity extends Obj implements Property {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return Objects.equals(name.toLowerCase(), entity.name.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return name;
    }

    final private String name;
    private Places place;

    public Entity(String name, Places place) {
        super(name, place);
        this.name = name;
        this.place = place;
    }

    public void doSomething(Action act) {
        switch (act) {
            case Action.say:
                System.out.print(super.name + " сказал ");
                break;
            case Action.went:
                System.out.print(super.name + " пришел к");
                break;
            default:
                System.out.println("Ты даун?");
                break;
        }
    }

    public void doSomething(Action act, Obj obj) {
        doSomething(act);
        System.out.println(obj.name + "у");
    }

    public void goSomewhere(Places place) {
        switch (place) {
            case Places.castle:
                this.setPlace(Places.castle);
                break;
            case Places.street:
                this.setPlace(Places.street);
                break;
        }
    }

    public void goSomewhere(Places place, Entity entity) {
        this.goSomewhere(place);
        entity.goSomewhere(place);
        System.out.println(this.name + " пошел в " + place + " c " + entity.name);
    }

    private void setPlace(Places place) {
        this.place = place;
    }

    public Places getPlace() {
        System.out.println(this.name + " пошел в " + this.place);
        return this.place;
    }

    @Override
    public void propertyes(String property) {
        super.name = property + " " + this.name;
    }

}
