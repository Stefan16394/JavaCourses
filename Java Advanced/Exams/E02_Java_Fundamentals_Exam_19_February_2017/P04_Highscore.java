package E02_Java_Fundamentals_Exam_19_February_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class P04_Highscore {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashMap<String,Long> totalValues=new LinkedHashMap<>();
        LinkedHashMap<String,List<String>> players=new LinkedHashMap<>();

        while (true)
        {
            String[] input=sc.readLine().split("<->");
            if(input[0].equals("osu!"))
            {
                break;
            }

            String firstOpponent=input[0].split(" ")[1];
            Long firstPoints=Long.parseLong(input[0].split(" ")[0]);

            String secondOpponent=input[1].split(" ")[0];
            Long secondPoints=Long.parseLong(input[1].split(" ")[1]);

            fillDictionary(players,firstOpponent,secondOpponent,firstPoints,secondPoints);
            fillDictionary(players,secondOpponent,firstOpponent,secondPoints,firstPoints);

            fillValues(totalValues,firstOpponent,secondOpponent,firstPoints,secondPoints);
            fillValues(totalValues,secondOpponent,firstOpponent,secondPoints,firstPoints);

        }
        totalValues=totalValues.entrySet().stream().sorted((x,y)-> {
           Long first=x.getValue();
           Long second=y.getValue();
           return second.compareTo(first);
        }).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue
                ,(a,b)->a,LinkedHashMap::new));
        for (Map.Entry<String, Long> kv:totalValues.entrySet())
        {
            System.out.printf("%s - (%d)\n",kv.getKey(),kv.getValue());

            players.entrySet().stream().filter(x->x.getKey().equals(kv.getKey()))
                    .forEach(y->y.getValue().forEach(c->
                    {
                        System.out.println(c);

                    }));

        }
    }
    private static void fillDictionary( LinkedHashMap<String,List<String>> players,
                                       String player,String opponent,Long playerPts,Long opponentPts)
    {
        if(!players.containsKey(player))
        {

            Long score= playerPts-opponentPts;
            List<String> c=new ArrayList<>();
            String x=String.format("*   %s <-> %d",opponent,score);
            c.add(x);
            players.put(player,c);
        }
        else
        {
            List<String> c=players.get(player);
            Long score= playerPts-opponentPts;
            String x=String.format("*   %s <-> %d",opponent,score);
            c.add(x);
            players.put(player,c);
        }
    }

    private static void fillValues(  LinkedHashMap<String,Long> totalValues,
                                        String player,String opponent,Long playerPts,Long opponentPts)
    {
       if(!totalValues.containsKey(player))
       {
           Long score= playerPts-opponentPts;
           totalValues.put(player,score);
       }
       else
       {
           Long score= playerPts-opponentPts;
           totalValues.put(player,totalValues.get(player)+score);
       }
    }

}
