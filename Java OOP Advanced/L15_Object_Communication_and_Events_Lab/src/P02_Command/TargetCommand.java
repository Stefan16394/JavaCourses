package P02_Command;


import P02_Command.Skeleton.Attacker;
import P02_Command.Skeleton.Target;

public class TargetCommand implements Command {
    private Attacker attacker;
    private Target target;

    public TargetCommand(Attacker attacker, Target target) {
        this.attacker = attacker;
        this.target = target;
    }

    @Override
    public void execute() {
        attacker.setTarget(target);
        attacker.attack();
    }
}
