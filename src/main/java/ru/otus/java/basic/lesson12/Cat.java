package ru.otus.java.basic.lesson12;

public class Cat {
    private String name;
    private int age;
    private boolean isHungry;

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public String getName() {
        return name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.isHungry = true;
    }

    public void info() {
        System.out.println(name + " " + age);
    }

    public void eat(Plate plate) {
        if (isHungry) {
            System.out.println(name + " поел");
            plate.decreaseFood(10);
            isHungry = false;
        } else {
            System.out.println(name + " не голоден");
        }
    }
}
