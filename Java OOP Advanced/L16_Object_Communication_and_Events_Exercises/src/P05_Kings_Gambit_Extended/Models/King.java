package P05_Kings_Gambit_Extended.Models;

import P05_Kings_Gambit_Extended.Interfaces.Attackable;

public class King extends BaseSoldier implements Attackable {
    public King(String name) {
        super(name);
    }

    @Override
    public void receiveAttack() {
        System.out.println(String.format("King %s is under attack!",super.getName()));
    }
}
