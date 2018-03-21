package P11_Threeuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input=sc.nextLine().split(" ");
        Tuple <String,String,String>tuple=new Tuple<>(input[0]+" "+input[1],input[2],input[3]);
        System.out.println(tuple.toString());
        input=sc.nextLine().split(" ");
        boolean drunkness=false;
        if (input[2].equals("drunk"))
        {
            drunkness=true;
        }
        Tuple <String,Integer,Boolean>tuple1=new Tuple<>(input[0],Integer.valueOf(input[1]),drunkness);
        System.out.println(tuple1.toString());
        input=sc.nextLine().split(" ");
        Tuple <String,Double,String>tuple2=new Tuple<>(input[0],Double.valueOf(input[1]),input[2]);
        System.out.println(tuple2.toString());


    }
}
