import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    Television samsung;

    @BeforeEach
    public void setAll(){
        samsung = new Television();
    }

    @Test
    public void checkIfItsOn(){
        samsung.getIsOn();
        samsung.switchOn();
        assertTrue(samsung.getIsOn());
    }

    @Test
    public void checkIfItsOff(){
        samsung.getIsOn();
        samsung.switchOff();
        assertFalse(samsung.getIsOn());
    }

    @Test
    public void changeChannel(){
        samsung.initialChannelState();
        samsung.changeChannelStateByEnteringNumber(50);
        assertEquals(50, samsung.initialChannelState());
    }

    @Test
    public void changeChannelByIncreasing(){
        samsung.initialChannelState();
        samsung.changeChannelByIncreasingNumber();
        assertEquals(1, samsung.initialChannelState());
    }

    @Test
    public void changeChannelBydecreasing(){
        samsung.initialChannelState();
        samsung.changeChannelByDecreasingNumber();
        samsung.changeChannelByIncreasingNumber();
        samsung.changeChannelByIncreasingNumber();
        samsung.changeChannelByDecreasingNumber();
        samsung.changeChannelByDecreasingNumber();
        samsung.changeChannelByDecreasingNumber();
        assertEquals(0, samsung.getChannelState());
    }

}
