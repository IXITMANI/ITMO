package Commands;

import Start.City;
import Start.Government;
import Start.StandardOfLiving;
import util.CityReader;

import java.time.ZonedDateTime;

public class ObjCreator {
    public static City create(long id) {
        System.out.print("Введите название города: ");
        String name = CityReader.ConsoleReadLine();

        System.out.print("Введите координаты x и y через пробел: ");
        String[] coordinates = CityReader.ConsoleReadLine().trim().split(" ");

        System.out.print("Введите площадь: ");
        long area = Long.parseLong(CityReader.ConsoleReadLine().trim());
        System.out.print("Введите население: ");
        long population = Long.parseLong(CityReader.ConsoleReadLine().trim());

        System.out.print("Введите высоту над уровнем моря: ");
        String text = CityReader.ConsoleReadLine().trim();
        Double metersAboveSeaLevel = null;
        if (text != "") {
            metersAboveSeaLevel = Double.parseDouble(text);
        }
        System.out.print("Введите телефонный код(от 0 до 100_000): ");
        int telephoneCode = Integer.parseInt(CityReader.ConsoleReadLine().trim());

        System.out.println("Введите форму правления: ");
        for (var i = 0; i < Government.values().length; i++) {
            System.out.print(i + 1);
            System.out.print(") ");
            System.out.println(Government.values()[i]);
        }
        Government government = Government.values()[Integer.parseInt(CityReader.ConsoleReadLine()) - 1];

        System.out.println("Введите уровень жизни: ");
        for (var i = 0; i < StandardOfLiving.values().length; i++) {
            System.out.print(i + 1);
            System.out.print(") ");
            System.out.println(StandardOfLiving.values()[i]);
        }
        StandardOfLiving standardOfLiving = StandardOfLiving.values()[Integer.parseInt(CityReader.ConsoleReadLine()) - 1];

        System.out.print("Введите рост губернатора: ");
        double governor = Double.parseDouble(CityReader.ConsoleReadLine());
        return new City(id, name, new int[]{Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1])},
                ZonedDateTime.now(), area, population, metersAboveSeaLevel, telephoneCode, government, standardOfLiving, governor);
    }
}
