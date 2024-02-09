package ru.otus.java.basic.lesson10;


import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Cat[] cats = new Cat[4];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Barsik" + (i + 1), "White", 1 + i);
        }
    }
}
