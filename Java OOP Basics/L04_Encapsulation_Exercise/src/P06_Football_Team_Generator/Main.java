package P06_Football_Team_Generator;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     LinkedHashMap<String,Team> map=new LinkedHashMap<>();

     while (true)
     {
         String[] input= sc.nextLine().split(";");
         if (input[0].equals("END"))
         {
             break;
         }

         switch (input[0])
         {
             case "Team":
                try {
                    Team team=new Team(input[1]);
                    map.put(input[1],team);
                }
                catch (IllegalArgumentException e)
                {
                    System.out.println(e.getMessage());
                }
                break;

             case "Add":

                 String team=input[1];
                 if (!map.containsKey(team))
                 {
                     System.out.printf("Team %s does not exist.\n",team);
                     break;
                 }

                 String player=input[2];
                 int endurance=Integer.parseInt(input[3]);
                 int sprint=Integer.parseInt(input[4]);
                 int dribble=Integer.parseInt(input[5]);
                 int passing=Integer.parseInt(input[6]);
                 int shooting=Integer.parseInt(input[7]);

                     try {
                         Player player1=new Player(player,endurance,sprint,dribble,passing,shooting);
                         map.get(team).addPlayer(player1);
                     }
                     catch (IllegalArgumentException e)
                     {
                         System.out.println(e.getMessage());
                     }

                 break;

             case "Remove":


                try {
                    map.get(input[1]).removePlayer(input[2]);
                }
                catch (IllegalArgumentException e)
                {
                    System.out.println(e.getMessage());
                }
                break;

             case "Rating":
                 if (map.containsKey(input[1]))
                 {
                   OptionalDouble average= map.get(input[1]).getList().stream().mapToDouble(Player::getAverage).average();
                   if (average.isPresent())
                   {
                       System.out.printf("%s - %.0f\n",input[1],average.getAsDouble());
                   }
                   else {
                       System.out.printf("%s - 0\n",input[1]);
                   }
                 }
                 else
                 {
                     System.out.printf("Team %s does not exist.\n",input[1]);
                 }
                 break;
             default:break;

         }
     }
    }
}
