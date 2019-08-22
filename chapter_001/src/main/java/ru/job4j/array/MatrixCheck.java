package ru.job4j.array;

/**
 * @author – Lena Kachanova (konyakova.elena@gmail.com)
 * @since – 22.08.2019
 */

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        int diagonalFirst = 0;
        int diagonalSecond = 0;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i][i] == data[i + 1][i + 1]) {
                diagonalFirst++;
            }
            if (data[data.length - 1][data.length - 1] == data[data.length - 1 - i][data.length - 1 - i]) {
                diagonalSecond++;
            }
        }
        result = diagonalFirst == data.length - 1 || diagonalSecond == data.length - 1;
        return result;

    }
}
