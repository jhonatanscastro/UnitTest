package schoolcesar.unit;

public class LeapDay {

    public static String calculate(int year) {
        if (year % 4 != 0) {
            return "Common Year";
        }
        if (year % 100 != 0) {
            return "Leap Year";
        }
        return "Leap Year";


    }
}
