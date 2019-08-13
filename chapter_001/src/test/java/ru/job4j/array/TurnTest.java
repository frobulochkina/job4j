package ru.job4j.array;

/**
 * @author – Lena Kachanova (konyakova.elena@gmail.com)
 * @since – 12.08.2019
 */

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }


    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {6, 3, 9, 0, 12};
        int[] result = turner.back(input);
        int[] expect = new int[] {12, 0, 9, 3, 6};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArrayThis() {
        Turn turner = new Turn();
        int[] input = new int[] {6, 3, 9, 0, 12, 8, 123};
        int[] result = turner.back(input);
        int[] expect = new int[] {123, 8, 12, 0, 9, 3, 6};
        assertThat(result, is(expect));

    }
}