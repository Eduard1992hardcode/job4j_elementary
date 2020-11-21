package ru.job4j.condition;

public class LogicNot {

    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public boolean isPositive(int num) {
        return num > 0;
    }

    public boolean notEven(int num) {
        return !isEven(num);
    }

    public boolean notPositive(int num) {
        return !isPositive(num);
    }

    public boolean notEvenAndPositive(int num) {
        return (notEven(num) && isPositive(num));
    }

    public boolean evenOrNotPositive(int num) {
        return (isEven(num) || notPositive(num));
    }

}
/*В нем уже есть методы isEven() - проверяет, что число четное,

isPositive() -  проверяет, что число положительное.

Вам нужно написать код в эти методы используя сочетания методов указанных ниже:

- метод notEven(), проверяет, что число нечетное

- метод notPositive(), проверяет, что число не положительное

- метод notEvenAndPositive(), проверяет, что число нечетное и положительное

- метод evenOrNotPositive(), проверяет, что число четное или не положительное*/