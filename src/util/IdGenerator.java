package util;

/**
 * Класс IdGenerator предназначен для генерации уникальных идентификаторов.
 */
public class IdGenerator {
    /** Текущее значение идентификатора. */
    static long id = 0;

    /**
     * Генерирует новый уникальный идентификатор.
     *
     * @return новый уникальный идентификатор
     */
    public static long generateId() {
        id++;
        return id;
    }
}