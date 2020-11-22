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
/*1. В этом задании нужно написать метод

public int max(int first, int second, int third)

2. Метод должен возвращать максимум из трех чисел.
Внутри метода max нужно сравнить попарно первое со вторым и максимум из них сравнить с третьим числом.

В методе нужно использовать вложенный оператор if-else.*/