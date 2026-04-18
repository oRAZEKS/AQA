package lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class work4 {

        public static void main(String[] args) {

            HashMap<String, Integer> stock = new HashMap<>();
            stock.put("Картошка", 30);
            stock.put("Перец", 20);
            stock.put("Кукуруза", 80);

            List<HashMap<String, Integer>> month = new ArrayList<>();

            HashMap<String, Integer> day1 = new HashMap<>();
            day1.put("Картошка", 0);
            day1.put("Перец", 1);
            day1.put("Кукуруза", 0);
            month.add(day1);

            HashMap<String, Integer> day2 = new HashMap<>();
            day2.put("Картошка", 2);
            day2.put("Перец", 1);
            day2.put("Кукуруза", 0);
            month.add(day2);

            HashMap<String, Integer> result = calculateStock(stock, month);

            System.out.println(result);
        }

        public static HashMap<String, Integer> calculateStock(
                HashMap<String, Integer> stock,
                List<HashMap<String, Integer>> month) {

            HashMap<String, Integer> result = new HashMap<>(stock);

            for (HashMap<String, Integer> day : month) {

                for (String product : day.keySet()) {

                    int spent = day.get(product);

                    result.put(product, result.get(product) - spent);
                }
            }

            return result;
        }
    }

