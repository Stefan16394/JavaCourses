package L01_Intro_to_Java_Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class P07_Product_of_NumbersN_M {
    public static void main(String[] args) {
        BigInteger result=new BigInteger("1");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        for ( int i=num1;i<=num2;i++)
        {   BigInteger num=new BigInteger(""+i);
            result=result.multiply(num);

        }
       System.out.printf("product[%d..%d] = %d",num1,num2,result);
    }
}
