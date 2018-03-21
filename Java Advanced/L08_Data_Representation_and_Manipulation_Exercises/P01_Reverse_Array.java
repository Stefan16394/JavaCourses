package L08_Data_Representation_and_Manipulation_Exercises;


import java.util.Arrays;
import java.util.Scanner;

public class P01_Reverse_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array= Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        reverse(array,0,array.length-1);
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }


    }
    private static void reverse(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverse(arr, start + 1, end - 1);
        }
    }

