package Bits;

import java.math.BigInteger;
import java.util.Scanner;

public class Shuffle_Bits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long x=Long.parseLong(sc.nextLine());
        long y=Long.parseLong(sc.nextLine());
        StringBuilder s=new StringBuilder();

        if(x>=y)
        {
            for (int i=31;i>=0;i--)
            {

                long num=x>>i;
                long bit=num&1;
                s.append(bit);


                num=y>>i;
                bit=num&1;
                s.append(bit);

            }
        }
        else
        {
            for (int i=31;i>=1;i-=2)
            {

                long num=x>>i;
                long bit=num&1;
                s.append(bit);

                num=x>>i-1;
                bit=num&1;
                s.append(bit);

                num=y>>i;
                bit=num&1;
                s.append(bit);

                num=y>>i-1;
                bit=num&1;
                s.append(bit);
            }
        }
        BigInteger bigNumber = new BigInteger(s.toString(), 2);
        System.out.println(bigNumber);
    }

}
