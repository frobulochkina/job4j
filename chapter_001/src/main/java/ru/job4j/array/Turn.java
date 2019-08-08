package ru.job4j.array;

/**
 * @author – Lena Kachanova (konyakova.elena@gmail.com)
 * @since – 04.08.2019
 */

public class Turn {
    public class Turn {
        public int[] back(int[] array) {
            for (int index = 0; index != array.length / 2; index++) {
                int tmp = array[index];
                array[index] = back().length - 1;
            }
            return array;
        }
    }
}
