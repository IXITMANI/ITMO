package Commands;

import Start.City;

import java.time.ZonedDateTime;
import java.util.LinkedList;

/**
 * Класс CollectionManager управляет коллекцией объектов City.
 */
public class CollectionManager {
    /**
     * Список объектов.
     */
    private final LinkedList<City> cityList = new LinkedList<>();

    /**
     * Время инициализации коллекции.
     */
    private final ZonedDateTime initializationTime = ZonedDateTime.now();

    /**
     * Добавляет объект в коллекцию.
     *
     * @param city объект City, который нужно добавить
     */
    public void add(City city) {
        cityList.add(city);
    }

    /**
     * Ищет объект по ID и возвращает его индекс в коллекции.
     *
     * @param id ID объекта
     * @return индекс объекта в списке или -1, если объект не найден
     */
    public int searchId(long id) {
        for (var i = 0; i < cityList.size(); i++) {
            if (cityList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Возвращает размер коллекции.
     *
     * @return количество объектов в коллекции
     */
    public int size() {
        return cityList.size();
    }

    /**
     * Возвращает время инициализации коллекции.
     *
     * @return время инициализации
     */
    public ZonedDateTime initializationTime() {
        return initializationTime;
    }

    /**
     * Очищает коллекцию.
     */
    public void clear() {
        cityList.clear();
    }

    /**
     * Обновляет элемент коллекции по индексу.
     *
     * @param index индекс обновляемого элемента
     * @param city новый объект City
     */
    public void update(int index, City city) {
        cityList.set(index, city);
    }

    /**
     * Возвращает строковое представление города по индексу.
     *
     * @param index индекс элемента
     * @return строковое представление объекта City
     */
    public String show(int index) {
        return cityList.get(index).toString();
    }

    /**
     * Удаляет элемент из коллекции по индексу.
     *
     * @param index индекс удаляемого элемента
     */
    public void remove(int index) {
        cityList.remove(index);
    }
    /**
     * Возвращает всю коллекцию с City.
     * @return cityList список с объектами
     */
    public LinkedList<City> getAll(){
        return cityList;
    }
}
