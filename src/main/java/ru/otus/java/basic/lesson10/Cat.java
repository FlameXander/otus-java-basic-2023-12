package ru.otus.java.basic.lesson10;

public class Cat {
    private String name;
    private String color;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void run() {
        System.out.println(name + " побежал");
    }

    public void jump() {
        System.out.println(name + " подпрыгнул");
    }

    public void info() {
        System.out.println(name + " " + color + " " + age);
    }
}