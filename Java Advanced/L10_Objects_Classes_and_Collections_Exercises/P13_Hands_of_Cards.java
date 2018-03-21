package L10_Objects_Classes_and_Collections_Exercises;

import java.util.*;

public class P13_Hands_of_Cards {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,Integer> cardValues=new HashMap<>();
        cardEntry(cardValues);
        Map<String,List<String>> players=new LinkedHashMap<>();
        while (true)
        {
            String[]input=sc.nextLine().split(": ");
            if(input[0].equals("JOKER"))
            {
                break;
            }
            String[] cardsvaluesSplited=input[1].split(", ");
            String name=input[0].trim();
            List<String> values=new ArrayList<>();
            for (String aCardsvaluesSplited : cardsvaluesSplited) {
                if (!values.contains(aCardsvaluesSplited)) {
                    values.add(aCardsvaluesSplited);
                }
            }
            if(!players.containsKey(name))
            {
                players.put(name,values);
            }
            else
            {   List<String> newList=new ArrayList<>();
                for (String entry:values) {
                    newList=players.get(name);
                    if(!newList.contains(entry))
                    {
                        newList.add(entry);
                    }

                }
                players.put(name,newList);
            }

        }

        for (Map.Entry<String, List<String>> player:players.entrySet())
        {
              String name=player.getKey();
              List<String> listOfCards= player.getValue();
              int score=calculateScore(listOfCards,cardValues);
            System.out.printf("%s: %d\n",name,score);
        }

    }
    private static void cardEntry(Map<String,Integer> cardValues)
    {
        cardValues.put("J",11);
        cardValues.put("Q",12);
        cardValues.put("K",13);
        cardValues.put("A",14);
    }

    private static int calculateScore(List<String> listofCards,Map<String,Integer> cardValues)

    {
        int score=0;
        for(int i=0;i<listofCards.size();i++)
        {
            String entry=listofCards.get(i);
            if(entry.length()==2)
            {
                int value=0;
                char firstEntry=entry.charAt(0);
                if(firstEntry=='K'||firstEntry=='J'||firstEntry=='Q'||firstEntry=='A')
                {
                    value=cardValues.get(String.valueOf(firstEntry));
                }
                else
                {
                    value=Integer.parseInt(String.valueOf(firstEntry));
                }
                char power=entry.charAt(1);
                int sum=0;
                if(power=='C')
                {
                    sum=value;
                }
                else if(power=='D')
                {
                    sum=value*2;
                }
                else if(power=='H')
                {
                    sum=value*3;
                }
                else if(power=='S')
                {
                    sum=value*4;
                }
                score+=sum;

            }
            else
            {   int sum=0;
                int value=10;
                char power=entry.charAt(entry.length()-1);
                if(power=='C')
                {
                    sum=value;
                }
                else if(power=='D')
                {
                    sum=value*2;
                }
                else if(power=='H')
                {
                    sum=value*3;
                }
                else if(power=='S')
                {
                    sum=value*4;
                }
                score+=sum;

            }


        }
        return score;
    }
}
