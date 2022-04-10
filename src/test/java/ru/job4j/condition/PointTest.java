package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when008to2016then8dot24() {
        double expected = 8.24;
        Point a = new Point(0, 0, 8);
        Point b = new Point(2, 0, 16);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when5310to321hen9dot27() {
        double expected = 9.27;
        Point a = new Point(5, 3, 10);
        Point b = new Point(3, 2, 1);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when15311to432then14dot21() {
        double expected = 14.21;
        Point a = new Point(15, 3, 11);
        Point b = new Point(4, 3, 2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when822to945then3dot74() {
        double expected = 3.74;
        Point a = new Point(8, 2, 2);
        Point b = new Point(9, 4, 5);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}