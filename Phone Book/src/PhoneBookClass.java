import java.util.Objects;

public class PhoneBookClass {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    PhoneBookClass(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void editNumber(String number){
        phoneNumber = number;
    }

    public void editContact(String name1, String name2, String number){
        firstName = name1;
        lastName = name2;
        phoneNumber = number;
    }


    @Override
    public String toString(){
        return "PhoneBookClass{" + firstName +" " + lastName + " " + phoneNumber + "}";
    }
}