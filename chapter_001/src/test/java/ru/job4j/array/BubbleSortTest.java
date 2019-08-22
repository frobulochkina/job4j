package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort sorter = new BubbleSort();
        int[] input = new int[]{4, 1, 6, 2, 21, 12, 12, 10, 9, 50};
        int[] result = sorter.sort(input);
        int[] expect = new int[]{1, 2, 4, 6, 9, 10, 12, 12, 21, 50};
        assertThat(result, is(expect));
    }

}