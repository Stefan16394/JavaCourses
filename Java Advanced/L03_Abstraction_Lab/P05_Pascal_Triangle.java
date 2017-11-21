package L03_Abstraction_Lab;

import java.util.Scanner;

public class P05_Pascal_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[][] matrix=new long[n][n];
        for(int i=0;i<n;i++)
        {
            matrix[i][0]=1;
            for(int j=1;j<i;j++)
            {
                matrix[i][j]=matrix[i-1][j-1]+matrix[i-1][j];
            }
            matrix[i][i]=1;
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
