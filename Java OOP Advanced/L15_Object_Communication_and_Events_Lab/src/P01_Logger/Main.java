package P01_Logger;


import P01_Logger.Skeleton.Dragon;
import P01_Logger.Skeleton.Target;
import P01_Logger.Skeleton.Warrior;

public class Main {
    public static void main(String[] args) {
        CombatLogger logger=new CombatLogger();
        EventLogger logger1=new EventLogger();
        logger.setSuccessor(logger1);
        Warrior warrior=new Warrior("Pesho",10,logger);
        Target target=new Dragon("Gosho",-1,2);
        warrior.setTarget(target);
        warrior.attack();

    }
}
