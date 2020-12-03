package ru.job4j.oop;

public class Student {
    public void music() {
        System.out.print("tra tra tra");
    }
    public void song() {
        System.out.print("I believe I can fly");
    }
    public static void main(String[] args) {
        Student  petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.song();
        petya.song();
        petya.song();
    }
}
