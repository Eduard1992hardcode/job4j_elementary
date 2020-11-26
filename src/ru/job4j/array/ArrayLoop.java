package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] five = new int[5];
        for (int i = 0; i < five.length; i++) {
        five[i] = i * 2 + 3;
        }
        for (int number : five) {
            System.out.println(number);
        }
    }
}
