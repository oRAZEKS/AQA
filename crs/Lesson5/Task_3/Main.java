package Lesson5.Task_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Пользователь
        User user = new User("admin", "1234");

        // Данные магазина
        Catalog electronics = new Catalog("Электроника", List.of(
                new Product("Телефон", 500),
                new Product("Ноутбук", 1200)
        ));

        Catalog clothes = new Catalog("Одежда", List.of(
                new Product("Футболка", 20),
                new Product("Джинсы", 50)
        ));

        List<Catalog> catalogs = List.of(electronics, clothes);

        Cart cart = new Cart();

        // Аутентификация
        System.out.print("Логин: ");
        String login = scanner.nextLine();
        System.out.print("Пароль: ");
        String password = scanner.nextLine();

        if (!user.authenticate(login, password)) {
            System.out.println("Ошибка авторизации!");
            return;
        }

        System.out.println("Добро пожаловать!");

        Operation operation;

        do {
            System.out.println("Выберите операцию:");
            for (Operation op : Operation.values()) {
                System.out.println(op.ordinal() + " - " + op);
            }

            int choice = scanner.nextInt();
            operation = Operation.values()[choice];

            switch (operation) {
                case VIEW_CATALOGS:
                    for (int i = 0; i < catalogs.size(); i++) {
                        System.out.println(i + " - " + catalogs.get(i).getName());
                    }
                    break;

                case VIEW_PRODUCTS:
                    System.out.print("Выберите каталог: ");
                    int catIndex = scanner.nextInt();
                    List<Product> products = catalogs.get(catIndex).getProducts();

                    for (int i = 0; i < products.size(); i++) {
                        System.out.println(i + " - " + products.get(i));
                    }
                    break;

                case ADD_TO_CART:
                    System.out.print("Каталог: ");
                    int cIndex = scanner.nextInt();
                    List<Product> prods = catalogs.get(cIndex).getProducts();

                    for (int i = 0; i < prods.size(); i++) {
                        System.out.println(i + " - " + prods.get(i));
                    }

                    System.out.print("Выберите товар: ");
                    int pIndex = scanner.nextInt();
                    cart.addProduct(prods.get(pIndex));
                    break;

                case VIEW_CART:
                    cart.showCart();
                    break;

                case CHECKOUT:
                    cart.checkout();
                    break;

                case EXIT:
                    System.out.println("Выход...");
                    break;

                default:
                    break;
            }

        } while (operation != Operation.EXIT);
    }
}