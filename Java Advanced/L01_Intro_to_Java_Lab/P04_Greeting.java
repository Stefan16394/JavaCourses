package L01_Intro_to_Java_Lab;

import java.util.Scanner;

public class P04_Greeting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String first=sc.nextLine();
        String second=sc.nextLine();
        if(first.isEmpty())
        {
            first="*****";
        }
        if (second.isEmpty())
        {
            second="*****";
        }
        System.out.printf("Hello, %s %s!",first,second);
    }
}
