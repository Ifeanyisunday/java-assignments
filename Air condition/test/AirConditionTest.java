import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionTest {


    @Test
    public void turnOn(){
        AirCondition cooler = new AirCondition();
        cooler.airConditionState(true);
        assertTrue(cooler.on());
    }

    @Test
    public void turnOff(){
        AirCondition cooler = new AirCondition();
        cooler.airConditionState(true);
        assertFalse(cooler.off());
    }

    @Test
    public void checkTemperatureIncrease(){
        AirCondition cooler = new AirCondition();
        if(cooler.on()){
            cooler.airConditionTemperatureState(30);
            assertEquals(31, cooler.increaseTemperature());
        }
    }

    @Test
    public void checkTemperatureDecrease(){
        AirCondition cooler = new AirCondition();
        if(cooler.on()) {
            cooler.airConditionTemperatureState(30);
            assertEquals(29, cooler.decreaseTemperature());
        }
    }

    @Test
    public void display30_IfIncreaseBeyond_30(){
        AirCondition cooler = new AirCondition();
        cooler.airConditionTemperatureState(30);
        assertEquals(30, cooler.temperatureOutOfRange30());
    }

    @Test
    public void display16_IfDecreaseBeyond_16(){
        AirCondition cooler = new AirCondition();
        cooler.airConditionTemperatureState(18);
        assertEquals(17, cooler.temperatureOutOfRange16());
    }
}
