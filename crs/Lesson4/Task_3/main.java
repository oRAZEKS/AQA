package Lesson4.Task_3;

public class main {
    static void main(String[] args) {
        Reader reader1 = new Reader(
                "Иванов И.И.",
                12345,
                "ФФФ",
                "26.04.2026",
                "+123456789"
        );

        reader1.takeBook(2);

        reader1.takeBook("Приключения", "Словарь");


        Book b1 = new Book("Приключения", "Автор1");
        Book b2 = new Book("Словарь", "Автор2");

        reader1.takeBook(b1, b2);


        reader1.returnBook(1);
        reader1.returnBook("Приключения", "Словарь");
        reader1.returnBook(b2);
    }
}

