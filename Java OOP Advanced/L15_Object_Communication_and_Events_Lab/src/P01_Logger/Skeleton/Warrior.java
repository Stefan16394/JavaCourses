package P01_Logger.Skeleton;

import P01_Logger.Handler;
import P01_Logger.LogType;

public class Warrior extends AbstractHero {

    private static final String ATTACK_MESSAGE = "%s damages %s for %s";

    public Warrior(String id, int dmg, Handler handler) {
        super(id, dmg, handler);
    }

    @Override
    protected void executeClassSpecificAttack(Target target, int dmg, Handler handler) {
        handler.handle(LogType.ATTACK, String.format(ATTACK_MESSAGE,this,target,dmg));
        target.receiveDamage(dmg);
    }
}
