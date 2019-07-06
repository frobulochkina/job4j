package ru.job4j.condition;


public class MultiMax {
    public int max(int first, int second, int third) {
        int a = (first > second) ? first : second;
        return a > third ? a : third;
    }
}