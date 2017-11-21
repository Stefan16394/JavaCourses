package L02_Intro_To_Java_Exercises;

import java.util.Scanner;

public class P04_Calculate_Expression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double F1=Math.pow((a*a+b*b)/(a*a-b*b),(a+b+c)/Math.sqrt(c));
        double F2=Math.pow(Math.pow(a,2)+Math.pow(b,2)-Math.pow(c,3),a-b);
        double F3=Math.abs(((a+b+c)/3.00)-((F1+F2)/2.00));
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",F1,F2,F3);

    }
}