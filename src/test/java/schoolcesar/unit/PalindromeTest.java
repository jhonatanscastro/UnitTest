package schoolcesar.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    public void
    palindrome_LenghtEmpty(){
        Assertions.assertTrue(Palindrome.check(""));
    }

    @Test
    public void palindrome_LengthOne(){
        Assertions.assertTrue(Palindrome.check("a"));
    }

    @Test
    public void palindrome_LengthSameStartEnd(){
        Assertions.assertTrue(Palindrome.check("aa"));
    }

    @Test
    public void palindrome_LengthName(){
        Assertions.assertFalse(Palindrome.check("xony"));
    }

    @Test
    public void palindrome_LengthName_SameLetter(){
        Assertions.assertTrue(Palindrome.check("ana"));
    }


}
