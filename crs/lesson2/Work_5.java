package lesson2;

public class Work_5 {
    static void main(String[] args) {

        String str = "сегодня мы купили 1 яблоко, 1 грушу и 2 апельсина, 3 пачки кириешек, 2 бутылки воды, 1 пачку чипсов";

        int count1 = 0;
        int count2= 0;
        int count3 = 0;

       for(int i = 0; i < str.length(); i++ ){
           char c = str.charAt(i);
           if( c == '1'){
               count1++;
           } else if (c == '2') {
               count2++;
           } else if (c == '3') {
               count3++;
           }
       }
       System.out.println("1: " + count1);
        System.out.println("2: " + count2);
        System.out.println("3: " + count3);
    }
}
