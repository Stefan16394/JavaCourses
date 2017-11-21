package L05_String_Processing_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P01_Students_Results {
    public static void main(String[] args) {
        String firstRow=String.format("%1$-10s|%2$7s|%3$7s|%4$7s|%5$7s|","Name","JAdv","JavaOOP","AdvOOP","Average");
        Scanner sc=new Scanner(System.in);

        String[] student=sc.nextLine().split(" - ");
        String name=student[0];
        double[] results= Arrays.stream(student[1].split(", ")).mapToDouble(Double::parseDouble).toArray();
        double average=(results[0]+results[1]+results[2])/3.00;
        String print=String.format("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|",name,results[0],results[1],results[2],average);
        System.out.println();
        System.out.println(firstRow);
        System.out.println(print);



    }
}
