package ru.job4j.array;

/**
 * @author – Lena Kachanova (konyakova.elena@gmail.com)
 * @since – 12.08.2019
 */

public class Turn {
    public int[] back(int[] array) {
            int i;
            for (i = 0; i < array.length / 2; i++) {
                int temp = array[array.length-i-1];
                array[array.length-i-1] = array[i];
                array[i] = temp;
            }
        return array;
    }
}
