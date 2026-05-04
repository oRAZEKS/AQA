package Lesson5.Task_1;

public class TShirt extends Clothes implements MensClothing, WomensClothing {

    public TShirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надевает футболку: " + size + ", " + color + ", " + price);
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина надевает футболку: " + size + ", " + color + ", " + price);
    }
}
