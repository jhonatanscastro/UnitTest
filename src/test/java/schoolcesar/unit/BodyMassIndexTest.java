package schoolcesar.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BodyMassIndexTest {

    @Test
    public void calculate_bmiUnder17_SeverelyUnderWeight(){
        Assertions.assertEquals("Severely underweight", BodyMassIndex.calculate(16.9f));
    }

    @Test
    public void calculate_bmiBetween17And18Dot5_UnderWeight(){
        Assertions.assertEquals("Underweight", BodyMassIndex.calculate(18.49f));
    }

    @Test
    public void calculate_bmiBetween18And25Dot5_HealthyWeight(){
        Assertions.assertEquals("Healthy Weight", BodyMassIndex.calculate(24.9f));
    }

    @Test
    public void calculate_bmiBetween18And25Dot5_OverWeight(){
        Assertions.assertEquals("OverWeight", BodyMassIndex.calculate(29.9f));
    }



}
