package L03_Abstraction_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class P03_Sum_Matrix_Elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] size=sc.nextLine().split(", ");
        int rows=Integer.parseInt(size[0]);
        int cols=Integer.parseInt(size[1]);
        int[][] matrix=new int[rows][cols];
        int totalSum=0;
        int highestSum=0;
        List<Integer> best=new ArrayList<>();
        for (int i=0;i<rows;i++)
        {
            String[] elements=sc.nextLine().split(", ");
            for(int j=0;j<cols;j++)
            {
                matrix[i][j]=Integer.parseInt(elements[j]);
                totalSum+=matrix[i][j];
            }
        }

        for (int i=0;i<rows-1;i++)
        {
            for(int j=0;j<cols-1;j++)
            {
                int num1=matrix[i][j];
                int num2=matrix[i][j+1];
                int num3=matrix[i+1][j];
                int num4=matrix[i+1][j+1];
                totalSum=num1+num2+num3+num4;
                if(totalSum>highestSum)
                {
                    highestSum=totalSum;
                    best=new ArrayList<>();
                    best.add(num1);
                    best.add(num2);
                    best.add(num3);
                    best.add(num4);
                }
            }
        }
        System.out.printf("%d %d%n%d %d%n",best.get(0),best.get(1),best.get(2),best.get(3));
        System.out.println(highestSum);

    }
}
