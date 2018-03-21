package L08_Data_Representation_and_Manipulation_Exercises;

import java.math.BigInteger;
import java.util.Scanner;

public class P04_Combinations_Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(getCombinationsCount(n, k));

    }
    private static BigInteger getCombinationsCount(int n, int k) {
        BigInteger divisible = getFactorial(new BigInteger(String.valueOf(n)));
        BigInteger divisor = getFactorial(new BigInteger(String.valueOf(n - k))).multiply(getFactorial(new BigInteger(String.valueOf(k))));
        return divisible.divide(divisor);
    }
    private static BigInteger getFactorial(BigInteger n) {
        if (n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }

        return n.multiply(getFactorial(n.subtract(BigInteger.ONE)));
    }
}
