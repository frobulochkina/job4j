package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CalculatorTest<is> {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }


    @Test
    public void whenAddFiveSubtractFourThenOne() {
        Calculator calc = new Calculator();
        double result = calc.subtract(5D, 4D);
        double expected = 1D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenAddTenDivTwoThenFive() {
        Calculator calc = new Calculator();
        double result = calc.div(10D, 2D);
        double expected = 5D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenAddTwoMultiplevFiveThenTen() {
        Calculator calc = new Calculator();
        double result = calc.multiple(2D, 5D);
        double expected = 10D;
        assertThat(result, is(expected));
    }
}
