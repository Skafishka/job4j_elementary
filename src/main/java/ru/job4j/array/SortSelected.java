package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int a = 0; a < data.length - 1; a++) {
            int min = MinDiapason.findMin(data, a, data.length - 1);
            int index = FindLoop.indexInRange(data, min, a, data.length - 1);
            int temp = data[a];
            data[a] = data[index];
            data[index] = temp;
        }
        return data;
    }
}