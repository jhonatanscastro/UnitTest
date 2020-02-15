package schoolcesar.unit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapDayTest {

    @Test
    public void verifyYear_isLeapYear_True(){
        Assertions.assertTrue(LeapDay.calculateYear(2020));
    }

    @Test
    public void verify_yearDivisible_4(){
        Assertions.assertTrue(LeapDay.calculateYear(16));
    }

    @Test
    public void verify_yearDivisible_100(){
        Assertions.assertFalse(LeapDay.calculateYear(200));
    }

    @Test
    public void verify_yearDivisible_400(){
        Assertions.assertTrue(LeapDay.calculateYear(800));
    }

}