package Lesson7.Task_1;

public class Main {
    static void main(String[] args) {
        Earth e1 = Earth.getInstance();
         Earth e2 = Earth.getInstance();

         System.out.println(e1==e2);
    }
}

/* Использован паттерн проектирования Singleton */