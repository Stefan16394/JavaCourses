package L07_Data_Representation_and_Manipulation_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P02_Searching {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array= Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int number=sc.nextInt();
        //linearSearch
        linearSearch(array,number);
        //binarySearch
        System.out.println(binarySearch(array,number));

    }
    private static void linearSearch(int[] array,int number)
    {
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==number)
            {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);

    }

    private static int binarySearch(int[] array,int number)
    {   Arrays.sort(array);
        int start=0;
        int end=array.length-1;
        while(end>=start)
        {
           int mid=(start+end)/2;
           if(number==array[mid])
           {
               return mid;
           }
           else if(number>array[mid])
           {
               start=mid+1;

           }
           else if(number<array[mid])
           {
               end=mid-1;
           }
        }
        return -1;
    }


}
