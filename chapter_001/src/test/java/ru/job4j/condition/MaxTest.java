package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @author – Lena Kachanova (konyakova.elena@gmail.com)
 * @since – 30.06.2019
 */

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To1Then2() {
        Max max = new Max();
        int result = max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3To3Then3() {
        Max max = new Max();
        int result = max.max(3, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax1To2To4Then4() {
        Max max = new Max();
        int result = max.max(1, 2, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax4To6To67To1Then67() {
        Max max = new Max();
        int result = max.max(4, 6, 67, 1);
        assertThat(result, is(67));
    }
}