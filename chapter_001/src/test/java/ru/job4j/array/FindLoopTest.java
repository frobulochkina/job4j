package ru.job4j.array;

/**
 * @author – Lena Kachanova (konyakova.elena@gmail.com)
 * @since – 04.08.2019
 */

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas2ThenMinus1() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {20, 10, 3};
        int value = 2;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

}