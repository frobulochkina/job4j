package ru.job4j.condition;

/**
 * @author – Lena Kachanova (konyakova.elena@gmail.com)
 * @since – 30.06.2019
 */
public class Max {
    /**
     * Максимальное число
     * @return Ответ.
     */
    public int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }
}