package Lesson4.Task_1;

public class main {
    static void main(String[] args) {
        Person person1 = new Person();
        person1.move();
        person1.talk();

        Person person2 = new Person("Tom", 25);
        person2.move();
        person2.talk();
    }
}
