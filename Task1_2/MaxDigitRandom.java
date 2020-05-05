package Task1_2;
import java.util.Arrays;

public class MaxDigitRandom {

    public static int getMaxDigit (int number)
    {
        int [] digits = getDigits(number);
        Arrays.sort(digits);
        return digits[digits.length-1];
    }

    public static int[] getDigits(int number)
    {
        int[] digits = new int[Integer.toString(number).length()];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = number % 10;
            number = number / 10;
        }
        return digits;
    }
}
