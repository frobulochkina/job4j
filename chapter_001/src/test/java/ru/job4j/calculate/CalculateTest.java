package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Lena Kachanova (konyakova.elena@gmail.com)
 * @version $Id$
 * @since 09.06.2019
 */
public class CalculateTest {
 /**
 * Test echo.
 */

@Test
 public void whenTakeNameThenThreeEchoPlusName() {
    String input = "Lena Kachanova";
    String expect = "Echo, echo, echo : Lena Kachanova"; 
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
 }

}