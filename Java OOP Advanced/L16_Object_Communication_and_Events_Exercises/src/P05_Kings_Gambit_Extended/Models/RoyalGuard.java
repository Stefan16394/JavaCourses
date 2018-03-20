package P05_Kings_Gambit_Extended.Models;

import P05_Kings_Gambit_Extended.Interfaces.Killable;

public class RoyalGuard extends BaseSoldier implements Killable {
    private int hp=3;

    public RoyalGuard(String name) {
        super(name);
    }

    @Override
    public boolean tryToKill() {
        return --this.hp<=0;
    }

    @Override
    public void defendKing() {
        System.out.println("Royal Guard "+super.getName()+ " is defending!");
    }
}
