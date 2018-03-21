package P04_Generic_Swap_Method_Integers;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.valueOf(sc.nextLine());
        Box box=new Box();

        for (int i=0;i<n;i++)
        {
            box.getValues().add(Integer.valueOf(sc.nextLine()));
        }
        int[] indexes= Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        box.swap(indexes[0],indexes[1]);
        System.out.print(box.toString());
    }
}
