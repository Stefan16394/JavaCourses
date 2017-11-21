package P10_MooD_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] input=sc.nextLine().split(" \\| ");
        switch (input[1])
        {
            case "Archangel":
                IArchangel archangel=new Archangel(input[0],Integer.valueOf(input[3]),Integer.valueOf(input[2]));
                System.out.println(archangel.toString());
                break;
            case "Demon":
                IDemon demon=new Demon(input[0],Integer.valueOf(input[3]),Double.valueOf(input[2]));
                System.out.println(demon.toString());
                break;
        }

    }
}
