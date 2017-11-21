package L04_Abstraction_Exercises;

import java.util.Scanner;

public class P12_To_the_Stars {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] first=sc.nextLine().split(" ");
        String firstStarName=first[0];
        double firstStarX=Double.parseDouble(first[1]);
        double firstStarY=Double.parseDouble(first[2]);

        String[] second=sc.nextLine().split(" ");
        String secondStarName=second[0];
        double secondStarX=Double.parseDouble(second[1]);
        double secondStarY=Double.parseDouble(second[2]);

        String[] third=sc.nextLine().split(" ");
        String thirdStarName=third[0];
        double thirdStarX=Double.parseDouble(third[1]);
        double thirdStarY=Double.parseDouble(third[2]);

        double startX=sc.nextDouble();
        double startY=sc.nextDouble();
        int moves=sc.nextInt();
        for(int i=0;i<=moves;i++) {
            if (isInStarSystem(firstStarX, firstStarY, startX, startY))
            {
                System.out.println(firstStarName.toLowerCase());
            }
            else if (isInStarSystem(secondStarX, secondStarY, startX, startY))
            {
                System.out.println(secondStarName.toLowerCase());

            }
            else if(isInStarSystem(thirdStarX,thirdStarY,startX,startY))
            {
                System.out.println(thirdStarName.toLowerCase());

            }
            else
            {
                System.out.println("space");
            }

            startY++;

        }

    }

    private static boolean isInStarSystem(double x,double y,double startX,double startY)
    {
        return startX >= x - 1 && startX <= x + 1 && startY >= y - 1 && startY <= y + 1;
    }


}
