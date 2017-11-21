package E05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P02_Jedi_Galaxy {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int[] size= Arrays.stream(sc.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int m=size[0];
        int n=size[1];
        long[][] matrix=new long[m][n];
        fillMatrix(matrix,m,n);
        long sum=0L;
        while (true)
        {
            String[] input=sc.readLine().split(" ");
            if(input[0].equals("Let"))
            {
                break;
            }
            int jediRow=Integer.parseInt(input[0]);
            int jediCol=Integer.parseInt(input[1]);


            input=sc.readLine().split(" ");
            int evilRow=Integer.parseInt(input[0]);
            int evilCol=Integer.parseInt(input[1]);
            if (evilRow >= m) {
                int shiftValue = evilRow - m + 1;
                evilRow -= shiftValue;
                evilCol -= shiftValue;
            }

            if (evilCol >= n) {
                int shiftValue = evilCol - n + 1;
                evilRow -= shiftValue;
                evilCol -= shiftValue;
            }
            while (evilRow >= 0 && evilCol >= 0) {
                matrix[evilRow][evilCol] = 0;
                evilRow--;
                evilCol--;
            }

            if (jediRow >= m) {
                int shiftValue = jediRow - m + 1;
                jediRow -= shiftValue;
                jediCol += shiftValue;
            }

            if (jediCol < 0) {
                int shiftValue = Math.abs(jediCol);
                jediRow -= shiftValue;
                jediCol += shiftValue;
            }
            while (jediRow >= 0 && jediCol < n) {
                sum += matrix[jediRow][jediCol];
                jediRow--;
                jediCol++;
            }

        }
        System.out.println(sum);
    }

    private static void fillMatrix(long[][] matrix,int m,int n)
    {  long num=0;
        for (int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=num;
                num++;
            }
        }
    }

    private static void dead(long[][] matrix,int yI,int yJ)
    {
        while (yI>=0 && yJ>=0)
        {
            matrix[yI][yJ]=0;
            yI--;
            yJ--;
        }
    }
    private static long collect(long[][] matrix,int xI,int xJ,long sum,int n)
    {
        while (xI>=0 && xJ<n)
        {
            sum+= matrix[xI][xJ];
            xI--;
            xJ++;
        }
        return sum;
    }

}