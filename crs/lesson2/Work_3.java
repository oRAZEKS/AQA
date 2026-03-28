package lesson2;

public class Work_3 {
    static void main(String[] args) {

        String str = " привет, в этой строке лишние пробелы. ";

        str = str.trim();

        str = str.replaceAll(" {3,}", " ");
        str = str.replaceAll("(?<! ) (?! )", " ");

        System.out.println(str);
    }
}
