package P02_Kings_Gambit;

import P02_Kings_Gambit.Controller.Controller;
import P02_Kings_Gambit.Interfaces.Attackable;
import P02_Kings_Gambit.Interfaces.Killable;
import P02_Kings_Gambit.Models.Footman;
import P02_Kings_Gambit.Models.King;
import P02_Kings_Gambit.Models.RoyalGuard;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Attackable king=new King(sc.nextLine());
        Controller controller=new Controller();
        controller.setKing(king);
        List<Killable> figures=new ArrayList<>();
        for (int i=0;i<2;i++)
        {
            String[] list=sc.nextLine().split("\\s+");
            if (i%2==0) {
                for (String name : list) {
                    Killable killable = new RoyalGuard(name);
                    figures.add(killable);
                }
            }
            else
            {
                for (String name : list) {
                    Killable killable = new Footman(name);
                    figures.add(killable);
                }
            }
        }
        controller.addKillable(figures);
        while (true)
        {
            String[] input=sc.nextLine().split(" ");
            if(input[0].equals("End"))
            {
                break;
            }
            switch (input[0])
            {
                case "Attack":
                    controller.attackKing();
                    break;
                case "Kill":
                    controller.removeFigure(input[1]);
                    break;
            }


        }
    }
}
