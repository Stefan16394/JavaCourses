package P05_Card_compareTo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        Card card1=enterCard(reader);
        Card card2=enterCard(reader);
        if (card2.compareTo(card1)<0)
        {
            System.out.println(card2.toString());
        }
        else
            System.out.println(card1.toString());
    }

    private static Card enterCard(BufferedReader reader) throws IOException {
        String rank=reader.readLine();
        String power=reader.readLine();
        return new Card(rank,power);
    }
}
