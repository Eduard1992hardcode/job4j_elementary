package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int fact = 1;
        if (n == 0) {
            return 1;
        } else {
        for (int i = 1; i < n; i++) {
            fact = fact + fact * i;
        }
        }
        return  fact;
    }
}
