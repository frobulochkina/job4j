package ru.job4j.condition;

/**
 * Программа вычисления сторон и площади прямоугольника
 */


public class SqArea {
    /**
     * @param k коэффициент.
     * @param p периметр.
     * @return площадь.
     */
    public int square(int p, int k) {
        int h = p / 2 / (k + 1);
        int w = h * k;
        return w * h;
    }
}