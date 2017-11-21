package L03_Abstraction_Lab;

import java.util.Scanner;

public class P01_Triangle_Area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double h=sc.nextDouble();
        double result=CalculateArea(a,h);
        System.out.printf("Area = %.2f",result);
    }
    private static double CalculateArea(double a,double h){
        double area=a*h/2;
        return area;
    }
}