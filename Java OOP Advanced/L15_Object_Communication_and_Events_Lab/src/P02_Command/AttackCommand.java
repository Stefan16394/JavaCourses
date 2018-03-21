package P02_Command;

import P02_Command.Skeleton.Attacker;

public class AttackCommand implements Command{
    private Attacker attacker;

    public AttackCommand(Attacker attacker) {
        this.attacker = attacker;
    }

    @Override
    public void execute() {
        attacker.attack();
    }
}
