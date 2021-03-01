package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll(Item[] items) {
        Item[] itemsWithoutNull = new Item[items.length];
        int size = 0;
        for (int index = 0; index < items.length; index++) {
            var name = items[index];
            if (name != null) {
                itemsWithoutNull[size] = name;
                size++;
            }
            itemsWithoutNull = Arrays.copyOf(itemsWithoutNull, size);

        }
        return itemsWithoutNull;
    }

    //проверяет в цикле все элементы массива items, сравнивая name (используя метод getName класса Item) с аргументом метода String key.
// Элементы, у которых совпадает name, копирует в результирующий массив и возвращает его.
// Алгоритм этого метода аналогичен методу findAll.
    public Item[] findByName(String key) {
        Item[] checkItemsWhithKey = new Item[items.length];
        for (int index = 0; index < items.length; index++) {
            var name = items[index];
            if (name.getName() == key) {
                checkItemsWhithKey[size] = name;
                size++;
            }
        }
        checkItemsWhithKey = Arrays.copyOf(checkItemsWhithKey, size);
        return checkItemsWhithKey;
    }
}