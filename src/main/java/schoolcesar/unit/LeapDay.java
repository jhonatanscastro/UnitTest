package schoolcesar.unit;

public class LeapDay {

    public static String calculate(int year) {
        if (year % 4 != 0) {
            return "Common Year";
        }
        else
            return "Leap Year";

    }
}
