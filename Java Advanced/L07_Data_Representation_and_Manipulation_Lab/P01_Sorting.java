package L07_Data_Representation_and_Manipulation_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P01_Sorting {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int[] array= Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
     //selection sort
        selectionSort(array);
        System.out.println();
      //bubbleSort
        bubbleSort(array);


    }

    private static void selectionSort(int[] array)
    {
        for(int i=0;i<array.length-1;i++)
        {    int min=array[i];
            int pos=i;
            for(int j=i+1;j<array.length;j++)
            {
                if(array[j]<min)
                {
                    min=array[j];
                    pos=j;
                }
            }
            int swap=array[i];
            array[i]=array[pos];
            array[pos]=swap;

        }
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
    }

    private static void bubbleSort(int[] array)
    {
        while(true) {
            boolean swap=false;
            for (int i = 0; i < array.length-1; i++) {

                if(array[i+1]<array[i])
                {
                    int swapElement=array[i];
                    array[i]=array[i+1];
                    array[i+1]=swapElement;
                    swap=true;
                }
            }
            if(!swap)
            {
                break;
            }
        }
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }

}