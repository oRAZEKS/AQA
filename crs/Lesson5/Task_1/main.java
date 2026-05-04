package Lesson5.Task_1;

public class main {
    static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Size.M, 20.5, "Красный"),
                new Pants(Size.L, 35.0, "Синий"),
                new Skirt(Size.S, 25.0, "Зеленый"),
                new Tie(Size.XS, 15.0, "Черный")
        };

        Atelier atelier = new Atelier();

        System.out.println("Одеваем женщин:");
        atelier.dressWoman(clothes);

        System.out.println("Одеваем мужчин:");
        atelier.dressMan(clothes);
    }
}
