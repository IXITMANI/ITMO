package Object;

import Enums.Places;

import java.util.Objects;

public class Thing extends Obj {

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

    final private String name;
    final private Places place;
    public Thing(String name, Places place) {
        super(name, place);
        this.name = name;
        this.place = place;
    }

}
