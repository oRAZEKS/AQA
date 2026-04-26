package Lesson4.task_4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Labrary {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }
    public void removeBook(Book book) {
        books.remove(book);
    }
    public List<Book> findByAuthor(String author) {
        List<Book> result = new ArrayList<>();

        for (Book b : books) {
            if (b.getAuthor().equalsIgnoreCase(author)) {
                result.add(b);
            }
        }
        return result;
    }
    public List<Book> findByYear(int year) {
        List<Book> result = new ArrayList<>();

        for (Book b : books) {
            if (b.getYear() == year) {
                result.add(b);
            }
        }
        return result;
    }
    public void sortByTitle() {
        books.sort(Comparator.comparing(Book::getTitle));
    }
    public void sortByAuthor() {
        books.sort(Comparator.comparing(Book::getAuthor));
    }
    public void sortByYear() {
        books.sort(Comparator.comparing(Book::getYear));
    }
    public void printAllBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }
}

