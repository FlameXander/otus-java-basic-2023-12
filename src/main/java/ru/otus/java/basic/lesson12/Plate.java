package ru.otus.java.basic.lesson12;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount) {
        food -= amount;
    }

    public void info() {
        System.out.println("Plate: " + food);
    }

    public void addFood(FoodPacket foodPacket) {
        food += foodPacket.getFood();
        foodPacket.clear();
    }
}
