package L08_Data_Representation_and_Manipulation_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P03_Binary_Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array= Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int key=sc.nextInt();
        System.out.println(binarySearch(array,key,0,array.length-1));
    }

    private static int binarySearch(int[] array, int key, int lo, int hi) {
        if(lo<=hi)
        {
        int mid=lo+(hi-lo)/2;
          if(key<array[mid])
          {
             return binarySearch(array,key,lo,mid);
          }
          else if(key>array[mid])
          {
            return  binarySearch(array,key,mid+1,hi);
          }
          else {
              return mid;
          }
        }
        return -1;
    }
}
