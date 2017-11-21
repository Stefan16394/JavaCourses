package L03_Abstraction_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P02_Encrypt_Sort_and_Print_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String[] array=new String[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextLine();
        }
        Integer[] sortedArray=Calculate(array);
        Arrays.sort(sortedArray);
        for (int num:sortedArray) {
            System.out.println(num);
        }

    }
    private static Integer[] Calculate(String[] array)
    {   Integer[] newArray=new Integer[array.length];
        for(int i=0;i<array.length;i++)
        {   int result=0;
            String word=array[i];
            for(int j=0;j<word.length();j++)
            {   int toSum=0;
                if(word.charAt(j)=='A'||word.charAt(j)=='E'||word.charAt(j)=='I'||word.charAt(j)=='O'||word.charAt(j)=='U'
                        ||word.charAt(j)=='a'||word.charAt(j)=='e'||word.charAt(j)=='i'||word.charAt(j)=='o'||word.charAt(j)=='u')
                {
                     toSum=word.charAt(j)*word.length();

                }
                else
                {
                     toSum=word.charAt(j)/word.length();

                }
                result+=toSum;
            }

            newArray[i]=result;

        }
        return newArray;
    }
}