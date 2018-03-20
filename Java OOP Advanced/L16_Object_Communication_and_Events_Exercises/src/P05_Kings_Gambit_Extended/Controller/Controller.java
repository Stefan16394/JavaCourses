package P05_Kings_Gambit_Extended.Controller;

import P05_Kings_Gambit_Extended.Interfaces.Attackable;
import P05_Kings_Gambit_Extended.Interfaces.Killable;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Controller {
    private Attackable king;
    private List<Killable> killableList;

    public Controller() {
        this.killableList=new ArrayList<>();
    }

    public void setKing(Attackable king) {
        this.king = king;
    }

    public void addKillable(List<Killable> figures)
    {
        this.killableList.addAll(figures);
    }

    public void removeFigure(String name)
    {
         try {
             Killable killable=this.killableList.stream().filter(x->x.getName().equals(name)).findAny().get();
             if (killable.tryToKill())
             {
                 this.killableList.remove(killable);
             }
         }
         catch (NoSuchElementException ignored){

         }

    }

    public void attackKing()
    {
        king.receiveAttack();
        for (Killable killable:this.killableList)
        {
            killable.defendKing();
        }
    }


}
