package L13_StreamAPI_Lab;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.Stream;

public class P04_Average_of_Doubles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] numbers= Arrays.stream(sc.nextLine().split(" ")).filter(n->!n.isEmpty()).mapToDouble(Double::valueOf).toArray();
        OptionalDouble optional= Arrays.stream(numbers).average();
        if(optional.isPresent())
        {
            System.out.printf("%.2f",optional.getAsDouble());
        }
        else
            System.out.println("No match");
    }

}
