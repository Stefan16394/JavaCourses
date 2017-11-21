package L02_Intro_To_Java_Exercises;

import java.util.Scanner;

public class P03_Formatting_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String hex=Integer.toHexString(a).toUpperCase();
        String abyte=String.format("%10s", Integer.toBinaryString(a)).replace(" ", "0");
        Double b=sc.nextDouble();
        String bString=String.format("%.2f",b);
        int bb=0;
        int cc=0;
        bb=bString.length();
        Double c=sc.nextDouble();
        String cString=String.format("%.3f",c);
        cc=cString.length();
        String repeated1 = new String(new char[10-hex.length()]).replace("\0", " ");
        String repeated2 = new String(new char[10-bb]).replace("\0", " ");
        String repeated3 = new String(new char[10-cc]).replace("\0", " ");
        System.out.printf("|%s%s|%s|%s%.2f|%.3f%s|",hex,repeated1,abyte,repeated2,b,c,repeated3);
    }
}