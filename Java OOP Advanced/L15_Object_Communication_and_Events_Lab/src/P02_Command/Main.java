package P02_Command;

import P02_Command.Skeleton.Attacker;
import P02_Command.Skeleton.Dragon;
import P02_Command.Skeleton.Target;
import P02_Command.Skeleton.Warrior;

public class Main {
    public static void main(String[] args) {
        Attacker attacker=new Warrior("Pesho",10);
        Command attackCommand=new AttackCommand(attacker);

        Target target=new Dragon("Gosho",100,2);
        Command targetCommand=new TargetCommand(attacker,target);
        Executor executor=new CommandExecutor();
        executor.executeCommand(attackCommand);
        executor.executeCommand(targetCommand);

    }
}
