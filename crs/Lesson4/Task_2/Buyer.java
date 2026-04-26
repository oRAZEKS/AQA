package Lesson4.Task_2;

public class Buyer {
    String lastName;
    String firstName;
    String middleName;
    String address;
    String creditCardName;
    String bankAccountNumber;

    public Buyer(String lastName, String firstName, String middleName, String address, String creditCardName,
    String bankAccountNumber){
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.creditCardName = creditCardName;
        this.bankAccountNumber = bankAccountNumber;
    }
public String getLastName(){
        return lastName;
}
    public String getFirstName(){
        return firstName;
    }
    public String getMiddleName(){
        return middleName;
    }
    public String getAddress(){
        return address;
    }
    public String getCreditCardName(){
        return creditCardName;
    }
    public String getBankAccountNumber(){
        return bankAccountNumber;
    }
}
