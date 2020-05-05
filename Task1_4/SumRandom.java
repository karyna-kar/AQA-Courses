package Task1_4;

public class SumRandom {

    public static int[] getDigits(int number)
    {
        int[] digits = new int[Integer.toString(number).length()];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = number % 10;
            number = number / 10;
        }
        return digits;
    }

    public static int countSum(int numbers[])
    {
        int sum=0;
        for (int i : numbers) {
            sum+= i;
        }
        return sum;
    }

    public static int getSum (int number)
    {
        int[] numbers = getDigits(number);
        int sum = countSum(numbers);
        return sum;
    }
}
