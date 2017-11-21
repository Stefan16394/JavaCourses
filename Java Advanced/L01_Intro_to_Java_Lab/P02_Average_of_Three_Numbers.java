package L01_Intro_to_Java_Lab;

import java.util.Scanner;

public class P02_Average_of_Three_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double first=sc.nextDouble();
        double second=sc.nextDouble();
        double third=sc.nextDouble();
        double average=(first+second+third)/3.00;
        System.out.printf("%.2f",average);
    }
}
