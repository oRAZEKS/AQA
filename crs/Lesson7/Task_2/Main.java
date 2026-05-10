package Lesson7.Task_2;

public class Main {
    static void main(String[] args) {
        Student student1 = new Student.Builder()
                .setFirstName("SAM")
                .setLastName("trexer")
                .build();

        Student student2 = new Student.Builder()
                .setUniversity("МГУ")
                .build();

        System.out.println("Студент 1: " + student1 + "\nСтудент 2: " + student2);
    }
}

//Использован паттерн Builder