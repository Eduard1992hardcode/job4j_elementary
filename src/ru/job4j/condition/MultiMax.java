package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (first > second && first > third) {
         result = first;
        } else if (first < second && second > third) {
        result = second;
        } else {
            result = third;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(max(1, 4, 2));
    }
}
