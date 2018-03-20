package P02_Kings_Gambit.Controller;

import P02_Kings_Gambit.Interfaces.Attackable;
import P02_Kings_Gambit.Interfaces.Killable;

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
             this.killableList.remove(killable);
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
