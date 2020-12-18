package ru.job4j.tracker;

public abstract class Profession {
 private String name;
 private String surname;
 private String education;
 private String birthday;
 public String getName() {
     return  this.name;
 }
}
/*(name, surname, education, birthday) и методы (get методы на поля (public String getName()))*/