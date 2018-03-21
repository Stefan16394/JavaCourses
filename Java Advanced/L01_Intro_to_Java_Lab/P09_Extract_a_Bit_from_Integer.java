package L01_Intro_to_Java_Lab;

import java.util.Scanner;

public class P09_Extract_a_Bit_from_Integer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int mask=n>>p;
        int bit=mask & 1;
        System.out.print(bit);
    }
}
