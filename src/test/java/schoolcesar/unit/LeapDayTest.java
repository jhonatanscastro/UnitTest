package schoolcesar.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapDayTest {
    @Test
    public void calculate_CommonYear(){
        Assertions.assertEquals("Common Year",LeapDay.calculate(2019));
    }

    @Test
    public void calculate_LeapYear(){
        Assertions.assertEquals("Leap Year",LeapDay.calculate(2020));
    }
}
