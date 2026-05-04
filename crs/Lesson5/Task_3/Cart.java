package Lesson5.Task_3;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> items = new ArrayList<>();

    public void addProduct(Product product) {
        items.add(product);
        System.out.println("Добавлено в корзину: " + product.getName());
    }

    public void showCart() {
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
            return;
        }

        double total = 0;
        for (Product p : items) {
            System.out.println(p);
            total += p.getPrice();
        }
        System.out.println("Итого: " + total);
    }

    public void checkout() {
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
            return;
        }

        System.out.println("Покупка завершена!");
        items.clear();
    }
}