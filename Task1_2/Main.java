package Task1_2;

import static Task1_2.MaxDigitRandom.getMaxDigit;

public class Main {
    public static void main(String[] args) {
        int number = (new java.util.Random(100)).nextInt(999);
        System.out.println("Generated number:"+ number);
        System.out.println("Max digit:" + getMaxDigit(number));
    }
}
