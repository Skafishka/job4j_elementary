package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left1, int right1, int left, int right) {
        return max(left1, max(right1, max(left, right)));
    }

    public static void main(String[] args) {
        int rsl = Max.max(3, 1, 4, 7);
        System.out.println(rsl);
    }

}
