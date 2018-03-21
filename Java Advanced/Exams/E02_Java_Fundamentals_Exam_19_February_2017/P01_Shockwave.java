package E02_Java_Fundamentals_Exam_19_February_2017;

import java.util.Arrays;
import java.util.Scanner;

public class P01_Shockwave {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] dimensions= Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix=new int[dimensions[0]][dimensions[1]];
        fillMatrix(matrix,dimensions[0],dimensions[1]);
        while (true)
        {
            String[] input=sc.nextLine().split(" ");
            if(input[0].equals("Here"))
            {
                break;
            }
            int startI=Integer.parseInt(input[0]);
            int startJ=Integer.parseInt(input[1]);
            int endI=Integer.parseInt(input[2]);
            int endJ=Integer.parseInt(input[3]);

            shockValues(matrix,startI,endI,startJ,endJ);
        }
        print(matrix,dimensions[0],dimensions[1]);

    }

    private static void fillMatrix(int[][] matrix,int n,int m)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j]=0;
            }
        }
    }

    private static void shockValues(int[][] matrix,int startI,int endI,int startJ,int endJ)
    {
        for(int i=startI;i<=endI;i++)
        {
            for(int j=startJ;j<=endJ;j++)
            {
                matrix[i][j]+=1;
            }
        }
    }

    private static void print(int[][] matrix,int n,int m)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }


}
