package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setNameSurnamePatronymic("Челядинов Эдуард Игоревич");
        student.setGroup("17-ЗЭБ-01");
        student.setDateOfReceipt("15 июня 2018");
        System.out.println(student.getNameSurnamePatronymic() + " " + student.getGroup() + " " + student.getDateOfReceipt());
    }
}
