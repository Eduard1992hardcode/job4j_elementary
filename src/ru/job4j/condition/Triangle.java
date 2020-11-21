package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return (ab + ac > bc && ac + bc > ab && ab + bc > ac);
    }
}
/*Нужно проверить, что ab + ac > bc и ac + bc > ab и ab + bc > ac - в этом случае треугольник существует.*/