package ru.job4j.loop;

/**
 * @author – Lena Kachanova (konyakova.elena@gmail.com)
 * @since – 29.07.2019
 */

import org.junit.Test;

import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PaintTest {
      @Test
    public void whenPyramid4() {
        Paint paint = new Paint();
        String rst = paint.pyramid(4);
        System.out.println(rst);
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("   ^   ")
                                .add("  ^^^  ")
                                .add(" ^^^^^ ")
                                .add("^^^^^^^")
                                .toString()
                )
        );
    }

}