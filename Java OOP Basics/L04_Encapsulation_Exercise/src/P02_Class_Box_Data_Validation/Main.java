package P02_Class_Box_Data_Validation;

import java.util.Scanner;

public class Main{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            double length=Double.parseDouble(sc.nextLine());
            double width=Double.parseDouble(sc.nextLine());
            double height=Double.parseDouble(sc.nextLine());
           try {
              Box box=new Box(length,width,height);
               System.out.printf("Surface Area - %.2f\n" +
                       "Lateral Surface Area - %.2f\n" +
                       "Volume - %.2f\n",box.surfaceArea(),box.lateralSurfaceArea(),box.volume());
           }
           catch (IllegalArgumentException e)
           {
               System.out.println(e.getMessage());
           }


        }
}
