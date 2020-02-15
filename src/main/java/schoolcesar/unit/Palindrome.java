package schoolcesar.unit;

//Palindrome é uma palavra que de tras pra frente é a mesma palavra EX: ana
public class Palindrome {
    public static boolean check(String word) {
        int length = word.length();

        if(word.length() <= 1){
            return true;
        }

        if(word.charAt(0) == word.charAt(length -1)){
            return check(word.substring(1,length-1));
        }

        return false;
    }
}
