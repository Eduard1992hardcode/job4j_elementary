package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {

        for (int i = index; i < products.length; i++) {
            index += 1;
            if (index == products.length) {
                products[i] = null;
            } else {
                products[i] = products[index];
            }

        }
        return products;
    }
}
