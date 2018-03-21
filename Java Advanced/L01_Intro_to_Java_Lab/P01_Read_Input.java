package L01_Intro_to_Java_Lab;

import java.util.Scanner;

public class P01_Read_Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String first=sc.next();
        String second=sc.next();
        int firstNum=sc.nextInt();
        int secondNum=sc.nextInt();
        int thirdNum=sc.nextInt();
        sc.nextLine();
        String third=sc.nextLine();

        int result=firstNum+secondNum+thirdNum;
        System.out.println(first+" "+second+ " "+third+" "+result);
    }
}
