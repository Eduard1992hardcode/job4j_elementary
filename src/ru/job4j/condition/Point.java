package ru.job4j.condition;

import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;

public class Point {
    private int x;
    private int y;
    private int z;

    public  Point(int first, int second) {
        this.x = first;
        this.y = second;
    }
    public  Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }
    public double distance(Point another) {
        return sqrt(pow(another.x - this.x, 2) + pow(another.y - this.y, 2));
    }
    public double distance3d(Point another) {
        return sqrt(pow(another.x - this.x, 2) + pow(another.y - this.y, 2) + pow(another.z - this.z, 2));
    }
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }

}