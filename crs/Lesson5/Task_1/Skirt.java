package Lesson5.Task_1;

public class Skirt extends Clothes implements WomensClothing {

    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина надевает юбку: " + size + ", " + color + ", " + price);
    }
}