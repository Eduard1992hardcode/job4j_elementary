package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
Tracker trck = new Tracker();
        System.out.println(trck.findById(15));
        Item item = new Item();
        item.setId(55);
        item.setName("first");
        System.out.println(item);
    }
}
//Внутри метода main создайте объект Tracker. Вызовите у него метод add с объектом Item.
//    Вызовите метод findById и найденный Item выведите на консоль.