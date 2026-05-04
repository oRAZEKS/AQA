package Lesson5.Task_2;

public class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Журнал: " + title);
    }

    public String getTitle() {
        return title;
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable p : printable) {
            if (p instanceof Magazine) {
                Magazine magazine = (Magazine) p;
                System.out.println(magazine.getTitle());
            }
        }
    }
}
