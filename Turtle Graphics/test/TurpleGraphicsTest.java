import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TurpleGraphicsTest {
    private TurpleGraphics graphic;

    @BeforeEach
    void setState(){
        graphic = new TurpleGraphics();
    }

    @Test
    public void checkIfPenUp(){
        assertTrue(graphic.getCurrentState());
    }

    @Test
    public void bringPenDown(){
        graphic.penDown();
        assertFalse(graphic.getCurrentState());
    }

    @Test
    public void currentDirectionState(){
        assertEquals(Direction.EAST, graphic.getCurrentDirection());
    }

    @Test
    public void turnRigth(){
        graphic.getCurrentDirection();
        graphic.turnDirectionRight();
        assertEquals(Direction.SOUTH, graphic.getCurrentDirection());
        graphic.turnDirectionRight();
        assertEquals(Direction.WEST, graphic.getCurrentDirection());
        graphic.turnDirectionRight();
        assertEquals(Direction.NORTH, graphic.getCurrentDirection());
    }

    @Test
    public void turnLeft(){
       graphic.getCurrentDirection();
       graphic.turnDirectionLeft();
       assertEquals(Direction.NORTH, graphic.getCurrentDirection());
       graphic.turnDirectionLeft();
       assertEquals(Direction.WEST, graphic.getCurrentDirection());
       graphic.turnDirectionLeft();
       assertEquals(Direction.SOUTH, graphic.getCurrentDirection());
    }

    @Test
    public void movingSteps(){
        graphic.getCurrentPosition();
        graphic.getCurrentDirection();
        assertEquals(new Position(0, 5), graphic.moveFoward(5));
    }









}
