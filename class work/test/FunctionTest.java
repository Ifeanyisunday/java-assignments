import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FunctionTest {
    @Test
    public void testArr(){
        Function function = new Function();
        int[] numbers = {4, 5, 8, 8, 8, 2, 9};
        assertEquals("[false, true, false, false, false, false, true]", function.displayTrueOrFalse(numbers));
    }

}
