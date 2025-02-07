package Commands;

import Start.City;

import java.time.ZonedDateTime;
import java.util.LinkedList;

public class CollectionManager {
    LinkedList<City> cityList = new LinkedList<>();
    final java.time.ZonedDateTime initializationTime = ZonedDateTime.now();

    public void add(City city) {
        cityList.add(city);
    }

    public int searchId(long id) {
        for (var i = 0; i < cityList.size(); i++) {
            if (cityList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public int size() {
        return cityList.size();
    }

    public java.time.ZonedDateTime initializationTime() {
        return initializationTime;
    }

    public void clear() {
        cityList.clear();
    }

    public void update(int index, City city) {
        cityList.set(index, city);
    }

    public void show(int index) {
        cityList.get(index).printFields();
    }

    public void remove(int index) {
        cityList.remove(index);
    }
}
