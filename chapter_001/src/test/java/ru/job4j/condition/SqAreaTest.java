package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SqAreaTest {
    @Test
    public void p24k2s32() {
        assertThat(new SqArea().square(24, 2), is(32));
    }

    @Test
    public void p6k2s2() {
        assertThat(new SqArea().square(6, 2), is(2));
    }
}