package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static ru.job4j.loop.Factorial.calc;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int rsl = calc(5);
        assertThat(rsl, is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int rsl = calc(0);
        assertThat(rsl, is(1));
    }
    @Test
    public void whenCalculateFactorialForThreeThenOneHundreedSix() {
        int rsl = calc(3);
        assertThat(rsl, is(6));
    }
}