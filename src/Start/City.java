package Start;

import java.lang.reflect.Field;
import java.time.ZonedDateTime;
import java.util.Arrays;

public class City {
    private Long id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private long area; //Значение поля должно быть больше 0
    private Long population; //Значение поля должно быть больше 0, Поле не может быть null
    private Double metersAboveSeaLevel;
    private Integer telephoneCode; //Поле может быть null, Значение поля должно быть больше 0, Максимальное значение поля: 100000
    private Government government; //Поле не может быть null
    private StandardOfLiving standardOfLiving; //Поле не может быть null
    private Human governor; //Поле не может быть null

    public City(long id, String name, int[] coordinates, ZonedDateTime creationDate, long area, long population, Double metersAboveSeaLevel, int telephoneCode, Government government, StandardOfLiving standardOfLiving, double governorHeight) {
        if (name.trim().isEmpty()) {
            System.out.println("Имя не может быть пустым");
        }
        if (area <= 0) {
            System.out.println("Площадь должна быть больше 0");
        }
        if ((population <= 0)) {
            System.out.println("Население должно быть больше 0");
        }
        if (telephoneCode <= 0 || telephoneCode > 100000) {
            System.out.println("Телефонный код должен быть больше 0 и не превышать 100000");
        }

        this.id = id;
        this.name = name;
        this.coordinates = new Coordinates(coordinates);
        this.creationDate = creationDate;
        this.area = area;
        this.population = population;
        this.metersAboveSeaLevel = metersAboveSeaLevel;
        this.telephoneCode = telephoneCode;
        this.government = government;
        this.standardOfLiving = standardOfLiving;
        this.governor = new Human(governorHeight);
    }

    public long getId() {
        return id;
    }
    public void printFields() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("coordinates: " + coordinates.toString());
        System.out.println("creationDate: " + creationDate);
        System.out.println("area: " + area);
        System.out.println("population: " + population);
        System.out.println("metersAboveSeaLevel: " + metersAboveSeaLevel);
        System.out.println("telephoneCode: " + telephoneCode);
        System.out.println("government: " + government);
        System.out.println("standardOfLiving: " + standardOfLiving);
        System.out.println("governor: " + governor.getHeight());
    }
}