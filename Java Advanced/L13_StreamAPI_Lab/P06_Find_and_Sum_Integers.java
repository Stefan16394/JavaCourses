package L13_StreamAPI_Lab;

import java.io.IOException;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class P06_Find_and_Sum_Integers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        OptionalInt text= Arrays.stream(sc.nextLine().split(" ")).filter((x)->isNuber(x)).mapToInt(Integer::valueOf)
                                                  .reduce((x,y)->x+y);
        if(text.isPresent())
        {
            System.out.println(text.getAsInt());
        }
        else
            System.out.println("No match");
    }

    private static boolean isNuber(String x) {
        try {
            int s=Integer.parseInt(x);
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }
}
