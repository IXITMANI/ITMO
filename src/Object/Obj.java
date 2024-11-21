package Object;

import Enums.Places;
import Enums.Properties;

public abstract class Obj {
    protected final String name;
    protected Places place = Places.None;
    protected Properties property = Properties.None;
    protected String information = "";

    public Obj(String name) {
        this.name = name;
    }

    public Obj(String name, Places place) {
        this.name = name;
        this.place = place;
    }
}
