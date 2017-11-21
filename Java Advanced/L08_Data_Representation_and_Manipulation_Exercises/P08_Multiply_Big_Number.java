package L08_Data_Representation_and_Manipulation_Exercises;

import java.math.BigInteger;
import java.util.Scanner;

public class P08_Multiply_Big_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger n=new BigInteger(sc.nextLine());
        BigInteger m=new BigInteger(sc.nextLine());
        BigInteger result=m.multiply(n);
        System.out.println(result);
    }



}
