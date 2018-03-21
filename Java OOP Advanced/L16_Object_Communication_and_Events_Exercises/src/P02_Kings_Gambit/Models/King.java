package P02_Kings_Gambit.Models;

import P02_Kings_Gambit.Interfaces.Attackable;

public class King extends BaseSoldier implements Attackable {
    public King(String name) {
        super(name);
    }

    @Override
    public void receiveAttack() {
        System.out.println(String.format("King %s is under attack!",super.getName()));
    }
}
