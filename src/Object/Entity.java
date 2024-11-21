package Object;

import Enums.Action;
import Enums.Mood;
import Enums.Places;
import Enums.Properties;
import Interfaces.Attitude;
import Interfaces.Property;

import java.util.Objects;

public class Entity extends Obj implements Property, Attitude {
    public Mood mood = Mood.happy;

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
        return this.name;
    }

    public Entity(String name) {
        super(name);
    }

    public Entity(String name, Places place) {
        super(name, place);
    }

    public void doSomething(Action act) {
        if (act == Action.forgot) {
            this.information = "";
        }
    }

    public void doSomething(Action act, Entity entity) {
        System.out.print(this.property.getProperty());
        if (this.property.notNone()) {
            System.out.print(" ");
        }
        switch (act) {
            case Action.say:
                System.out.print(super.name + " say \"" + this.information.split("\\.")[this.information.split("\\.").length - 1] + "\" to ");
                entity.information = (this.information.split("\\.")[this.information.split("\\.").length - 1]);
                break;
            case Action.see:
                this.information = this.information + entity.property.getProperty() + " " + entity.name + " in " + entity.place + ".";
                System.out.print(super.name + " see ");
                break;
            case Action.went:
                this.goSomewhere(entity.place);
                System.out.print(super.name + " went to ");
                break;
            case Action.dance:
                this.attitude(Mood.best);
                entity.attitude(Mood.best);
                break;
            case know:
                System.out.print(this.name);
                if (this.information.contains(entity.toString())) {
                    System.out.print(" know ");
                    this.mood = Mood.evil;
                } else {
                    System.out.print(" don`t know ");
                    this.mood = Mood.good;
                }
                break;
            default:
                System.out.println("Action error");
                break;
        }
        System.out.println(entity.property.getProperty() + " " + entity.name);
    }

    public void doSomething(Action act, Thing thing) {
        System.out.print(this.property.getProperty());
        if (this.property.notNone()) {
            System.out.print(" ");
        }
        switch (act) {
            case serving:
                if (this.place == thing.place) {
                    this.place = Places.hall;
                    thing.Move(Places.table);
                }
                break;
            case Action.see:
                this.information = this.information + thing.name + " on " + thing.place + ".";
            case eat:
                thing.count--;
                System.out.println(this.name + " eat one " + thing.name);
                break;
            default:
                System.out.println("Thing Action error");
                break;

        }
    }


    public void doSomething(Action act, Places place) {
        System.out.print(this.property.getProperty());
        if (this.property.notNone()) {
            System.out.print(" ");
        }
        switch (act) {
            case Action.went:
                this.goSomewhere(place);
                System.out.print(super.name + " went to ");
                break;
            case Action.fly:
                System.out.print(super.name + " fly ");
                break;
            default:
                System.out.println("Switch place error");
                break;
        }
        System.out.println(place);
    }

    public void doSomething(Action act, Entity entity, Places place) {
        System.out.print(this.property.getProperty());
        if (this.property.notNone()) {
            System.out.print(" ");
        }
        if (act == Action.went) {
            this.goSomewhere(place);
            entity.goSomewhere(place);
            System.out.print(this.name + " with " + entity.name + " went to ");
        }
        System.out.println(place);
    }

    private void goSomewhere(Places place) {
        switch (place) {
            case Places.hall:
                this.setPlace(Places.hall);
                break;
            case Places.street:
                this.setPlace(Places.street);
                break;
            case Places.nearCastle:
                this.setPlace(Places.nearCastle);
                break;
            default:
                System.out.println("Switch place error");
                break;
        }
    }

    private void setPlace(Places place) {
        this.place = place;
    }

    @Override
    public void properties(Properties property) {
        this.property = property;
    }

    @Override
    public void attitude(Mood mood) {
        System.out.println(this.name + " was " + mood);
        this.mood = mood;
    }

    @Override
    public void reasoning(String str) {
        this.information = this.information + str + ".";
    }

}
