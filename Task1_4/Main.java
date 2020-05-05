package Task1_4;

import static Task1_4.SumRandom.getSum;

public class Main {
    public static void main(String[] args) {
        int number = (new java.util.Random(100)).nextInt(999);
        System.out.println("Generated number:"+ number);
        System.out.println("Sum of digits:" + getSum(number));
    }
}
