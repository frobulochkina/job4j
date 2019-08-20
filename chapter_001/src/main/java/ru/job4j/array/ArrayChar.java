package ru.job4j.array;

/**
 * @author – Lena Kachanova (konyakova.elena@gmail.com)
 * @since – 14.08.2019
 */

public class ArrayChar {
    /**
     * Проверяет. что слово начинается с префикса.
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
     */
    public boolean startsWith(String word, String prefix) {
        boolean result = true;
        char[] pref = prefix.toCharArray();
        char[] wrd = word.toCharArray();
        for (int i = 0; i < pref.length; i++){
                if (pref[i] != wrd[i]) {
                    result = false;
                    break;
                }
        }
        // проверить. что массив data имеет первые элементы одинаковые с value
        return result;
    }
}
