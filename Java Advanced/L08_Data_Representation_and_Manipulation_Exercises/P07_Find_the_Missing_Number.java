package L08_Data_Representation_and_Manipulation_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P07_Find_the_Missing_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int[] numbers=new int[n-1];
        int[] nums= Arrays.stream(sc.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        for(int i=1;i<nums.length;i++)
        {
          numbers[i]=nums[i-1];
        }
        Arrays.sort(numbers);

    }
    private static int missingNumber(int[]numbers,int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(numbers[i]!=i)
            {
                return i;
            }
        }
        return 0;
    }


}
