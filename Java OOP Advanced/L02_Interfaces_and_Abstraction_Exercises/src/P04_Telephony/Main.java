package P04_Telephony;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Smartphone smartphone=new Smartphone();
        String[] numbers=sc.nextLine().split("\\s+");
        String[] websites=sc.nextLine().split("\\s+");
        smartphone.call(numbers);
        smartphone.browse(websites);

    }
}
