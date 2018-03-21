package L02_Intro_To_Java_Exercises;

import java.util.Scanner;

public class P02_Triangle_Area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Ax=sc.nextInt();
        int Ay=sc.nextInt();
        int Bx=sc.nextInt();
        int By=sc.nextInt();
        int Cx=sc.nextInt();
        int Cy=sc.nextInt();
        int result=Math.abs((Ax*(By-Cy)+Bx*(Cy-Ay)+Cx*(Ay-By))/2);
        System.out.println(result);
    }
}
