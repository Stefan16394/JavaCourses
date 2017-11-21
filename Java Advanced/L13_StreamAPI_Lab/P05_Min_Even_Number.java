package L13_StreamAPI_Lab;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Scanner;

public class P05_Min_Even_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] array= Arrays.stream(sc.nextLine().split(" ")).filter(n->!n.isEmpty()).mapToDouble(Double::parseDouble).toArray();
        OptionalDouble optional= Arrays.stream(array).filter(n->n%2==0).min();
        if(optional.isPresent())
        {
            System.out.printf("%.2f",optional.getAsDouble());
        }
        else
            System.out.println("No match");
    }
}
