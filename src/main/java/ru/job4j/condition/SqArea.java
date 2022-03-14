package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double rls = (h * k) * h;
        return rls;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(result1);
    }
}
