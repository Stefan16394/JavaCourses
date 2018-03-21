package L04_Abstraction_Exercises;

import java.util.Scanner;

public class P01_Fill_the_Matrix {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String[] input=sc.nextLine().split(", ");
     int n=Integer.parseInt(input[0]);
     String pattern=input[1];
     if(pattern.equals("A"))
     {
         int[][] finalMatrix=patternA(n);
         print(finalMatrix,n);
     }
     else
     {
         int[][] finalMatrix = patternB(n);
         print(finalMatrix,n);
     }


    }

    private static int[][] patternA(int size)
    {
        int[][] matrix=new int[size][size];
        int start=1;
        for (int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                matrix[j][i]=start;
                start++;
            }
        }
        return matrix;
    }

    private static int[][] patternB(int size)
    {
        int[][] matrix=new int[size][size];
        int start=1;
        for (int i=0;i<size;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<size;j++)
                {
                    matrix[j][i]=start;
                    start++;
                }

            }
            else
            {
                for(int j=size-1;j>=0;j--)
                {
                    matrix[j][i]=start;
                    start++;
                }
            }

        }
        return matrix;
    }

    private static void print(int[][] matrix,int size)
    {
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
