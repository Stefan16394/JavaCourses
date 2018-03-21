package P08_Card_Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        Map<String,List<Card>> players=new LinkedHashMap<>();
        String player1=reader.readLine();
        String player2=reader.readLine();
        players.put(player1,new ArrayList<>());
        players.put(player2,new ArrayList<>());
        List<String> drawnCards=new ArrayList<>();

        for (int i=0;i<2;i++)
        {
            int handCounter=0;
            while (handCounter<5)
            {
               try {
                   String[] input=reader.readLine().split(" of ");
                   String rank=input[0].toUpperCase();
                   String power=input[1].toUpperCase();
                   Card card=new Card(rank,power);

                   if (drawnCards.contains(rank+" of "+power))
                   {
                       System.out.println("Card is not in the deck.");
                   }
                   else
                   {
                       if (i==0)
                       {
                          players.get(player1).add(card);
                       }
                       else
                       {
                           players.get(player2).add(card);
                       }
                       drawnCards.add(card.toString());
                       handCounter++;
                   }
               }
               catch (IllegalArgumentException e)
               {
                   System.out.println("No such card exists.");
               }

            }
        }

        players.get(player1).sort(new ComparatorS());
        players.get(player2).sort(new ComparatorS());
        int bestplayer1=players.get(player1).get(0).calculatePower();
        int bestplayer2=players.get(player2).get(0).calculatePower();
        String winner=bestplayer1>bestplayer2 ? player1:player2;
        Card winingCard=players.get(winner).get(0);
        System.out.printf("%s wins with %s.",winner,winingCard.toString());

    }

}
