package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void giveNick(String nick) {
      this.name = nick;
    }
    void eat(String meat) {
        this.food = meat;
    }
        public String sound() {
        String voice = "may-may";
        return voice;
    }

    public void show() {
        System.out.println(this.name + " cегодня съел: " + this.food);
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        Cat peppy = new Cat();
        Cat black = new Cat();
        gav.eat("kotleta");
        black.eat("fish");
        gav.giveNick("Гав");
        black.giveNick("Черный");
        gav.show();
        black.show();
    }
}
