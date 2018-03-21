package E01_Java_Advanced_Retake_Exam_03_May_2017;

import java.util.*;

public class P04_Football_Stats {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedHashMap<String,TreeMap<String,List<String>>>results=new LinkedHashMap<>();
        while(true)
        {
           // RealMadrid - Barcelona result 5:0
            String[] line=sc.nextLine().split("[ \\- ]+");
            if(line[0].equals("Season"))
            {
                break;
            }
            String firstTeam=line[0];
            String opponent=line[1];
            String resultFirstTeam=line[3];
            String resultOpponent=new StringBuilder(resultFirstTeam).reverse().toString();
            putMap(firstTeam,opponent,results,resultFirstTeam);
            putMap(opponent,firstTeam,results,resultOpponent);
        }
       String[] printTeams=sc.nextLine().split(", ");
        for (String team:printTeams)
        {
            results.entrySet().stream().filter(x->x.getKey().equals(team)).forEach(x->
            {

                x.getValue().entrySet().stream().forEach(y->
                {
                    y.getValue().forEach(c->{
                    System.out.printf("%s - ",team);
                    System.out.printf("%s -> %s\n",y.getKey(),c);

                });

                });
            });


        }

    }
    private static void putMap(String firstTeam,String opponent,LinkedHashMap<String,TreeMap<String,List<String>>> results,String result)
    {
        if(!results.containsKey(firstTeam))
        {
            TreeMap<String,List<String>> map=new TreeMap<>();
            List<String> resultNew=new ArrayList<>();
            resultNew.add(result);
            map.put(opponent,resultNew);
            results.put(firstTeam,map);
        }
        else
        {   if(results.get(firstTeam).containsKey(opponent))
              {
                 List<String> res=results.get(firstTeam).get(opponent);
                 res.add(result);
                 results.get(firstTeam).put(opponent,res);
              }
           else
              {   List<String> res2=new ArrayList<>();
                  res2.add(result);
                  results.get(firstTeam).put(opponent,res2);
              }

        }


    }

}
