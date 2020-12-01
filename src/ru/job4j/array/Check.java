package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < 1; i++) {
        for (boolean el : data) {
        if (data[i] == el) {
        result = true;
        } else {
            result = false;
break;
        }
        }
        }
        return result;
    }
}
