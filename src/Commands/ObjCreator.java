package Commands;

import Start.City;
import Start.Government;
import Start.Human;
import Start.StandardOfLiving;
import util.CityReader;

import java.time.ZonedDateTime;
import java.util.Arrays;

/**
 * Класс ObjCreator предназначен для создания объектов типа City.
 */
public class ObjCreator {
    /**
     * Создает объект City с заданным идентификатором.
     *
     * @param id идентификатор города
     * @return созданный объект City или null в случае ошибки
     */
    public static City create(long id) {
        System.out.println(id);
        String name;
        int[] coordinates = new int[2];
        long area;
        Long population;
        Double metersAboveSeaLevel;
        Integer telephoneCode;
        Government government;
        StandardOfLiving standardOfLiving;
        double governor;
        if (CityReader.scriptFlag) {
            name = CityReader.readLine();
            if (name == "") {
                System.out.println("Имя не должно быть пустое");
                return null;
            } else {
                String nullChecker = CityReader.readLine();
                if (nullChecker == null) {
                    return null;
                }
                String[] coord = nullChecker.trim().split(" ");
                try {
                    coordinates = new int[]{Integer.parseInt(coord[0]), Integer.parseInt(coord[1])};
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Нужно ввести 2 координаты через пробел(в скрипте тоже)");
                    return null;
                } catch (NumberFormatException e) {
                    System.out.println("Введи координаты нормально");
                    return null;
                }
                try {
                    nullChecker = CityReader.readLine();
                    if (nullChecker == null || nullChecker == "") {
                        area = 0;
                    } else {
                        area = Long.parseLong(nullChecker.trim());
                        if (area <= 0) {
                            return null;
                        }
                    }
                } catch (NullPointerException e) {
                    System.out.println("Площадь должна быть числом");
                    return null;
                } catch (NumberFormatException e) {
                    System.out.println("Введи площадь нормально");
                    return null;
                }
                try {
                    nullChecker = CityReader.readLine();
                    if (nullChecker == null) {
                        return null;
                    }
                    population = Long.parseLong(nullChecker.trim());
                    if (population <= 0) {
                        return null;
                    }
                } catch (NullPointerException e) {
                    System.out.println("Население должно быть числом");
                    return null;
                } catch (NumberFormatException e) {
                    System.out.println("Введи население нормально");
                    return null;
                }
                try {
                    nullChecker = CityReader.readLine().trim();
                    if (nullChecker == null || nullChecker == "") {
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
                    nullChecker = CityReader.readLine();
                    if (nullChecker == null) {
                        telephoneCode = null;
                    } else {
                        telephoneCode = Integer.parseInt(nullChecker.trim());
                        if (telephoneCode <= 0 || telephoneCode > 100000) {
                            return null;
                        }
                    }
                } catch (NullPointerException e) {
                    System.out.println("Телефонный код должен быть числом");
                    return null;
                } catch (NumberFormatException e) {
                    System.out.println("Введи телефонный код нормально");
                    return null;
                }
                try {
                    government = Government.values()[Integer.parseInt(CityReader.readLine().trim()) - 1];
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Укажи число от 1 до 3 в Government");
                    return null;
                }
                try {
                    standardOfLiving = StandardOfLiving.values()[Integer.parseInt(CityReader.readLine().trim()) - 1];
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Укажи число от 1 до 5 в StandardOfLiving");
                    return null;
                }
                try {
                    nullChecker = CityReader.readLine();
                    if (nullChecker == null) {
                        return null;
                    }
                    governor = Double.parseDouble(nullChecker.trim());
                } catch (NullPointerException e) {
                    System.out.println("Рост должен быть числом");
                    return null;
                } catch (NumberFormatException e) {
                    System.out.println("Введи рост нормально");
                    return null;
                }
                City city = new City(id, name, coordinates, ZonedDateTime.now(), area, population,
                        metersAboveSeaLevel, telephoneCode, government, standardOfLiving, governor);
                return city;
            }
        } else {
            System.out.print("Введите название города: ");
            name = CityReader.consoleReadLine();
            if (name == "") {
                System.out.println("Имя не должно быть пустое");
                return null;
            } else {
                System.out.print("Введите координаты x и y через пробел: ");
                String nullChecker = CityReader.consoleReadLine();
                if (nullChecker == null) {
                    return null;
                }
                String[] coord = nullChecker.trim().split(" ");
                try {
                    coordinates = new int[]{Integer.parseInt(coord[0]), Integer.parseInt(coord[1])};
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Нужно ввести 2 координаты через пробел(в скрипте тоже)");
                    return null;
                } catch (NumberFormatException e) {
                    System.out.println("Введи координаты нормально");
                    return null;
                }


                System.out.print("Введите площадь: ");
                try {
                    nullChecker = CityReader.consoleReadLine();
                    if (nullChecker == null || nullChecker == "") {
                        area = 0;
                    } else {
                        area = Long.parseLong(nullChecker.trim());
                        if (area <= 0) {
                            return null;
                        }
                    }
                } catch (NullPointerException e) {
                    System.out.println("Площадь должна быть числом");
                    return null;
                } catch (NumberFormatException e) {
                    System.out.println("Введи площадь нормально");
                    return null;
                }
                System.out.print("Введите население: ");
                try {
                    nullChecker = CityReader.consoleReadLine();
                    if (nullChecker == null) {
                        return null;
                    }
                    population = Long.parseLong(nullChecker.trim());
                    if (population <=0 ){return null;}
                } catch (NullPointerException e) {
                    System.out.println("Площадь должна быть числом");
                    return null;
                } catch (NumberFormatException e) {
                    System.out.println("Введи площадь нормально");
                    return null;
                }
                System.out.print("Введите высоту над уровнем моря: ");
                try {
                    nullChecker = CityReader.consoleReadLine().trim();
                    if (nullChecker == null || nullChecker == "") {
                        metersAboveSeaLevel = null;
                    } else {
                        metersAboveSeaLevel = Double.parseDouble(nullChecker);
                    }
                } catch (NullPointerException error) {
                    System.out.println("Высота над уровнем моря должна быть числом");
                    return null;
                } catch (NumberFormatException error) {
                    System.out.println("Введи высоту нормально нормально");
                    return null;
                }
                System.out.print("Введите телефонный код(от 0 до 100_000): ");
                try {
                    nullChecker = CityReader.consoleReadLine();
                    if (nullChecker == null) {
                        telephoneCode = null;
                    } else {
                        telephoneCode = Integer.parseInt(nullChecker.trim());
                        if (telephoneCode <= 0 || telephoneCode > 100000) {
                            return null;
                        }
                    }
                } catch (NullPointerException error) {
                    System.out.println("Телефонный код должен быть числом");
                    return null;
                } catch (NumberFormatException error) {
                    System.out.println("Введи телефонный код нормально");
                    return null;
                }

                System.out.println("Введите форму правления: ");
                for (var i = 0; i < Government.values().length; i++) {
                    System.out.print(i + 1);
                    System.out.print(") ");
                    System.out.println(Government.values()[i]);
                }
                try {
                    government = Government.values()[Integer.parseInt(CityReader.consoleReadLine().trim()) - 1];
                } catch (ArrayIndexOutOfBoundsException error) {
                    System.out.println("Укажи число от 1 до 3 в Government");
                    return null;
                }

                System.out.println("Введите уровень жизни: ");
                for (var i = 0; i < StandardOfLiving.values().length; i++) {
                    System.out.print(i + 1);
                    System.out.print(") ");
                    System.out.println(StandardOfLiving.values()[i]);
                }
                try {
                    standardOfLiving = StandardOfLiving.values()[Integer.parseInt(CityReader.consoleReadLine().trim()) - 1];
                } catch (ArrayIndexOutOfBoundsException error) {
                    System.out.println("Укажи число от 1 до 5 в StandardOfLiving");
                    return null;
                }

                System.out.print("Введите рост губернатора: ");
                try {
                    nullChecker = CityReader.consoleReadLine();
                    if (nullChecker == null) {
                        return null;
                    }
                    governor = Double.parseDouble(nullChecker.trim());
                } catch (NullPointerException e) {
                    System.out.println("Рост должен быть числом");
                    return null;
                } catch (NumberFormatException e) {
                    System.out.println("Введи рост нормально");
                    return null;
                }
                City city = new City(id, name, coordinates,
                        ZonedDateTime.now(), area, population, metersAboveSeaLevel, telephoneCode, government, standardOfLiving, governor);
                return city;
            }
        }
    }
}

