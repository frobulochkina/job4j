package ru.job4j.array;

/**
 * @author – Lena Kachanova (konyakova.elena@gmail.com)
 * @since – 04.08.2019
 */

public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        int index;
        for (index = 0; index <= el; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}