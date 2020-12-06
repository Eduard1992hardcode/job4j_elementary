package ru.job4j.oop;

public class Battery {
    private int load;

    public  Battery(int count) {
    this.load = count;
}
    public void exchange(Battery another) {
     another.load += this.load;
     this.load = 0;
    }
}
