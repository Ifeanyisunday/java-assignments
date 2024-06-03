import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {

    @Test
    public void turnOn(){
        Television samsung = new Television();
        assertTrue(samsung.switchOn());
    }

    @Test
    public void turnOff(){
        Television samsung = new Television();
        assertFalse(samsung.switchOff());
    }

    @Test
    public void changeChannelsByIncrement(){
        Television samsung = new Television();
        assertEquals("Channel 2", samsung.changeChannelByIncreasingNumber(1));
    }

    @Test
    public void changeChannelsByDecrement(){
        Television samsung = new Television();
        assertEquals("Channel 5", samsung.changeChannelByDecreasingNumber(6));
    }

    @Test
    public void checkIfChannelIsExact(){
        Television samsung = new Television();
        assertEquals("Channel 5", samsung.exactChannel(5));
    }
}
