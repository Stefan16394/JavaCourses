package L01_Intro_to_Java_Lab;

import java.util.Scanner;

public class P05_TransportPrice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int kilometers=Integer.parseInt(sc.nextLine());
        String time=sc.nextLine();
        double price=0;
        if(kilometers>=20 && kilometers<100)
        {
            price=0.09*kilometers;
        }
        else if(kilometers>=100)
        {
            price=0.06*kilometers;
        }
        else {
            price = 0.70;
            if(time.equals("day"))
            {
                price=price+0.79*kilometers;
            }
            else
                price=price+0.90*kilometers;
        }

 System.out.printf("%.2f",price);

    }
}
