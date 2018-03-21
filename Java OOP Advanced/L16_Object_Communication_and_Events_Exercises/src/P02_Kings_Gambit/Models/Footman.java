package P02_Kings_Gambit.Models;

import P02_Kings_Gambit.Interfaces.Killable;

public class Footman extends BaseSoldier implements Killable {
    public Footman(String name) {
        super(name);
    }


    @Override
    public void defendKing() {
        System.out.println("Footman " +super.getName()+" is panicking!");
    }
}
