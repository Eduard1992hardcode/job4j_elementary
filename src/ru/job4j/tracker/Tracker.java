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
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    //проверяет в цикле все элементы массива items, сравнивая name (используя метод getName класса Item) с аргументом метода String key.
   // Элементы, у которых совпадает name, копирует в результирующий массив и возвращает его.
// Алгоритм этого метода аналогичен методу findAll.
    public Item[] findByName(String key) {
        Item[] checkItemsWhithKey = new Item[items.length];
        int s = 0;
        for (int index = 0; index < size; index++) {
            var name = items[index];
            if (name.getName().equals(key)) {
                checkItemsWhithKey[index] = name;
                 s++;
            }
        }
        return Arrays.copyOf(checkItemsWhithKey, s);
    }

    public boolean replace(int id, Item item) {
        if (indexOf(id) == -1) {
            return false;
        } else {
        items[indexOf(id)].setName(item.getName());
        return true;
        }
    }

    public boolean delete(int id) {
        boolean rls;
        int index = indexOf(id);
        if (index == -1) {
            rls = false;
        } else {
            System.arraycopy(items, index + 1, items, index, size - index);
            rls = true;
            size--;
        }
        return rls;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
}