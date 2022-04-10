package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To9Then9() {
        int left1 = 3;
        int right1 = 1;
        int left = 4;
        int right = 9;
        int result = Max.max(left1, right1, left, right);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax39to1179Then1179() {
        int left1 = 39;
        int right1 = 69;
        int left = 1179;
        int right = 555;
        int result = Max.max(left1, right1, left, right);
        int expected = 1179;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5to99Then99() {
        int left1 = 0;
        int right1 = 40;
        int left = 33;
        int right = 99;
        int result = Max.max(left1, right1, left, right);
        int expected = 99;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax8to8Then8() {
        int left1 = 8;
        int right1 = 8;
        int left = 8;
        int right = 8;
        int result = Max.max(left1, right1, left, right);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }
}