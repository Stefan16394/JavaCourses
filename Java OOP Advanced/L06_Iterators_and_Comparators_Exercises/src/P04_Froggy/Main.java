package P04_Froggy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Lake lake=new Lake(Arrays.stream(sc.nextLine().split("[, ]+")).mapToInt(Integer::parseInt).toArray());
        String input=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for (Integer x:lake)
        {
            sb.append(x).append(", ");
        }
        sb.delete(sb.length()-2,sb.length());
        System.out.println(sb.toString());
    }
}
