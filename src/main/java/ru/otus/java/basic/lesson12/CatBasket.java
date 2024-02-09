package ru.otus.java.basic.lesson12;

public class CatBasket {
    private Cat cat;

    public void catIn(Cat cat) {
        if (this.cat != null) {
            System.out.println("На лежанке уже лежит кот: " + this.cat.getName());
            return;
        }
        System.out.println("Лежанку занял кот: " + cat.getName());
        this.cat = cat;
    }

    public void info() {
        if (cat != null) {
            System.out.println("Лежанка: " + cat.getName());
        } else {
            System.out.println("Пустая лежанка");
        }
    }
}
