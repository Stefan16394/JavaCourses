package L02_Intro_To_Java_Exercises;

import java.util.Scanner;

public class P13_Blur_Filter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int blur=Integer.parseInt(sc.nextLine());
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        long[][] matrix=new long[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        int startI=sc.nextInt();
        int startJ=sc.nextInt();
        int counter=-1;
        for(int i=0;i<3;i++)
        {
            if(startI+counter>=0 && startI+counter<rows)
            {
                if(startJ-1>=0)
                {
                    matrix[startI+counter][startJ-1]+=blur;
                }
                if(startJ>=0)
                {
                    matrix[startI+counter][startJ]+=blur;
                }
                if(startJ+1<cols)
                {
                    matrix[startI+counter][startJ+1]+=blur;
                }
            }
            counter++;
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


    }
}

