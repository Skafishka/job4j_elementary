package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int forth) {
        return max(first, max(second, max(third, forth)));
    }

    public static void main(String[] args) {
        int rsl = Max.max(3, 1, 4, 7);
        System.out.println(rsl);
    }

}
