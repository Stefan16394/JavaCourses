package L13_StreamAPI_Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08_Bounded_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       List<Integer> bound= Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
       List<Integer> list= Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
       list.stream().filter(n->n>= Collections.min(bound) && n<=Collections.max(bound)).forEach(x-> System.out.print(x+" "));

}
}
