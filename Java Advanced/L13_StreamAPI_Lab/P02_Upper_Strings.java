package L13_StreamAPI_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P02_Upper_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] text=sc.nextLine().split(" ");
        Arrays.stream(text).forEach(x-> System.out.printf("%s ",x.toUpperCase()));

    }
}
