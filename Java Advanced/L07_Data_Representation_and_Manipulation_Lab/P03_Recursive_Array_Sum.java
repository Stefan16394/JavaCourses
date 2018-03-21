package L07_Data_Representation_and_Manipulation_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P03_Recursive_Array_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array= Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(sum(array,0));

    }

    private static int sum(int[] array,int startIndex)
    {
        if(startIndex==array.length-1)
        {
            return array[startIndex];
        }
       return array[startIndex]+sum(array,startIndex+1);

    }
}
