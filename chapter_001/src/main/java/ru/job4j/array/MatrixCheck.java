package ru.job4j.array;

/**
 * @author – Lena Kachanova (konyakova.elena@gmail.com)
 * @since – 22.08.2019
 */

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        for (int i = 0; i < data.length - 1; i++) {
            if ((data[i][i] != data[i + 1][i + 1]) || (data[data.length - 1][0]!= data[data.length - 1 - i][i]))  {
                return false;
            } else  {
                return true;
            }
        }
        return true;
    }
}

