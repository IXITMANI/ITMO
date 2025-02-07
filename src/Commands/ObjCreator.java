package Commands;

import Start.City;
import Start.Government;
import Start.Human;
import Start.StandardOfLiving;
import util.CityReader;

import java.time.ZonedDateTime;

public class ObjCreator {
    public static City create(long id) {
        if (CityReader.scriptFlag) {
            String name = CityReader.readLine();
            if (name == "") {
                System.out.println("Имя не должно быть пустое");
                return null;
            } else {
                int[] coordinates = new int[2];
                long area;
                Long population;
                Double metersAboveSeaLevel;
                Integer telephoneCode;
                Government government;
                StandardOfLiving standardOfLiving;
                double governor;
                String[] coord = CityReader.readLine().trim().split(" ");
                try {
                    coordinates = new int[]{Integer.parseInt(coord[0]), Integer.parseInt(coord[1])};
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Нужно ввести 2 координаты через пробел(в скрипте тоже)");
                    return null;
                } catch (NumberFormatException e) {
                    System.out.println("Введи координаты нормально");
                    return null;
                } catch (NullPointerException e) {
                    System.out.println("Координаты должны быть числами");
                    return null;
                }
                try {
                    area = Long.parseLong(CityReader.readLine().trim());
                } catch (NullPointerException e) {
                    System.out.println("Площадь должна быть числом");
                    return null;
                } catch (NumberFormatException e) {
                    System.out.println("Введи площадь нормально");
                    return null;
                }
                try {
                    population = Long.parseLong(CityReader.readLine().trim());
                } catch (NullPointerException e) {
                    System.out.println("Население должно быть числом");
                    return null;
                } catch (NumberFormatException e) {
                    System.out.println("Введи население нормально");
                    return null;
                }
                try {
                    String nullChecker = CityReader.readLine().trim();
                    if (nullChecker == null) {
                        metersAboveSeaLevel = null;
                    } else {
                        metersAboveSeaLevel = Double.parseDouble(nullChecker);
                    }
                } catch (NullPointerException e) {
                    System.out.println("Высота над уровнем моря должна быть числом");
                    return null;
                } catch (NumberFormatException e) {
                    System.out.println("Введи высоту нормально нормально");
                    return null;
                }
                try {
                    telephoneCode = Integer.parseInt(CityReader.readLine().trim());
                } catch (NullPointerException e) {
                    System.out.println("Телефонный код должен быть числом");
                    return null;
                } catch (NumberFormatException e) {
                    System.out.println("Введи телефонный код нормально");
                    return null;
                }
                government = Government.values()[Integer.parseInt(CityReader.readLine().trim()) - 1];
                standardOfLiving = StandardOfLiving.values()[Integer.parseInt(CityReader.readLine().trim()) - 1];
                try {
                    governor = Double.parseDouble(CityReader.readLine().trim());
                } catch (NullPointerException e) {
                    System.out.println("Телефонный код должен быть числом");
                    return null;
                } catch (NumberFormatException e) {
                    System.out.println("Введи телефонный код нормально");
                    return null;
                }
                City city = new City(id, name, coordinates, ZonedDateTime.now(), area, population,
                        metersAboveSeaLevel, telephoneCode, government, standardOfLiving, governor);
                return city;
            }
        } else {
            System.out.print("Введите название города: ");
            String name = CityReader.consoleReadLine();

            System.out.print("Введите координаты x и y через пробел: ");
            String[] coordinates = CityReader.consoleReadLine().trim().split(" ");


            System.out.print("Введите площадь: ");
            long area = Long.parseLong(CityReader.consoleReadLine().trim());
            System.out.print("Введите население: ");
            long population = Long.parseLong(CityReader.consoleReadLine().trim());

            System.out.print("Введите высоту над уровнем моря: ");
            String text = CityReader.consoleReadLine().trim();
            Double metersAboveSeaLevel = null;
            if (text != "") {
                metersAboveSeaLevel = Double.parseDouble(text);
            }
            System.out.print("Введите телефонный код(от 0 до 100_000): ");
            int telephoneCode = Integer.parseInt(CityReader.consoleReadLine().trim());

            System.out.println("Введите форму правления: ");
            for (var i = 0; i < Government.values().length; i++) {
                System.out.print(i + 1);
                System.out.print(") ");
                System.out.println(Government.values()[i]);
            }
            Government government = Government.values()[Integer.parseInt(CityReader.consoleReadLine()) - 1];

            System.out.println("Введите уровень жизни: ");
            for (var i = 0; i < StandardOfLiving.values().length; i++) {
                System.out.print(i + 1);
                System.out.print(") ");
                System.out.println(StandardOfLiving.values()[i]);
            }
            StandardOfLiving standardOfLiving = StandardOfLiving.values()[Integer.parseInt(CityReader.consoleReadLine()) - 1];

            System.out.print("Введите рост губернатора: ");
            double governor = Double.parseDouble(CityReader.consoleReadLine());
            try {
                City city = new City(id, name, new int[]{Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1])},
                        ZonedDateTime.now(), area, population, metersAboveSeaLevel, telephoneCode, government, standardOfLiving, governor);
                return city;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Нужно ввести 2 координаты через пробел");
                Invoker.executionCommand("add");
            }
        }
        return null;
    }
}
