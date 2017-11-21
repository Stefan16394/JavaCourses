package Bits;

import java.util.Scanner;

public class x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int position =Integer.parseInt(sc.nextLine());
        int times = Integer.parseInt(sc.nextLine());
        int ourBit = number & 1 << position;
        ourBit = ourBit >> position;
        for (int i=0;i<times;i++)
        {

            int tempBit=0;
            int lost=number&1;
            number=number>>1;

            if(lost==1)
            {
                number=number^1<<18;
            }
            else
            {
                number=number&~(1<<18);
                //or do nothing
            }
          //  String s=Integer.toBinaryString(number);
            //System.out.println(s);

            if(position==0)
            {
                 tempBit=number|1<<18;
            }
            else
            {
                tempBit=number>>position& 1;
            }

            if(ourBit!=tempBit)
            {
                if(position==0)
                {
                    number=number^1<<position;
                    number=number^1<<18;
                }
                else {
                    number=number^1<<position;
                    number=number^1<<position-1;
                }

            }
           // s=Integer.toBinaryString(number);
            //System.out.println(s);

        }
        System.out.println(number);
    }
}
