package ru.job4j.loop;

/**
 * @author – Lena Kachanova (konyakova.elena@gmail.com)
 * @since – 08.07.2019
 */

public class Factorial {
    /**
     *Вычисляем факториал.
     * @return ответ.
     */
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++){
            result = result * i;
        }
        return result;
    }
}
