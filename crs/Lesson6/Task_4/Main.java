package Lesson6.Task_4;

class WrongLoginException extends Exception {

    public WrongLoginException(String message) {
        super(message);
    }
}

class WrongPasswordException extends Exception {

    public WrongPasswordException(String message) {
        super(message);
    }
}

public class Main {

    public static void checkCredentials(
            String login,
            String password,
            String confirmPassword)
            throws WrongLoginException, WrongPasswordException {


        if (!login.matches("^[a-zA-Z0-9_]+$") || login.length() >= 20) {
            throw new WrongLoginException(
                    "Логин должен содержать только латинские буквы, цифры и _, а длина должна быть меньше 20 символов");
        }


        if (!password.matches("^[a-zA-Z0-9_]+$")
                || password.length() >= 20
                || !password.equals(confirmPassword)) {

            throw new WrongPasswordException(
                    "Пароль некорректный или пароли не совпадают");
        }

        System.out.println("Логин и пароль корректны");
    }

    public static void main(String[] args) {

        try {

            checkCredentials(
                    "user_123",
                    "pass_123",
                    "pass_123");

        } catch (WrongLoginException e) {

            System.out.println("Ошибка логина: " + e.getMessage());

        } catch (WrongPasswordException e) {

            System.out.println("Ошибка пароля: " + e.getMessage());
        }
    }
}