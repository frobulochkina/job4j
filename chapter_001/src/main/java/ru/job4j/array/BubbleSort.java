package ru.job4j.array;

/**
 * @author – Lena Kachanova (konyakova.elena@gmail.com)
 * @since – 20.08.2019
 */

public class BubbleSort {
    public int[] sort(int[] array){
        int count;
        do{
            count = 0;
            for (int i = 0; i < array.length-1; i++){
                if (array[i] > array[i + 1] ){
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                }
            }
        } while (count > 0);
          return array;
    }
}


