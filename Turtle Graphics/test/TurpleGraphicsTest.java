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
        assertEquals("Position{row=0, col=4}", graphic.moveFoward(5));
        graphic.turnDirectionRight();
        assertEquals("Position{row=5, col=4}", graphic.moveFoward(6));
        graphic.turnDirectionRight();
        assertEquals("Position{row=5, col=1}", graphic.moveFoward(3));
    }









}
