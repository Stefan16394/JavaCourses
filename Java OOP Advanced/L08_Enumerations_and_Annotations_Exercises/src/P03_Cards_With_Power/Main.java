package P03_Cards_With_Power;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String rank=reader.readLine();
        String power=reader.readLine();

        System.out.print(String.format("Card name: %s of %s; Card power: %d",rank,power,
                RankPowers.valueOf(rank).getPower()+ SuitPowers.valueOf(power).getPower()));
    }
}
