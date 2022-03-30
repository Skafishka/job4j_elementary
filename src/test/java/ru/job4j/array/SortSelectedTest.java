package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayof3elements() {
        int[] data = new int[] {7, 10, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {3, 7, 10};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayof7elements() {
        int[] data = new int[] {6, 9, 10, 15, 27, 123, 67};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {6, 9, 10, 15, 27, 67, 123};
        Assert.assertArrayEquals(expected, result);
    }
}