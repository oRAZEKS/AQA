package Lesson5.Task_2;

public class Book implements Printable{
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Книга: " + title);
    }

    public String getTitle() {
        return title;
    }

    public static void printBooks(Printable[] printable) {
        for (Printable p : printable) {
            if (p instanceof Book) {
                Book book = (Book) p;
                System.out.println(book.getTitle());
            }
        }
    }
}
