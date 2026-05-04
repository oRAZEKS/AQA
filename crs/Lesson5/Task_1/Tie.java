package Lesson5.Task_1;

public class Tie extends Clothes implements MensClothing {

    public Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надевает галстук: " + size + ", " + color + ", " + price);
    }
}