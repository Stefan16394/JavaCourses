package L04_Abstraction_Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P10_Plus_Remove {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> listWords=new ArrayList<>();
        int maxl=0;
        while(true)
        {
            String word=sc.nextLine();
            int wordL=word.length();
            if(wordL>maxl)
            {
                maxl=wordL;
            }
            if(word.equals("END"))
            {
                break;
            }
           listWords.add(word);
        }
        int rows=listWords.size();
        int cols=maxl;
        Character[][] matrix=new Character[rows][cols];
        boolean[][] matrix2=new boolean[rows][cols];
        for(int i=0;i<rows;i++)
        {   String word=listWords.get(i);
            int size=maxl-word.length();
            String repeated = new String(new char[size]).replace("\0", " ");
            word=word+repeated;
            char[] wordArray=word.toCharArray();

            for(int j=0;j<maxl;j++)
            {
                matrix[i][j]=wordArray[j];
                matrix2[i][j]=true;
            }
        }

        //
        StringBuilder toAdd=new StringBuilder();
        for(int i=0;i<rows-2;i++)
        {
            for(int j=1;j<cols-1;j++)
            {
             char first=Character.toLowerCase(matrix[i][j]);
             char second=Character.toLowerCase(matrix[i+1][j]);
             char third=Character.toLowerCase(matrix[i+2][j]);
             char fourthl=Character.toLowerCase(matrix[i+1][j-1]);
             char fifthr= Character.toLowerCase(matrix[i+1][j+1]);
             if(first==second && first==third && first==fourthl && first==fifthr)
              {
                 matrix2[i][j]=false;
                 matrix2[i+1][j]=false;
                 matrix2[i+2][j]=false;
                 matrix2[i+1][j-1]=false;
                 matrix2[i+1][j+1]=false;
              }
             }
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(matrix2[i][j])
                {
                    System.out.print(matrix[i][j]);
                }
            }
            System.out.println();
        }
    }
}
