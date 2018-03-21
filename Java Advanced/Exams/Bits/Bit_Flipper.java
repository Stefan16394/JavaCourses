package Bits;

import java.math.BigInteger;
import java.util.Scanner;

public class Bit_Flipper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger num=new BigInteger(sc.nextLine());
        BigInteger seven=new BigInteger("7");
        BigInteger zero=new BigInteger("0");

        for (int i=61;i>=2;i--)
        {
            BigInteger shifted=num.shiftRight(i);
            BigInteger bit=shifted.and(seven);
            if(bit.equals(seven)||bit.equals(zero))
            {
                num=num.xor(seven.shiftLeft(i));
                i-=2;
            }

        }
        System.out.println(num);
    }
}
