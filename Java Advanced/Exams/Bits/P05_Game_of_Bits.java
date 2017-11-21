package Bits;

import java.util.Scanner;

public class P05_Game_of_Bits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long num=Long.parseLong(sc.nextLine());
        StringBuilder s=new StringBuilder();
        int ones=0;
        while (true)
        {
            String command=sc.nextLine();
            if(command.equals("Game Over!"))
            {
                break;
            }
            if(command.equals("Odd"))
            {
                for (int i=0;i<=30;i+=2)
                {
                    long shifted=num>>i;
                    long bit=shifted&1;
                    s.insert(0,bit);
                }
            }
            else
            {
                for (int i=1;i<=31;i+=2)
                {
                    long shifted=num>>i;
                    long bit=shifted&1;
                    s.insert(0,bit);
                }
            }
            num=Long.parseLong(s.toString(),2);
            s=new StringBuilder();
        }
        for (int i=0;i<32;i++)
        {
            long shifted=num>>i;
            long bit=shifted&1;
            if(bit==1)
            {
                ones++;
            }
        }
        System.out.printf("%d -> %d",num,ones);
    }
}
