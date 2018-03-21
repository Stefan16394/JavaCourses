package P03_DependencyInversionSkeleton;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PrimitiveCalculator calculator=new PrimitiveCalculator();

        while (true) {
            String[] input = sc.nextLine().split("\\s+");
            switch (input[0]) {
                case "End":
                    return;
                case "mode":
                    char sign = input[1].charAt(0);
                    calculator.changeStrategy(sign);
                    break;
                default:
                    int result = calculator.performCalculation(Integer.valueOf(input[0]), Integer.valueOf(input[1]));
                    System.out.println(result);
                    break;
            }
        }
    }
}
