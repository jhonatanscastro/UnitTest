package schoolcesar.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapDayTest {
    @Test
    public void calculate_CommonYear(){
        Assertions.assertEquals("Common Year",LeapDay.calculate(2019));
    }
}
