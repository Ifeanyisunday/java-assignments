import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    @Test
    public void checkTurnOn(){
        Bike mercedes = new Bike();
        assertTrue(mercedes.on());
    }

    @Test
    public void checkTurnOff(){
        Bike mercedes = new Bike();
        assertFalse(mercedes.off());
    }

    @Test
    public void checkAcceleration(){
        Bike mercedes = new Bike();
        mercedes.setSpeed(31);
        assertEquals(34, mercedes.accelerate());
    }

    @Test
    public void checkDecreaseAcceleration(){
        Bike mercedes = new Bike();
        mercedes.setSpeed(29);
        assertEquals(27, mercedes.deceleration());
    }

    @Test
    public void checkGearIncreaseChange(){
        Bike mercedes = new Bike();
        mercedes.setSpeed(30);
        mercedes.accelerate();
        assertEquals("Gear 3", mercedes.setGearIncrease());
    }

    @Test
    public void checkGearDecreaseChange(){
        Bike mercedes = new Bike();
        mercedes.setSpeed(21);
        mercedes.deceleration();
        assertEquals("Gear 1", mercedes.setGearDecrease());
    }

    @Test
    public void switchGearsByExactSpeed(){
        Bike mercedes = new Bike();
        mercedes.setSpeed(45);
        assertEquals("Gear 4", mercedes.switchGear());
    }
}
