package ru.job4j.calculator;

public class ArgMethod {
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name);
        System.out.println("Мой возраст: " + age + "лет");
    }

    public static void main(String[] args) {
        String name = "Eduard Chelyadinov";
        int age = 28;

         ArgMethod.hello(name, age);
    }
}
