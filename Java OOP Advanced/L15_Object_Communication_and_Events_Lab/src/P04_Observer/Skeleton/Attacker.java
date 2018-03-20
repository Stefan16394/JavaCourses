package P04_Observer.Skeleton;

import P04_Observer.ObservableTarget;

public interface Attacker {
    void attack();
    void setTarget(ObservableTarget target);
}
