package P11_Cat_Lady;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Cat> map = new HashMap<>();
        while (true) {
            String[] input = sc.nextLine().split(" ");
            if (input[0].equals("End")) {
                break;
            }
            switch (input[0]) {

                case "Siamese":

                    Cat siamese=new Siamese(input[1],Double.parseDouble(input[2]));
                    map.put(input[1], siamese);
                    break;

                case "Cymric":

                    Cat cymric=new Cymric(input[1],Double.parseDouble(input[2]));
                    map.put(input[1], cymric);
                    break;

                case "StreetExtraordinaire":

                    Cat extraordinaire=new StreetExtraordinaire(input[1],Double.parseDouble(input[2]));
                    map.put(input[1], extraordinaire);
                    break;
            }

        }
        String cat=sc.nextLine();
        Cat cat1=map.get(cat);
        System.out.println(cat1.toString());
    }
}
