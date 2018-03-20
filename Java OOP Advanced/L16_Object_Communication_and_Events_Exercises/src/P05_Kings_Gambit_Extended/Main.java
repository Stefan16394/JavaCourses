package P05_Kings_Gambit_Extended;

import P05_Kings_Gambit_Extended.Controller.Controller;
import P05_Kings_Gambit_Extended.Interfaces.Attackable;
import P05_Kings_Gambit_Extended.Interfaces.Killable;
import P05_Kings_Gambit_Extended.Models.Footman;
import P05_Kings_Gambit_Extended.Models.King;
import P05_Kings_Gambit_Extended.Models.RoyalGuard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
