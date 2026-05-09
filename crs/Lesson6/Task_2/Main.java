package Lesson6.Task_2;

import java.util.Arrays;
import java.util.List;

public class Main {


    public static <Type> void swap(List<Type> list, int a, int b) {


        Type temp = list.get(a);


        list.set(a, list.get(b));
        list.set(b, temp);
    }

    public static void main(String[] args) {

        List<String> words = Arrays.asList("A", "B", "C", "D");

        System.out.println("До обмена: " + words);

        swap(words, 1, 3);

        System.out.println("После обмена: " + words);
    }
}