package Lesson5.Task_1;

public class Pants extends Clothes implements MensClothing, WomensClothing {

    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надевает штаны: " + size + ", " + color + ", " + price);
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина надевает штаны: " + size + ", " + color + ", " + price);
    }
}