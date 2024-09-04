import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContactListTest {

    ContactList contactList;
    @BeforeEach
    void setBefore(){
        contactList = new ContactList();
    }

    @Test
    void testAddContact(){
        contactList.addContact("ify", "sunday", "08127980150");
        contactList.addContact("joe", "ogwu", "07034657717");
        assertEquals(2, contactList.contactSize());
    }

    @Test
    void testEditContact(){
        contactList.addContact("ify", "sunday", "08127980150");
        contactList.addContact("joe", "ogwu", "07034657717");
        contactList.editContact("emma", "martin", "08127980150", "07043452060");
        assertEquals("emma", contactList.findContact("07043452060").getFirstName());
        assertEquals("martin", contactList.findContact("07043452060").getLastName());
    }

    @Test
    void testEditNumber(){
        contactList.addContact("ify", "sunday", "08127980150");
        contactList.addContact("joe", "ogwu", "07034657717");
        contactList.editNo("08127980150", "07034657717");
        assertEquals(contactList.findContact("07034657717"), contactList.findContact("07034657717"));
    }

    @Test
    void testRemoveContact(){
        contactList.addContact("ify", "sunday", "08127980150");
        contactList.addContact("joe", "ogwu", "07034657717");
        contactList.removeContact("07034657717");
        assertEquals(1, contactList.contactSize());
    }

    @Test
    void testReturnContactList(){
        contactList.addContact("ify", "sunday", "08127980150");
        contactList.addContact("joe", "ogwu", "07034657717");
        assertEquals(contactList.displayContactList(), contactList.displayContactList());
    }

}
