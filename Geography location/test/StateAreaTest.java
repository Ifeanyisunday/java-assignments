import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class StateAreaTest {
    @Test
    public void testIfAreaIsFound(){
        GeographicalState c = GeographicalState.SOUTH_WEST;
        assertEquals(c, StateArea.getRegion("ogun"));
    }
}
