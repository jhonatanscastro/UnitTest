package schoolcesar.unit;

public class BodyMassIndex {

    public static String calculate(float bmi) {
        if (bmi<17) {
            return "Severely underweight";
        }
        if (bmi<18.5) {
            return "Underweight";
        }
        return "Healthy Weight";

    }
}
