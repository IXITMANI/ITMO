package util;

public class IdGenerator {
    static long id = 0;
    public static long generateId(){
        id++;
        return id;
    }
}
