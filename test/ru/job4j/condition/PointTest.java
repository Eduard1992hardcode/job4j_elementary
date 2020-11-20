package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
/*result (0, 0) to (2, 0) 2.0
result (3, 7) to (6, 2) 1.0
result (1, 1) to (10, 8) 16.0
result (4, 15) to (6, 8) 6.0*/
    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when37to65then1() {
        int expected = 1;
        int x1 = 3;
        int y1 = 7;
        int x2 = 6;
        int y2 = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when11to108then16() {
        int expected = 16;
        int x1 = 1;
        int y1 = 1;
        int x2 = 10;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when515to68then6() {
        int expected = 6;
        int x1 = 5;
        int y1 = 15;
        int x2 = 6;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}