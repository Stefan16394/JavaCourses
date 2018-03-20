package P05_Kings_Gambit_Extended.Models;

import P05_Kings_Gambit_Extended.Interfaces.Killable;

public class Footman extends BaseSoldier implements Killable {
    private int hp=2;

    public Footman(String name) {
        super(name);
    }


    @Override
    public void defendKing() {
        System.out.println("Footman " +super.getName()+" is panicking!");
    }

    @Override
    public boolean tryToKill() {
        return --this.hp<=0;
    }
}
