package P04_First_and_Reserve_Team;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        Team team=new Team("Stefko FC");
        for (int i=0;i<n;i++)
        {
            String[] input=sc.nextLine().split(" ");
            Person person=new Person(input[0],input[1],Integer.valueOf(input[2]),Double.valueOf(input[3]));
            team.addPlayer(person);
        }
        System.out.printf("First team have %d players\n",team.getFirstTeam().size());
        System.out.printf("Reserve team have %d players",team.getReserveTeam().size());

    }
}
