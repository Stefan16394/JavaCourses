package Bits;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.Scanner;

public class BitRoller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int position =Integer.parseInt(sc.nextLine());
        int times = Integer.parseInt(sc.nextLine());
        int ourBit = number & 1 << position;
        ourBit = ourBit >> position;
        String nInBinary = String.format("%19s", Integer.toBinaryString(number));
        nInBinary = nInBinary.replaceAll(" ", "0");
        StringBuilder s=new StringBuilder(nInBinary);
        char t=s.charAt(18-position);
        s.deleteCharAt(18-position);

        for (int i = 0; i < times; i++) {
            char lostBit=s.charAt(s.length()-1);
            s.deleteCharAt(s.length()-1);
            s.insert(0,lostBit);

        }
        s.insert(18-position,t);
        int num=Integer.parseInt(s.toString(),2);
        System.out.println(num);
    /*     number=number>>1;
         int tempBit=number & 1<<position;
         tempBit=tempBit>>position;
         if(ourBit!=tempBit)
         {
             number=number ^ 1<<position;
             number=number ^ 1<<position-1;
         }
        }
        System.out.println(number);

 ;  */
        ;
    }
    ;
}
