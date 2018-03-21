package P04_Observer.Skeleton;

import P04_Observer.Handler;
import P04_Observer.LogType;
import P04_Observer.ObservableTarget;
import P04_Observer.Observer;

public abstract class AbstractHero implements Attacker, Observer {

    private static final String TARGET_NULL_MESSAGE = "Target null";
    private static final String NO_TARGET_MESSAGE = "%s has no target";
    private static final String TARGET_DEAD_MESSAGE = "%s is dead";
    private static final String SET_TARGET_MESSAGE = "%s targets %s";

    private String id;
    private int dmg;
    private ObservableTarget target;
    private Handler handler;

    public AbstractHero(String id, int dmg, Handler handler) {
        this.id = id;
        this.dmg = dmg;
        this.handler=handler;
    }

    public void setTarget(ObservableTarget target) {
        if (target == null) {
            this.handler.handle(LogType.ERROR,TARGET_NULL_MESSAGE);
        } else {
            if (this.target != null) {
                this.target.unregister(this);
            }
            target.register(this);
            this.target = target;
            this.handler.handle(LogType.TARGET, String.format(SET_TARGET_MESSAGE, this, target));
        }
    }

    public final void attack() {
        if (this.target == null) {
            this.handler.handle(LogType.TARGET,NO_TARGET_MESSAGE);
        } else if (this.target.isDead()) {
            this.handler.handle(LogType.TARGET,String.format(TARGET_DEAD_MESSAGE,target));
        } else {
            this.executeClassSpecificAttack(this.target, this.dmg,this.handler);
        }
    }

    @Override
    public String toString() {
        return this.id;
    }

    public void update(int n)
    {
        this.handler.handle(LogType.EVENT,String.format("%s gains %dXP",this,n));
    }
    protected abstract void executeClassSpecificAttack(Target target, int dmg, Handler handler);
}
