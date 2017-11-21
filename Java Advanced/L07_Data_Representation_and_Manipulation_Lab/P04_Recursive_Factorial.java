package L07_Data_Representation_and_Manipulation_Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class P04_Recursive_Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factorial(n));
    }
    private static int factorial(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n*factorial(n-1);
    }

}
