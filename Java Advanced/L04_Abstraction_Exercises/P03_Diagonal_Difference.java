package L04_Abstraction_Exercises;

import java.util.Scanner;

public class P03_Diagonal_Difference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int[][] matrix=new int[n][n];
        for(int i=0;i<n;i++)
        {
         for(int j=0;j<n;j++)
         {
             matrix[i][j]=sc.nextInt();
         }
        }
        int primarySum=primaryDiagonal(matrix,n);
        int secondarySum=secondaryDiagonal(matrix,n);
        int difference= Math.abs(primarySum-secondarySum);
        System.out.println(difference);
    }

    private static int primaryDiagonal(int[][] matrix,int size)
    {
        int sum=0;
        for(int i=0;i<size;i++)
        {
            sum+=matrix[i][i];
        }
        return sum;
    }

    private static int secondaryDiagonal(int[][] matrix,int size)
    {
        int sum=0;
        for(int i=0;i<size;i++)
        {
            sum+=matrix[i][size-1-i];

        }
        return sum;
    }
}