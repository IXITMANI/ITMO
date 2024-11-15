package Object;

import Enums.Places;

public abstract class Obj {
    protected String name;
    protected Places place;

    public Obj(String name, Places place) {
        this.name = name;
        this.place = place;
    }
}
