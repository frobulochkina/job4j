package ru.job4j.array;

/**
 * @author – Lena Kachanova (konyakova.elena@gmail.com)
 * @since – 22.08.2019
 */

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if ((data[i][i] != data[i + 1][i + 1]) || (data[i][data.length - 1] != data[i + 1][data.length - 1 - 1]))  {
                return false;
        } else if ((data[i][i] == data[i + 1][i + 1]) && (data[i][data.length - 1] == data[i + 1][data.length - 1 - 1])) {
                return true;

            }
        }

        return true;

    }
}

