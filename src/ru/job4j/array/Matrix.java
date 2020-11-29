package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            arr[i][j] = (i + 1) * (j + 1);
            }
        }
        return arr;
    }
}
