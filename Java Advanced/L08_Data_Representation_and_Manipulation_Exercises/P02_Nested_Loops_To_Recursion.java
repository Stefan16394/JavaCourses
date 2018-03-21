package L08_Data_Representation_and_Manipulation_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class P02_Nested_Loops_To_Recursion {
    private static int numberOfLoops;
    private static int[] loops;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        numberOfLoops=sc.nextInt();
        loops=new int[numberOfLoops];
        simulateLoops(0);

    }

    private static void simulateLoops(int current) {
        if(current==numberOfLoops)
        {
            printLoop();
            return;
        }

        for(int i=1;i<=numberOfLoops;i++)
        {
            loops[current]=i;
            simulateLoops(current+1);
        }
    }

    private static void printLoop() {
        System.out.println(Arrays.toString(loops).replaceAll("[\\]\\[,]",""));
    }


}
