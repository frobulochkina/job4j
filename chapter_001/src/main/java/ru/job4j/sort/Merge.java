package ru.job4j.sort;

/**
 * @author – Lena Kachanova (konyakova.elena@gmail.com)
 * @since – 14.10.2019
 */

import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0, j = 0, x = 0;

        while (i < left.length && j < right.length)
            rsl[x++] = left[i] < right[j] ? left[i++] :  right[j++];
        while (i < left.length)
            rsl[x++] = left[i++];
        while (j < right.length)
            rsl[x++] = right[j++];
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}

