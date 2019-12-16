package ru.job4j.calculator;

/**
 * @author – Lena Kachanova (konyakova.elena@gmail.com)
 * @since – 18.06.2019
 */

public class Calculator {
    /**
     * Калькулятор, функция сложения.
     */
    public double add(double first, double second) {
        return first + second;
    }
    public double add(double first, double second, double third) {
        return add(
                first,
                add (second, third)
        );
    }
    public double add(double first, double second, double third, double fourth) {
        return add(
                first,
                add (second, third, fourth)
        );
    }

    /**
     * Калькулятор, функция вычитания.
     */
    public double subtract(double first, double second) {
        return first - second;
    }

    /**
     * Калькулятор, функция деления.
     */
    public double div(double first, double second) {
        return first / second;
    }

    /**
     * Калькулятор, функция умножения.
     */
    public double multiple(double first, double second) {
        return first * second;
    }
}