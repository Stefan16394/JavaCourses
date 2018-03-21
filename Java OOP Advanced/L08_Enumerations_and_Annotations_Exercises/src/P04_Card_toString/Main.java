package P04_Card_toString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        Card card1=enterCard(reader);
        System.out.println(card1);
    }

    private static Card enterCard(BufferedReader reader) throws IOException {
        String rank=reader.readLine();
        String power=reader.readLine();
        return new Card(rank,power);
    }
}
