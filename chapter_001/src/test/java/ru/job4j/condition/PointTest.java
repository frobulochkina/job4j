package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void when3And5Then3() {
        Point first = new Point(3, 3,0);
        Point second = new Point(5, 5, 1);
        double result = first.distance3d(second);
        first.info();
        second.info();
        System.out.println(String.format("Result = %s", result));
        assertThat(result, is(3.0));
    }

}