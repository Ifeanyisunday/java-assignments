import java.util.ArrayList;

public class ContactList {
    private ArrayList<PhoneBookClass> contacts = new ArrayList<>();

    public void addContact(String firstName, String lastName, String phoneNo) {
        PhoneBookClass newContact = new PhoneBookClass(firstName, lastName, phoneNo);
        contacts.add(newContact);
    }

    public void editContact(String name1, String name2, String number){
        PhoneBookClass contactToEdit = findContact(number);
        contactToEdit.editContact(name1, name2, number);
    }

    public void editNo(String currentPhoneNo, String newPhoneNo){
        PhoneBookClass numberToEdit = findContact(currentPhoneNo);
        numberToEdit.editNumber(newPhoneNo);
    }

    public void removeContact(String phoneNo){
        for(PhoneBookClass contact : contacts){
            boolean contactIsFound = phoneNo.equals(contact.getPhoneNumber());
            if(contactIsFound){contacts.remove(contact);}
        }
    }

    public String displayContactList(){
        for(PhoneBookClass element : contacts){
            return element.toString();
        }
        return null;
    }


    public PhoneBookClass findContact(String phoneNo){
        for(PhoneBookClass contact : contacts){
            boolean contactIsFound = phoneNo.equals(contact.getPhoneNumber());
            if(contactIsFound){return contact;}
        }
        return null;
    }
}

