package P07_Deck_of_Cards;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for (SuitPowers suits:SuitPowers.values())
        {
            for (RankPowers powers:RankPowers.values())
            {
                System.out.printf("%s of %s\n",powers.name(),suits.name());
            }
        }
    }

    private static Card enterCard(BufferedReader reader) throws IOException {
        String rank=reader.readLine();
        String power=reader.readLine();
        return new Card(rank,power);
    }
}
