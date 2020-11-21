package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }
}
/*ТИП_ПЕРЕМЕННОЙ ИМЯ_ПЕРЕМЕННОЙ = ЛОГИЧЕСКОЕ_ВЫРАЖЕНИЕ ? ЗНАЧЕНИЕ_1 : ЗНАЧЕНИЕ_2;*/