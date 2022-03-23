package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        int calc = 0;
        for (int index = 1; index <= number; index++) {
            if (number == 1) {
                prime = false;
                break;
            } else if (number % index == 0) {
                calc += 1;
            } else if (calc > 2) {
                prime = false;

                break;
            }

        }
    return prime;
    }

}
