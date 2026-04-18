package lesson3;

import java.util.HashMap;

public class work3 {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "c", "c", "a", "b", "f", "s", "a", "b"};
        HashMap<String, Integer> map = new HashMap<>();
        for (String element :arr){
            map.put(element, map.getOrDefault(element,0)+ 1);
        }
        System.out.println(map);
        }
    }
