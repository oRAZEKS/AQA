package Lesson6.Task_3;

public class Main {

    public static void division(int a, int b) {

        try {
            int result = a / b;
            System.out.println("Результат деления: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Произошло деление на ноль");
        }
    }

    public static void main(String[] args) {

        division(10, 2);
        division(10, 0);
    }
}