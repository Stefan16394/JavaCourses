package L04_Abstraction_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P05_Maximal_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] matrix=new int [rows][cols];
        for(int i=0;i<rows;i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[]numbers=Sum(matrix,rows,cols);
        int sum= Arrays.stream(numbers).sum();
        System.out.printf("Sum = %d",sum);
        System.out.println();
        for (int i=0;i<9;i+=3)
        {
            System.out.printf("%d %d %d",numbers[i],numbers[i+1],numbers[i+2]);
            System.out.println();

        }

    }
    private static int[] Sum (int[][]matrix,int rows,int cols)
    {
        int sum=0;
        int bestSum=-1;
        int[] nums=new int[9];
        for(int i=0;i<rows-2;i++)
        {
            for(int j=0;j<cols-2;j++)
            {
                sum+=matrix[i][j]+matrix[i][j+1]+matrix[i][j+2]+
                     matrix[i+1][j]+matrix[i+1][j+1]+matrix[i+1][j+2]+
                     matrix[i+2][j]+matrix[i+2][j+1]+matrix[i+2][j+2];
                if(sum>bestSum)
                {  bestSum=sum;
                   nums=new int[]{matrix[i][j],matrix[i][j+1],matrix[i][j+2],
                            matrix[i+1][j],matrix[i+1][j+1],matrix[i+1][j+2],
                            matrix[i+2][j],matrix[i+2][j+1],matrix[i+2][j+2]};
                }
                sum=0;
            }

        }
        return nums;

    }

}
