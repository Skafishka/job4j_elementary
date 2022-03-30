package ru.job4j.array;

public class LengthArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1}, {2, 3}, {2, 3, 4}, {2, 3, 4, 5}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Размер вложенного массив равен: " + numbers[i].length
            );
        }
    }
}
