package Lesson4.Task_1;

public class Person {
    String fullName;
    int age;

    public Person(){
        this.fullName = "Нету значения";
        this.age = 0;
    }
    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }
    public void move(){
        System.out.println("Такой-то " + fullName + " прыгает");
    }

    public void talk(){
        System.out.println("Такой-то " +fullName + " Говорит");
    }
}
