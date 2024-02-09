package ru.otus.java.basic.lesson12;

public class MainApp {
    public static void main(String[] args) {
//        Plate plate1 = new Plate(100);
//        Plate plate2 = new Plate(100);
        Cat cat1 = new Cat("Barsik", 2);
        Cat cat2 = new Cat("Murzik", 2);
        CatBasket catBasket = new CatBasket();
        catBasket.info();
        catBasket.catIn(cat1);
        catBasket.catIn(cat2);
        catBasket.info();

//        cat.eat(plate2);
//
//        cat.info();
//        plate1.info();
//        plate2.info();
//
//        FoodPacket foodPacket = new FoodPacket(50);
//        plate2.addFood(foodPacket);
//        plate2.info();
    }
}
