package Lesson4.task_4;

import java.util.List;

public class Main {
    static void main(String[] args) {
        Labrary library = new Labrary();


        library.addBook(new Book("Война и мир", "Толстой", 1869));
        library.addBook(new Book("Преступление и наказание", "Достоевский", 1866));
        library.addBook(new Book("Анна Каренина", "Толстой", 1877));
        library.addBook(new Book("Мастер и Маргарита", "Булгаков", 1967));

        System.out.println("Все книги:");
        library.printAllBooks();


        System.out.println("\nКниги Толстого:");
        List<Book> tolstoyBooks = library.findByAuthor("Толстой");
        for (Book b : tolstoyBooks) {
            System.out.println(b);
        }


        System.out.println("\nКниги 1866 года:");
        List<Book> books1866 = library.findByYear(1866);
        for (Book b : books1866) {
            System.out.println(b);
        }


        System.out.println("\nСортировка по названию:");
        library.sortByTitle();
        library.printAllBooks();


        library.removeBook(new Book("Анна Каренина", "Толстой", 1877)); // ⚠️ не сработает (объяснение ниже)
    }
}

