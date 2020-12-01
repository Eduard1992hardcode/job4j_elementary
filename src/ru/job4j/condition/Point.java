package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.pow((x2 - x1) + (y2 - y1), 2);
        rsl = Math.sqrt(rsl);
        return rsl;
    }
    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(3, 7, 6, 5);
        System.out.println("result (3, 7) to (6, 5) " + result);
        result = Point.distance(1, 1, 10, 8);
        System.out.println("result (1, 1) to (10, 8) " + result);
        result = Point.distance(5, 15, 6, 8);
        System.out.println("result (5, 15) to (6, 8) " + result);
    }
}