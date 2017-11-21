package L04_Abstraction_Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P11_String_Matrix_Rotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String command=sc.nextLine().replaceAll("Rotate","").replace('(',' ').replace(')',' ').trim();
        int degrees=Integer.parseInt(command);
        List<String> list=new ArrayList<>();
        int biggestLenght=0;
        int entries=0;
        while(true)
        {   int lenght=0;
            String word=sc.nextLine();
            if(word.equals("END"))
            {
                break;
            }
            entries++;
            lenght=word.length();
            if(lenght>biggestLenght)
            {
                biggestLenght=lenght;
            }
            list.add(word);
        }
        String [][] matrix=new String[entries][biggestLenght];
        int index=0;
        for (String word:list)
        {   int add=biggestLenght-word.length();
            String repeated = new String(new char[add]).replace("\0", " ");
            word=word+repeated;
            char[] array=word.toCharArray();

                for(int j=0;j<biggestLenght;j++)
                {
                    matrix[index][j]=String.valueOf(array[j]);

                }
            index++;

        }
      int module=degrees%360;
        switch (module)
        {
            case 0:     Rotate0(matrix,entries,biggestLenght);break;
            case 90:      Rotate90(matrix,entries,biggestLenght);break;
            case 180:      Rotate180(matrix,entries,biggestLenght);break;
            case 270:      Rotate270(matrix,entries,biggestLenght);break;

        }


    }
    private static void Rotate0(String[][] matrix,int entries,int biggestLenght)
    {
        for(int i=0;i<entries;i++)
        {
            for(int j=0;j<biggestLenght;j++)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void Rotate90(String[][] matrix,int entries,int biggestLenght)
    {
        for(int j=0;j<biggestLenght;j++)
        {
            for(int i=entries-1;i>=0;i--)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void Rotate180(String[][] matrix,int entries,int biggestLenght)
    {
        for(int i=entries-1;i>=0;i--)
        {
            for(int j=biggestLenght-1;j>=0;j--)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void Rotate270(String[][] matrix,int entries,int biggestLenght)
    {
        for(int j=biggestLenght-1;j>=0;j--)
        {
            for(int i=0;i<entries;i++)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }


}