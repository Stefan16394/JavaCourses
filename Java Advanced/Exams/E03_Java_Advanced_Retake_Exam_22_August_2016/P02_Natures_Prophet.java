package E03_Java_Advanced_Retake_Exam_22_August_2016;

import java.util.Scanner;

public class P02_Natures_Prophet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] matrix=new int[n][m];
        fillMatrix(n,m,matrix);
        sc.nextLine();
        while (true)
        {
            String[] input=sc.nextLine().split(" ");
            if(input[0].equals("Bloom"))
            {
                break;
            }
            int indexI=Integer.parseInt(input[0]);
            int indexJ=Integer.parseInt(input[1]);

            bloomStuff(indexI,indexJ,matrix,n,m);


        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


    }

    private static void bloomStuff(int indexI,int indexJ,int[][] matrix,int n,int m)
    {
            for(int i=0;i<n;i++)
            {
                matrix[indexI][i]+=1;
            }


          for(int i=0;i<m;i++)
           {
            matrix[i][indexJ]+=1;
           }
           matrix[indexI][indexJ]-=1;
    }

    private static void fillMatrix(int n,int m,int[][] matrix)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j]=0;
            }
        }
    }
}
