package P10_Tuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input=sc.nextLine().split(" ");
        Tuple <String,String>tuple=new Tuple<>(input[0]+" "+input[1],input[2]);
        System.out.println(tuple.toString());
        input=sc.nextLine().split(" ");
        Tuple <String,Integer>tuple1=new Tuple<>(input[0],Integer.valueOf(input[1]));
        System.out.println(tuple1.toString());
        input=sc.nextLine().split(" ");
        Tuple <Integer,Double>tuple2=new Tuple<>(Integer.valueOf(input[0]),Double.valueOf(input[1]));
        System.out.println(tuple2.toString());


    }
}
