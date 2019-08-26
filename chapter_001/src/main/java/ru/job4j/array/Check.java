package ru.job4j.array;

/**
 * @author – Lena Kachanova (konyakova.elena@gmail.com)
 * @since – 14.08.2019
 */

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        boolean j = data[0];
          for (int i = 1; i < data.length; i++) {
              if (data[i] != j) return false;
          }
        return true;

    }
}

