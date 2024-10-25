import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FunctionTest {
    @Test
    public void testArr(){
        Function function = new Function();
        int[] numbers = {4, 5, 8, 8, 8, 2, 9};
        assertEquals("[false, true, false, false, false, false, true]", function.displayTrueOrFalse(numbers));
    }

    @Test
    public void testStr(){
        StringArray alpha = new StringArray();
        String letters = "wood";
        assertTrue(alpha.checkAlphabet(letters));
    }

    @Test
    public void testRegexEmail(){
        StringRegex stringRegex = new StringRegex();
        String email = "sundayjnr10@gmail.com";
        assertTrue(stringRegex.emailValidation(email));
    }

    @Test
    public void testRegexPhoneNo(){
        StringRegex stringRegex = new StringRegex();
        String phoneNo = "08127980150";
        assertTrue(stringRegex.phoneNoValidation(phoneNo));
    }

}
