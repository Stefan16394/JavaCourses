package L01_Intro_to_Java_Lab;

import java.util.Scanner;

public class P10_ModifyBit {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int p=sc.nextInt();
            int value=sc.nextInt();
            if(value==0) {
                int mask=~(1<<p);
                int result=n&mask;
                System.out.print(result);
            }
            else {
                int mask=1<<p;
                int result=n|mask;
                System.out.print(result);
            }

        }

    }


