package lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class work2 {
   public static void main(String[] args) {
        List<String> queue = Arrays.asList("Миша", "Петя", "Катя" ,"Игорь");
        int k = 2;
        int m = 15;
        List<String> result = bankQueue(queue, k, m);
        System.out.println(result);
    }

        public static List<String> bankQueue(List<String> queue, int k, int m){
        int wave = m / 10;
        int start = wave * k;
        int end = Math.min(start + k, queue.size());
if(start >= queue.size()){
    return new ArrayList<>();
} return queue.subList(start,end);
    }
}
