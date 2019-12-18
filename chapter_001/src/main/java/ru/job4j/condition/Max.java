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
        return first > second ? first : second;
    }

    public int max(int first, int second, int third) {
        int tmp = max(second, third);
        return max (first, tmp);
    }

    public int max(int first, int second, int third, int fourth) {
        int tmp1 = max(first, second);
        int tmp2 = max(third, fourth);
        return max (tmp1, tmp2);
    }
}