package Enums;

public enum Properties {
    BEAUTIFUL("Красивый"),
    LIGHT("Лёгкий"),
    STEP("Сводный"),
    None("");


    final String property;

    Properties(String property) {
        this.property = property;
    }

    public String getProperty() {
        return property;
    }

    public boolean notNone() {
        return !property.isEmpty();
    }
}
