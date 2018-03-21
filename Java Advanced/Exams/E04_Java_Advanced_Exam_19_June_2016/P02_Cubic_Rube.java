package E04_Java_Advanced_Exam_19_June_2016;

import java.util.Arrays;
import java.util.Scanner;

public class P02_Cubic_Rube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        long[][][] matrix=new long[n][n][n];
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int c=0;c<n;c++)
                {
                    matrix[i][j][c]=0L;
                }
            }

        }
        long sumOfParticles=0;
        long unchangedFields= n*n*n;
        while (true)
        {
            String command=sc.nextLine();
            if(command.equals("Analyze"))
            {
                break;
            }
            int[] numbers= Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int pointI=numbers[0];
            int pointJ=numbers[1];
            int pointC=numbers[2];
            int particle=numbers[3];

            if(fieldExist(matrix,pointI,pointJ,pointC,particle))
            {
                sumOfParticles+=particle;
                unchangedFields=unchangedFields-1;
            }
        }
        System.out.println(sumOfParticles);
        System.out.println(unchangedFields);
    }

    private static boolean fieldExist(long[][][] matrix, int pointI, int pointJ, int pointC,int particle) {
       try {
           if(matrix[pointI][pointJ][pointC]==0 &&particle!=0)
            {
                matrix[pointI][pointJ][pointC]+=1;
                return true;
           }
          return false;
       }
       catch (ArrayIndexOutOfBoundsException e)
       {
           return false;
       }

    }
}
