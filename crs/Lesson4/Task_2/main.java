package Lesson4.Task_2;

import java.util.ArrayList;
import java.util.List;

public class main {
    static void main(String[] args) {
        List<Buyer> buyers = new ArrayList<>();

        buyers.add(new Buyer("Иванов","Иван", "Ивановчи", "Москва", "12345", "111"));
        buyers.add(new Buyer("Сергеев","Сергей", "Сергеевич", "Пермь", "56789", "222"));
        buyers.add(new Buyer("Евгеньев","Евгений", "Евгеньевич", "СПБ", "13579", "333"));
        buyers.add(new Buyer("Максимов","Максим", "Максимович", "Москва", "57913", "444"));
        buyers.add(new Buyer("Морозов","Иван", "Евгеньевич", "Пермь", "08642", "555"));

        Buyer longestLastNameBuyer = buyers.get(0);

        for(Buyer b : buyers){
            if(b.getLastName().length() > longestLastNameBuyer.getLastName().length()){
                longestLastNameBuyer =b;
            }
        }
        System.out.println("Самая длинная фамилия у: " + longestLastNameBuyer.getFirstName());
        System.out.println("Адреса покупателей с картой на 5:");
        for (Buyer b : buyers) {
            if (b.getCreditCardName().startsWith("5")) {
                System.out.println(b.getAddress());
            }
        }

        System.out.println("Покупатели с отчеством Евгеньевич:");
        for (Buyer b : buyers) {
            if (b.getMiddleName().equals("Евгеньевич")) {
                System.out.println(b.getLastName() + " " + b.getFirstName());
            }
        }
    }
    }

