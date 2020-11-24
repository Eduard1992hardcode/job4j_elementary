package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for (int i = 1; i <= number; i++) {
            if (number >= 10) {
                prime = false;
                break;
            }
            if (number == 1) {
                prime = false;
                break;
            }
            if (number == 2) {
                prime = true;
                break;
            }
            if (number % 2 == 0) {
                prime = false;
                break;
            } else {
                prime = true;
                break;
            }
        }
        return prime;
    }
}

