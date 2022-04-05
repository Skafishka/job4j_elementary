package ru.job4j.condition;

public class Film {
    public static String permit(int age) {
        String label = age >= 18 ? "Please, enjoy it." : "You can't watch it.";
        return label;
    }

    public static void main(String[] args) {
        String msg = Film.permit(33);
        System.out.println(msg);
    }
}