package L04_Abstraction_Exercises;

import java.util.Scanner;

public class P04_Squares_In_Matrix2X2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        String[][] matrix=new String [rows][cols];
        for(int i=0;i<rows;i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.next();
            }
        }
        System.out.println(Search(matrix,rows,cols));

    }
    private static int Search (String[][]matrix,int rows,int cols)
    {   int counter=0;
        for(int i=0;i<rows-1;i++)
        {
            for(int j=0;j<cols-1;j++)
            {
                if(matrix[i][j].equals(matrix[i+1][j])&& matrix[i][j].equals(matrix[i][j+1])&&
                        matrix[i][j].equals(matrix[i+1][j+1]))
                {
                    counter++;
                }
            }
        }
        return counter;
    }

}
