package L13_StreamAPI_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P01_Take_Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.stream(array).filter(x->x>=10 && x<=20)
                .distinct()
                .limit(2)
                .forEach(x-> System.out.print(x+" "));
    }
}
