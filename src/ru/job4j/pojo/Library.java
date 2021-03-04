package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        Book  karenina = new Book("Anna Karenina", 250),
         idiot = new Book("Idiot", 180),
         cleanCode = new Book("Clean code", 800),
         hitchhikers = new Book("The Hitchhiker's Guide to the Galaxy", 220);
        books[0] = karenina;
        books[1] = idiot;
        books[2] = cleanCode;
        books[3] = hitchhikers;
        printBook(books);
        Book bk = books[0];
        books[0] = books[3];
        books[3] = bk;
        printBook(books);
        printBookIsNameCleanCode(books, "Clean code");

    }

    private static void printBook(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            Book bk1 = books[i];
            System.out.println(bk1.getName() + " - " + bk1.getCountPages());
        }
    }

    private static void printBookIsNameCleanCode(Book[] books, String name) {
        for (int i = 0; i < books.length; i++) {
            Book bk1 = books[i];
            if (bk1.getName().equals(name) ) {
                System.out.println(bk1.getName() + " - " + bk1.getCountPages());
            }
        }
    }
}
