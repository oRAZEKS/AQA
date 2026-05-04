package Lesson5.Task_2;

public class main {
    static void main(String[] args) {
        Printable[] items = {
                new Book("Война и мир"),
                new Magazine("Forbes"),
                new Book("1984"),
                new Magazine("National Geographic")
        };

        // Вызов print() для всех объектов
        for (Printable item : items) {
            item.print();
        }

        System.out.println("Только книги:");
        Book.printBooks(items);

        System.out.println("Только журналы:");
        Magazine.printMagazines(items);
    }
}
