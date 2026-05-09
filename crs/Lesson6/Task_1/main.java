import java.util.List;
import java.util.function.Predicate;

public class main {

    public static <Type> int countByProperty(List<Type> list, Predicate<Type> predicate) {
        int count = 0;

        for (Type element : list) {
            if (predicate.test(element)) {
                count++;
            }
        }

        return count;
    }


    public static boolean isPrime(Integer number) {
        if (number == null || number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 11, 15);


        int oddCount = countByProperty(numbers, n -> n % 2 != 0);


        int primeCount = countByProperty(numbers, main::isPrime);

        System.out.println("Количество нечетных чисел: " + oddCount);
        System.out.println("Количество простых чисел: " + primeCount);
    }
}