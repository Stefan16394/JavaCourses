package L01_Intro_to_Java_Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class P03_Euro_Trip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Double quantity=sc.nextDouble();
        BigDecimal price=new BigDecimal(quantity*1.20);
        BigDecimal stuff=new BigDecimal("4210500000000");
        BigDecimal marks=stuff.multiply(price);
        System.out.printf("%.2f marks",marks );
    }
}
