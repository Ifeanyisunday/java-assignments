import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class HugeIntegerTest {


    @Test
    public void testThatClassCanTakeDigitsLength40(){
        HugeInteger h = new HugeInteger("123635454547758659908068324243454");
        assertEquals("123635454547758659908068324243454", h.parse("123635454547758659908068324243454"));
    }


    @Test
    public void testThatClassCanAddTwoHugeIntegers(){
        HugeInteger h = new HugeInteger("23322435366112838");
    }
}
