package L04_Abstraction_Exercises;

import java.util.Scanner;

public class P08_Matrix_shuffling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        String[][] matrix=new String[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                matrix[i][j]=sc.next();
            }
        }
        sc.nextLine();

        while(true)
        {
            String[] commands=sc.nextLine().split(" ");
            if(commands[0].equals("END"))
            {
                break;
            }
            if(commands.length==5 && commands[0].equals("swap")&&
                    Integer.parseInt(commands[1])>=0 &&  Integer.parseInt(commands[1])<rows &&
                    Integer.parseInt(commands[3])>=0 &&  Integer.parseInt(commands[3])<rows &&
                    Integer.parseInt(commands[2])>=0 &&  Integer.parseInt(commands[2])<cols &&
                    Integer.parseInt(commands[4])>=0 &&  Integer.parseInt(commands[4])<cols)
            {

                int i1= Integer.parseInt(commands[1]);
                int j1= Integer.parseInt(commands[2]);
                int i2= Integer.parseInt(commands[3]);
                int j2=Integer.parseInt(commands[4]);
                String swap=matrix[i1][j1];
                matrix[i1][j1]=matrix[i2][j2];
                matrix[i2][j2]=swap;
                Print(matrix,rows,cols);
            }
            else
            {
                System.out.println("Invalid input!");
            }


        }

    }
    private static void Print(String[][] matrix,int rows,int cols)
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
