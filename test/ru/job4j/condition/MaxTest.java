package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax5To3Then5() {
        int result = Max.max(5, 3);
        assertThat(result, is(5));
    }
    @Test
    public void whenMax5To6Then6() {
        int result = Max.max(5, 6);
        assertThat(result, is(6));
    }
    @Test
    public void whenMax5To6To9Then9() {
        int result = Max.max(5, 6, 9);
        assertThat(result, is(9));
    }
    @Test
    public void whenMax9To1To7To10Then10() {
        int result = Max.max(9, 1, 7, 10);
        assertThat(result, is(10));
    }
}