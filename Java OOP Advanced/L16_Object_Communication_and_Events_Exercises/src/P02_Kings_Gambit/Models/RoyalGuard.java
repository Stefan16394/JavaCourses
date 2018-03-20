package P02_Kings_Gambit.Models;

import P02_Kings_Gambit.Interfaces.Killable;

public class RoyalGuard extends BaseSoldier implements Killable {
    public RoyalGuard(String name) {
        super(name);
    }


    @Override
    public void defendKing() {
        System.out.println("Royal Guard "+super.getName()+ " is defending!");
    }
}
