package Lesson5.Task_4;

public class Main {
    public static void main(String[] args) {

        // б) Ссылка типа Student на объект Aspirant
        Student st = new Aspirant("Иван", "Иванов", "A1", 5.0, "AI Research");

        // г) Массив Student
        Student[] students = {
                new Student("Петр", "Петров", "B1", 4.5),
                new Aspirant("Анна", "Сидорова", "C1", 5.0, "Physics"),
                new Student("Олег", "Иванов", "D1", 5.0),
                new Aspirant("Мария", "Козлова", "E1", 4.0, "Math")
        };

        // Вызов метода
        for (Student s : students) {
            System.out.println(s.firstName + " " + s.lastName +
                    " получает стипендию: " + s.getScholarship());
        }
    }
}