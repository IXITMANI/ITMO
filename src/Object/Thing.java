package Object;

import Enums.Places;

import java.util.Objects;

public class Thing extends Obj {
    protected int count;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thing thing = (Thing) o;
        return Objects.equals(name.toLowerCase(), thing.name.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return name;
    }

    public Thing(String name, Places place) {
        super(name, place);
    }
    public Thing(String name, Places place,int count) {
        super(name, place);
        this.count = count;
    }
    public void Move(Places place){
        this.place = place;
    }
}
