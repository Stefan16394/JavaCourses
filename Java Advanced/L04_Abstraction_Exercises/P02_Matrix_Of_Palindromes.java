package L04_Abstraction_Exercises;

import java.util.Scanner;

public class P02_Matrix_Of_Palindromes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        String[][] matrix=new String[rows][cols];
        for(int i=0;i<rows;i++)
        {
            char firstAndlast=(char)(i+97);
            for(int j=0;j<cols;j++)
            {
                char middle=(char)(i+j+97);
                String element=String.format("%c%c%c",firstAndlast,middle,firstAndlast);
                matrix[i][j]=element;
            }
        }
        print(matrix,rows,cols);


    }
    private static void print(String[][] matrix,int rows,int cols)
    {
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
