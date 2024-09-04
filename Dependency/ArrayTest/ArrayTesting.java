import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTesting {

    PersonalList personalList;
    @BeforeEach
    public void beforeTestingBegins(){
        personalList = new MyOwnArrayList();
    }

    @Test
    public void testArrayCanAdd(){
        personalList.add("star");
        personalList.add("boi");
        personalList.add("ify");
        assertEquals("ify", personalList.get(2));
    }

    @Test
    public void testNumberOfElement(){
        personalList.add("star");
        personalList.add("boi");
        personalList.add("ify");
        assertEquals(3, personalList.size());
    }

    @Test
    public void testIfArrayIsEmpty(){
        assertTrue(personalList.isEmpty());
    }

    @Test
    public void testIfArrayIsRemoved(){
        personalList.add("star");
        personalList.add("boi");
        personalList.add("ify");
        personalList.remove(0);
        assertEquals("boi", personalList.get(0));
    }

    @Test
    public void testClear(){
        personalList.add("star");
        personalList.add("boi");
        personalList.add("ify");
        personalList.clear();
        assertTrue(personalList.isEmpty());
    }

    @Test
    public void testRemoveByString(){
        personalList.add("star");
        personalList.add("boi");
        personalList.add("ify");
        personalList.remove("boi");
        assertEquals("star", personalList.get(0));
    }

    @Test
    public void testIfStringContains(){
        personalList.add("star");
        personalList.add("boi");
        personalList.add("ify");
        personalList.contains("boi");
        assertTrue(personalList.contains("boi"));
    }
}
