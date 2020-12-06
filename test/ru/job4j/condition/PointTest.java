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
        Point first = new Point(0, 0);
        Point second = new Point(2, 0);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when37to65then1() {
        int expected = 1;
        Point first = new Point(3, 7);
        Point second = new Point(6, 5);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when11to108then16() {
        int expected = 16;
        Point first = new Point(1, 1);
        Point second = new Point(10, 8);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when515to68then6() {
        int expected = 6;
        Point first = new Point(5, 15);
        Point second = new Point(6, 8);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when5157to683then7() {
        int expected = 7;
        Point first = new Point(5, 15,7);
        Point second = new Point(6, 8,3);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.1);
    }
}