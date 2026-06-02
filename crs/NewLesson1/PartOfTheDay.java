package NewLesson1;

public class PartOfTheDay {
    public static void greeting(int hours, int minutes, int seconds, String username) {

        if (hours > 5 && hours < 12){
            System.out.println("Доброе утро, " + username);
        } else if(hours > 12 && hours < 16){
            System.out.println("Добрый день, " + username);
        } else if (hours > 16 && hours < 23){
            System.out.println("Добрый вечер, " + username);
        } else {
            System.out.println("Доброй ночи, " + username);
        }
    }
    public static void main(String[] args) {
        greeting(7, 30, 5, "Tom");
    }
}
