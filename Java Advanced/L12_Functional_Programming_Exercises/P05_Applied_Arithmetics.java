package L12_Functional_Programming_Exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class P05_Applied_Arithmetics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] numbers= Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Function<Integer,Integer> operation;
        while (true)
        {
            String command=sc.nextLine();
            if(command.equals("end"))
            {
                break;
            }
            if(command.equals("print"))
            {
                Consumer<Integer> print=printNumbers(numbers);
                System.out.println();
            }
            else {
                operation = getOperation(numbers,command);
                for(int i=0;i<numbers.length;i++)
                {
                    numbers[i]=operation.apply(numbers[i]);
                }
            }
        }
    }

    private static Consumer<Integer> printNumbers(int[] numbers) {
        for (Integer x:numbers)
        {
            System.out.print(x+" ");
        }
        return null;
    }

    private static Function<Integer,Integer> getOperation(int[] numbers,String command) {
        switch (command){
            case "add":
                return x->x+1;
            case "multiply":
                return x->x*2;
            case "subtract":
                return x->x-1;

        }
        return null;
    }
}
