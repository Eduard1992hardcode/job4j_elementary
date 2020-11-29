package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] array = {{1}, {5, 6}, {1, 3, 7}, {4, 8, 9, 11}};
        for (int i = 0; i < array.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен: " + array[i].length
            );
        }
    }
}
