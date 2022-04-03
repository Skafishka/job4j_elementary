package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int ost = money - price;
        for (int index = 0; index < rsl.length; index++) {
            for (int i = 0; i < coins.length; i++) {
                if (ost >= coins[i]) {
                    rsl[index] = coins[i];
                    ost -= rsl[index];
                    size += 1;
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
