package lesson2;

public class Work_2 {
    static void main(String[] args) {

        int n =20;
        int count = 0;

        for(int a = 1; a <= n; a++) {
            if (a % 2 != 0 && a % 3 != 0 && a % 5 !=0){
                count++;
            }
        }
        System.out.println("не делятся на 2,3,5 " + " : " + count +  " чисел");
    }
}
