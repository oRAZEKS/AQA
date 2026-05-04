package Lesson5.Task_3;

import java.util.List;

public class Catalog {
    private String name;
    private List<Product> products;

    public Catalog(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }
}
